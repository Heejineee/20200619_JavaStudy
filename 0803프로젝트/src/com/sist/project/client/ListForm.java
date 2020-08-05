package com.sist.project.client;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import com.sist.project.data.*;
import javax.swing.*;
import javax.swing.table.*;
import java.net.*;
public class ListForm extends JPanel implements MouseListener{
   JButton b1,b2,b3,b4,b5,b6;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   LemonDetailForm ldf=new LemonDetailForm();
   /*
    *    ��� => �޼ҵ� ==> ������ , �Ű����� 
    */
   public ListForm()
   {
	   setLayout(null);// FlowLayout => null ����� ���� ��ġ
	   b1=new JButton("����Ư����");
	   b2=new JButton("�λ걤����");
	   b3=new JButton("�뱸������");
	   b4=new JButton("��õ������");
	   b5=new JButton("���ֱ�����");
	   b6=new JButton("�˻�");
	   tf=new JTextField(20);
	   JPanel p=new JPanel();
	   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(tf);p.add(b6);
	   p.setBounds(10, 25, 900, 35);
	   add(p);
	   String[] col={"��ȣ","�̹���","����","�ּ�","����"};
	   Object[][] row=new Object[0][5];

	   
	   model=new DefaultTableModel(row,col) {
        // ������ �Ұ��� 
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
	        // �̹��� ÷�� 
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0, columnIndex).getClass();
			}
		   
	   };
	   
	   table=new JTable(model);
	   table.setRowHeight(50);
	   JScrollPane js=new JScrollPane(table);
	   
	   js.setBounds(10, 70, 700, 550);
	   add(js);
	   
	   ldf.setBounds(715,70 , 800, 650);
	   add(ldf);
	   lemonAllData(1);
	   ldf.detailPrint(1);
	   
	   table.addMouseListener(this);
   }
   public void lemonAllData(int cno)
   {
	   
	   LemonManager m=new LemonManager();
	   ArrayList<LemonVO> list=m.lemonAllData(cno);

	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }

	   for(LemonVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getPoster());
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={
					   vo.getMno(),
					 new ImageIcon(img),
					 vo.getTitle(),
					 vo.getAddress(),
					 vo.getPrice()
			   };
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
   
   public void lemonFindData(String ss)
   {

	   LemonManager m=new LemonManager();
	   ArrayList<LemonVO> list=m.lemonFindData(ss);
	   
	   for(int i=model.getRowCount()-1;i>=0;i--)
	   {
		   model.removeRow(i);
	   }
	
	   for(LemonVO vo:list)
	   {
		  try
		  {
			   URL url=new URL(vo.getPoster());
			   Image img=ClientMainFrame.getImage(new ImageIcon(url),
					   50, 50);
			   Object[] data={
					   vo.getMno(),
					 new ImageIcon(img),
					 vo.getTitle(),
					 vo.getAddress(),
					 vo.getPrice()
			   };
			   model.addRow(data);
		  }catch(Exception ex){ex.printStackTrace();}
	   }
   }
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==table)
	{
		if(e.getClickCount()==2)
		{
			int row=table.getSelectedRow();
			String mno=model.getValueAt(row, 0).toString();
			ldf.detailPrint(Integer.parseInt(mno));
		}
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}


