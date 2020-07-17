package com.sist.client;
import javax.swing.*;
import java.awt.*;	
import java.awt.event.*;
public class LemonMain extends JFrame {
	MenuForm mf=new MenuForm();
	MainMenu mm=new MainMenu();

	public LemonMain() {

		mf.setOpaque(false);
		mm.setOpaque(false);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		mm.setBounds(10, 10, 1550, 60);
		add(mm);
		mf.setBounds(10, 160, 1550, 50);
		add(mf);
		 
	
		
		setSize(1600,1000);
		setVisible(true);
		
		
	}
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		new LemonMain();
	}

}
 