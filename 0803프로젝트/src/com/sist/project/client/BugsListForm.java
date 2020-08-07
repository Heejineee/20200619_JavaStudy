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
      setLayout(null);   // FlowLayout ==> null값 주게 되면 사용자 정의 배치가 됨(안쓰면 다 - - - - 이렇게 일자로 배치됨) 
      b1=new JButton("실시간");
      b2=new JButton("일간");
      b3=new JButton("주간");
      b4=new JButton("검색");
      b1.setFont(new Font("맑은 고딕",Font.BOLD,12));
      b2.setFont(new Font("맑은 고딕",Font.BOLD,12));
      b3.setFont(new Font("맑은 고딕",Font.BOLD,12));
      b4.setFont(new Font("맑은 고딕",Font.BOLD,12));
      tf=new JTextField(20);
      JPanel p=new JPanel();
      p.add(b1);p.add(b2);p.add(b3);p.add(tf);p.add(b4);   // add 한 순서대로 배치됨!
      p.setBounds(10,25,900,35);
      add(p);
      String[] col= {"번호","제목","아티스트"};
      Object[][] row=new Object[0][3];
	   p.setBackground(Color.white);
      // DefaultTableModel => 오버라이딩 할 메소드가 있다(익명의 클래스 => 내부클래스)
      /*
       *    내부 클래스 : 쓰레드, 네트워크 에서 많이 쓰임
       *       class A
       *       {
       *          ABCDEFG(데이터) // 이 데이터를 A와 B 클래스에서 쓸 수 있음
       *          class B{   // B는 멤버클래스 라고 함
       *          }
       *       }
       */
      model=new DefaultTableModel(row,col) {
         // 편집 불가능하게 isCellEditable
         @Override
         public boolean isCellEditable(int row, int column) {
            // TODO Auto-generated method stub
            return false;
         }
         // 이미지 첨부할 때 getColumnClass
         //@Override
			/*
			 * public Class<?> getColumnClass(int columnIndex) { // TODO Auto-generated
			 * method stub return getValueAt(0,columnIndex).getClass(); }
			 */
         
      };
      table=new JTable(model);
      table.setRowHeight(50);
      table.setFont(new Font("맑은 고딕",Font.PLAIN,12));
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
      // 데이터 가지고 오기
      BugsManager2 m=new BugsManager2();   // 얘가 인스턴스 변수라서 이렇게 가져와야 함
      ArrayList<BugsVO> list=m.BugsAllData(cno);
      
      // 테이블 한 번 지우기(마지막 부터 지워야 함)
      for(int i=model.getRowCount()-1; i>=0; i--)   // getRowCount가 전체 데이터 수
      {
         model.removeRow(i);
      }
      
      // 데이터 출력
      /*
       *    java.io, java.net => CheckException ==> 반드시 예외처리
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
   BugsManager2 m=new BugsManager2();   // 얘가 인스턴스 변수라서 이렇게 가져와야 함
   ArrayList<BugsVO> list=m.BugsFindData(ss);
   
   // 테이블 한 번 지우기(마지막 부터 지워야 함)
   for(int i=model.getRowCount()-1; i>=0; i--)   // getRowCount가 전체 데이터 수
   {
      model.removeRow(i);
   }
   
   // 데이터 출력
   /*
    *    java.io, java.net => CheckException ==> 반드시 예외처리
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