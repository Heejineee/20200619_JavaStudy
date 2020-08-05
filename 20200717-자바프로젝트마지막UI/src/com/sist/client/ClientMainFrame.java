package com.sist.client;
//	윈도우 => JFrame ==>  윈도우와 관련된 클래스를 읽어온다
import javax.swing.*;	// 윈도우 관련
import java.awt.*;		// Color, Layout 등 배치 관련
import java.awt.event.*;	// interface
/*
 * 	재사용
 * 		- 상속(is-a) : 기존의 클래스를 변경해서 사용
 * 			public class ClientMainFrame extends JFrame
 * 								------------------------
 * 								JFrame의 기능을 전체 가지고 온다
 * 			ex) class A
 * 				  {
 * 						O X W
 * 				  }
 * 				  class B extends A
 * 				  {
 * 						O X W
 * 				  }
 * 				
 * 		- 포함(has-a) : 기존의 클래스를 변경 없이 사용
 * 			ex) public class ClientMainFrame
 * 					{
 * 						JFrame f=new JFrame();
 * 					}
 */		
public class ClientMainFrame extends JFrame implements ActionListener{
	// 윈도우 크기 결정 => 생성자에서 사용
	JLabel title=new JLabel("레시피 & 맛집 추천",JLabel.CENTER); 
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp=new ControlPanel();
	
	public ClientMainFrame() // 생성자
	{
		/*
		 * 	클래스에서 생성자 사용 => 선언이 아니라 구현할 때
		 * 	ex) 데이터베이스 : 오라클 연결
		 * 		  네트워크 : 셋팅 => IP, Port => 핸드폰(개통)
		 * 		  웹 : 쿠키에서 값 읽기 => 자동 로그인
		 */
		title.setFont(new Font("맑은 고딕",Font.BOLD,55));
		title.setOpaque(true); // 불투명하게
		setLayout(null);	// JFrame (borderLayout) 사용자 정의로 배치 => null ==> 내 맘대로 배치하고 싶을 때 null값 주기
		title.setBounds(10, 15, 1570, 100);
		// 윈도우에 추가(add)
		add(title);
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		
		// 채팅폼
		cf.setBounds(115,760,1465,200);
		add(cf);
		
		// 출력화면
		cp.setBounds(115,120,1465,635);
		add(cp);
		setSize(1600,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 	// X버튼 클릭시 종료
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 생성자는 호출시에 반드시 new 생성자()
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "DF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
	}

}
