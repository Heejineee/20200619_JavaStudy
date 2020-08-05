package com.sist.client;
import javax.swing.*;
import java.awt.*;	
import java.awt.event.*;
public class LemonMain extends JFrame implements ActionListener{
	CardLayout card=new CardLayout();
	MenuForm mf=new MenuForm();
	MainMenu mm=new MainMenu();
	Login login=new Login();
	JoinForm join=new JoinForm();
	public LemonMain() {

		mf.setOpaque(false);
		mm.setOpaque(false);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		mm.setBounds(10, 10, 1550, 60);
		add(mm);
		mf.setBounds(10, 160, 1550, 50);
		add(mf);
		setLayout(card);
		add("LOGIN",login);
		add("JOIN",join);
	
		
		setSize(1600,1000);
		setVisible(true);
		
		login.b1.addActionListener(this);
		join.b2.addActionListener(this);
	}
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		new LemonMain();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b1)
		{
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==join.b2)
		{
			card.show(getContentPane(), "LOGIN");
		}
	}

}
 