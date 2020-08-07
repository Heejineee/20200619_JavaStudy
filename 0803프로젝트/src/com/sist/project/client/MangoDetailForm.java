package com.sist.project.client;
import java.awt.*;
import java.net.URL;
import javax.swing.*;

import java.util.*;
public class MangoDetailForm extends JPanel{
	   JLabel poster=new JLabel();
	   JLabel la1=new JLabel();
	   JLabel la2=new JLabel();
	   JLabel la3=new JLabel();
	   JTextPane ta=new JTextPane();
	   JButton b1,b2;
	   public MangoDetailForm()
	   {
		   setBackground(Color.white);
		   setLayout(null);
		   poster.setBounds(10, 65, 330, 400);
		   add(poster);
		   la1.setBounds(350, 65, 330, 45);
		   la1.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,33));
		   add(la1);
		   JPanel p=new JPanel();
		   p.setLayout(new GridLayout(3,1,5,5));
		   String[] str={"°¡°Ô¸í","ÆòÁ¡","À§Ä¡","ÈÄ±â"}; 
		   la2.setFont(new Font("¸¼Àº °íµñ",Font.ITALIC,28));
		   la2.setForeground(Color.pink);
		   la3.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,15));
		   p.add(la2);p.add(la3);
		   p.setBounds(350, 115, 330, 100);
		   add(p);
		   p.setBackground(Color.white);
		   
		   ta.setEditable(false);
		   JScrollPane js=new JScrollPane(ta);
		   js.setBounds(350, 220, 330, 150);
		   add(js);
		   
		   b1=new JButton("¿¹¾à");
		   b2=new JButton("¸ñ·Ï");
		   b1.setBackground(Color.orange);
		   b2.setBackground(Color.green);
		   JPanel p2=new JPanel();
		   p2.add(b1);
		   p2.add(b2);
		   p2.setBounds(350, 400, 330, 35);
		   add(p2);
		   p2.setBackground(Color.white);
	   }
	   
	   public void detailPrint(int mno)
	   {
		   setBackground(Color.white);
		   MangoManager m=new MangoManager();
		   MangoVO vo=m.MangoDetailData(mno);
		   la1.setText(vo.getTitle());
		   try
		   {
			   URL url=new URL(vo.getImg());
			   Image img=ClientMainFrame.getImage(new ImageIcon(url), 
					   poster.getWidth(), poster.getHeight());
			   poster.setIcon(new ImageIcon(img));
		   }catch(Exception ex) {}
		   la2.setText("ÆòÁ¡:"+vo.getReview());
		   la3.setText("À§Ä¡:"+vo.getPlace());
		   ta.setText(vo.getContent());
		   ta.setFont(new Font("¸¼Àº °íµñ",Font.PLAIN,12));
	   }
}