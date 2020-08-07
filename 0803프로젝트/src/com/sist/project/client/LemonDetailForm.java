package com.sist.project.client;
import java.awt.*;
import java.net.URL;

import javax.swing.*;

import com.sist.project.data.LemonManager;
import com.sist.project.data.LemonVO;
import com.sist.project.data.MovieVO;

import java.util.*;
public class LemonDetailForm extends JPanel{
	   JLabel poster=new JLabel();
	   JLabel la1=new JLabel();
	   JLabel[] la=new JLabel[7];
	   JTextPane ta=new JTextPane();
	   public LemonDetailForm()
	   {
		   setBackground(Color.white);
		   setLayout(null);
		   poster.setBounds(10, 15, 350, 400);
		   add(poster);
		   la1.setBounds(365, 15, 500, 45);
		   la1.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,25));
		   add(la1);
		   JPanel p=new JPanel();
		   p.setLayout(new GridLayout(7,1,5,5));
		   String[] str={"¡¶∏Ò","¡÷º“","∞°∞›"};
		   p.setBackground(Color.white);
		   p.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,10));
		   for(int i=0;i<3;i++)
		   {
			   la[i]=new JLabel(str[i]);
			   la[i].setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,20));
			   p.add(la[i]);
		   }
		   p.setBounds(365, 80, 500, 300);
		   add(p);
		   
		   ta.setEditable(false);
		   JScrollPane js=new JScrollPane(ta);
		   js.setBounds(10, 420,700, 130);
		   add(js);
		   js.setBackground(Color.white);
	   }
	   public void detailPrint(int mno)
	   {
		   setBackground(Color.white);
		   LemonManager m=new LemonManager();
		   LemonVO vo=m.lemonDetailData(mno);
		   la1.setText(vo.getTitle());
		   try
		   {
			   URL url=new URL(vo.getPoster());
			   Image img=ClientMainFrame.getImage(new ImageIcon(url), 
					   poster.getWidth(), poster.getHeight());
			   poster.setIcon(new ImageIcon(img));
		   }catch(Exception ex) {}
		   
		   la[0].setText("¡¶∏Ò : "+vo.getTitle());
		   la[1].setText("¡÷º“ : "+vo.getAddress());
		   la[2].setText("∞°∞› : "+vo.getPrice());
		   ta.setText(vo.getStory());
		   ta.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.PLAIN,12));
		   
	   }
}


