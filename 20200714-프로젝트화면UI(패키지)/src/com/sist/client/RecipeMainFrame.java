package com.sist.client;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sist.common.*;
/*
 * 자바 패키지 => java, javax
 */
public class RecipeMainFrame extends JFrame implements ActionListener{
	//	JFrame f=new JFrame(); ==> extends JFrame 대신 이렇게도 쓸 수 있지만 그럼 변경이 불가함
	CardLayout card=new CardLayout();
	Login login=new Login();
	JoinForm join=new JoinForm();
	RecipeManager rm=new RecipeManager();
	public RecipeMainFrame()
	{
		// GUI의 화면 디자인, 변수 초기화, 데이터베이스 연결, 서버연결, 쓰레드 동작
		// Layout => 화면 배치
		setLayout(card);
		// 화면 추가
		//add("RM",rm);
		add("LOGIN",login);
		add("JOIN",join);
		setSize(1024,960);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		login.b2.addActionListener(this);
		join.b3.addActionListener(this);
		
	}
	public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new RecipeMainFrame();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==join.b3)
		{
			card.show(getContentPane(), "LOGIN");
		}
	}

}
