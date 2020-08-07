package com.sist.project.client;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
public class MangoListForm extends JPanel implements MouseListener{
   JButton b1,b2,b3,b4,b5,b6;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   MangoDetailForm mgf=new MangoDetailForm();

   public MangoListForm()
   {
	   setBackground(Color.white);
	   setLayout(null);
	   b1=new JButton("¼­ÃÌÄ«Æä");
	   b2=new JButton("Á¦ÁÖÄ«Æä");
	   b3=new JButton("ºù¼ö¸ÀÁý");
	   b4=new JButton("¾çÆòÄ«Æä");
	   b5=new JButton("Æ¼¶ó¹Ì¼ö¸ÀÁý");
	   b6=new JButton("°Ë»ö");
		b1.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,12));
		b2.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,12));
		b3.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,12));
		b4.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,12));
		b5.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,12));
		b6.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,12));
	   tf=new JTextField(20);
	   JPanel p=new JPanel();
	   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
	   p.setBounds(220, 25, 900, 35);
	   add(p);
	   p.setBackground(Color.white);
	   String[] col={"¹øÈ£","¹Ì¸®º¸±â","°¡°Ô¸í","ÆòÁ¡","ÁÖ¼Ò"};
	   Object[][] row=new Object[0][4]; // [0][5]->[0][4]
	    
	   model=new DefaultTableModel(row,col) { 
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return getValueAt(0, columnIndex).getClass();
			}
		   
	   };
	   
	   table=new JTable(model);
	   table.setRowHeight(50);
	   JScrollPane js=new JScrollPane(table);
	   table.setBackground(Color.WHITE);
	   table.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,12));
	   js.setBounds(10, 70, 700, 550);
	   add(js);
	   
	   mgf.setBounds(715,70 , 800, 650);
	   add(mgf);
	   MangoAllData(1);
	   mgf.detailPrint(1);
	   
	   table.addMouseListener(this);
   }
   
   public void MangoAllData(int cno)
   {
	   MangoManager m=new MangoManager();
	   ArrayList<MangoVO> list=m.MangoAllData(cno);
	   
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }

	   for(MangoVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getImg());
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={
					 vo.getMno(),
					 new ImageIcon(img),
					 vo.getTitle(),
					 vo.getReview(),
					 vo.getPlace()
			   };
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
   
   public void MangoFindData(String ss)
   {
	   MangoManager m=new MangoManager();
	   ArrayList<MangoVO> list=m.MangoFindData(ss);

	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	   
	   for(MangoVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getImg());
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={
					 vo.getMno(),
					 new ImageIcon(img),
					 vo.getTitle(),
					 vo.getReview(),
					 vo.getPlace()
			   };
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
   
@Override
public void mouseClicked(MouseEvent e) {
	if(e.getSource()==table)
	{
		if(e.getClickCount()==2)
		{
			int row=table.getSelectedRow();
			String mno=model.getValueAt(row, 0).toString();
			mgf.detailPrint(Integer.parseInt(mno));
		}
	}
}
@Override
public void mousePressed(MouseEvent e) {
	
}
@Override
public void mouseReleased(MouseEvent e) {
	
}
@Override
public void mouseEntered(MouseEvent e) {
	
}
@Override
public void mouseExited(MouseEvent e) {
	
}
}