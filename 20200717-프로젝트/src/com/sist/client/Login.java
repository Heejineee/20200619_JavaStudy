package com.sist.client;
import javax.swing.*;
import java.awt.*;

public class Login extends JPanel {
	   private JLabel la1,la2;
		JTextField tf;
	   JPasswordField pf;
	   JButton b1,b2;
	   public Login()
	   {
		   setLayout(null);
		   la1=new JLabel("아이디",JLabel.RIGHT);
		   la1.setBounds(745, 775, 80, 30);
		   tf=new JTextField();
		   tf.setBounds(830, 775, 150, 30);
		   
		   add(la1);add(tf);
		   
		   la2=new JLabel("비밀번호",JLabel.RIGHT);
		   la2.setBounds(745, 810, 80, 30);
		   pf=new JPasswordField();
		   pf.setBounds(830, 810, 150, 30);
		   // 980-745= 235
		   add(la2);add(pf);
		   
		   b1=new JButton("로그인");
		   b2=new JButton("회원가입");
		   JPanel p=new JPanel();
		   p.add(b1);
		   p.add(b2);
		   p.setOpaque(false);
		   p.setBounds(745, 850, 235, 35);
		   add(p);
		   
	   }
}

