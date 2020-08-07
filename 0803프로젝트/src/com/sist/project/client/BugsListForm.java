package com.sist.project.client;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;
import com.sist.project.data.*;
import java.net.*;
public class BugsListForm extends JPanel implements MouseListener{
   JButton b1,b2,b3,b4;
   JTextField tf;
   JTable table;
   DefaultTableModel model;
   BugsDetailForm bdf=new BugsDetailForm();
   public BugsListForm()
   {
	   setBackground(Color.white);
      setLayout(null);   // FlowLayout ==> null�� �ְ� �Ǹ� ����� ���� ��ġ�� ��(�Ⱦ��� �� - - - - �̷��� ���ڷ� ��ġ��) 
      b1=new JButton("�ǽð�");
      b2=new JButton("�ϰ�");
      b3=new JButton("�ְ�");
      b4=new JButton("�˻�");
      b1.setFont(new Font("���� ���",Font.BOLD,12));
      b2.setFont(new Font("���� ���",Font.BOLD,12));
      b3.setFont(new Font("���� ���",Font.BOLD,12));
      b4.setFont(new Font("���� ���",Font.BOLD,12));
      tf=new JTextField(20);
      JPanel p=new JPanel();
      p.add(b1);p.add(b2);p.add(b3);p.add(tf);p.add(b4);   // add �� ������� ��ġ��!
      p.setBounds(10,25,900,35);
      add(p);
      String[] col= {"��ȣ","����","��Ƽ��Ʈ"};
      Object[][] row=new Object[0][3];
	   p.setBackground(Color.white);
      // DefaultTableModel => �������̵� �� �޼ҵ尡 �ִ�(�͸��� Ŭ���� => ����Ŭ����)
      /*
       *    ���� Ŭ���� : ������, ��Ʈ��ũ ���� ���� ����
       *       class A
       *       {
       *          ABCDEFG(������) // �� �����͸� A�� B Ŭ�������� �� �� ����
       *          class B{   // B�� ���Ŭ���� ��� ��
       *          }
       *       }
       */
      model=new DefaultTableModel(row,col) {
         // ���� �Ұ����ϰ� isCellEditable
         @Override
         public boolean isCellEditable(int row, int column) {
            // TODO Auto-generated method stub
            return false;
         }
         // �̹��� ÷���� �� getColumnClass
         //@Override
			/*
			 * public Class<?> getColumnClass(int columnIndex) { // TODO Auto-generated
			 * method stub return getValueAt(0,columnIndex).getClass(); }
			 */
         
      };
      table=new JTable(model);
      table.setRowHeight(50);
      table.setFont(new Font("���� ���",Font.PLAIN,12));
      JScrollPane js=new JScrollPane(table);
      js.setBounds(10, 70, 700, 550);
      add(js);
      js.setBackground(Color.white);
      bdf.setBounds(715, 70, 800, 650);
      add(bdf);
      BugsAllData(1);
      bdf.detailPrint(1);
      
      table.addMouseListener(this);
      table.setBackground(Color.WHITE);
      
   }
   public void BugsAllData(int cno)
   {
      // ������ ������ ����
      BugsManager2 m=new BugsManager2();   // �갡 �ν��Ͻ� ������ �̷��� �����;� ��
      ArrayList<BugsVO> list=m.BugsAllData(cno);
      
      // ���̺� �� �� �����(������ ���� ������ ��)
      for(int i=model.getRowCount()-1; i>=0; i--)   // getRowCount�� ��ü ������ ��
      {
         model.removeRow(i);
      }
      
      // ������ ���
      /*
       *    java.io, java.net => CheckException ==> �ݵ�� ����ó��
       */
      for(BugsVO vo:list)
      {
         try
            {
               URL url=new URL(vo.getPoster());
               Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
               Object[] data= {
                     vo.getMno(),
						/* new ImageIcon(img), */
                     vo.getTitle(),
                     vo.getArtist(),
                     vo.getAlbumtitle(),
                     vo.getGenre()
               };
               
            model.addRow(data);
            
            }catch(Exception ex) {}
      }
      
   }
   public void BugsFindData(String ss)
   {
   BugsManager2 m=new BugsManager2();   // �갡 �ν��Ͻ� ������ �̷��� �����;� ��
   ArrayList<BugsVO> list=m.BugsFindData(ss);
   
   // ���̺� �� �� �����(������ ���� ������ ��)
   for(int i=model.getRowCount()-1; i>=0; i--)   // getRowCount�� ��ü ������ ��
   {
      model.removeRow(i);
   }
   
   // ������ ���
   /*
    *    java.io, java.net => CheckException ==> �ݵ�� ����ó��
    */
   for(BugsVO vo:list)
   {
      try
         {
            URL url=new URL(vo.getPoster());
            Image img=ClientMainFrame.getImage(new ImageIcon(url), 50, 50);
            Object[] data= {
                  vo.getMno(),
					/* new ImageIcon(img), */
                  vo.getTitle(),
                  vo.getArtist(),
                  vo.getAlbumtitle(),
                  vo.getGenre()
                 
            };
         model.addRow(data);
         }catch(Exception ex) {}
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
			bdf.detailPrint(Integer.parseInt(mno));
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