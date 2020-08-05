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
		   setLayout(null);
		   poster.setBounds(10, 15, 350, 400);
		   add(poster);
		   la1.setBounds(365, 15, 500, 45);
		   la1.setFont(new Font("讣篮 绊雕",Font.BOLD,35));
		   add(la1);
		   JPanel p=new JPanel();
		   p.setLayout(new GridLayout(7,1,5,5));
		   String[] str={"力格","林家","啊拜"};
		   for(int i=0;i<3;i++)
		   {
			   la[i]=new JLabel(str[i]);
			   la[i].setFont(new Font("讣篮 绊雕",Font.BOLD,30));
			   p.add(la[i]);
		   }
		   p.setBounds(365, 80, 500, 300);
		   add(p);
		   
		   ta.setEditable(false);
		   JScrollPane js=new JScrollPane(ta);
		   js.setBounds(10, 420,700, 130);
		   add(js);
		   
	   }
	   public void detailPrint(int mno)
	   {
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
		   
		   la[0].setText("力格 : "+vo.getTitle());
		   la[1].setText("林家 : "+vo.getAddress());
		   la[2].setText("啊拜 : "+vo.getPrice());
		   ta.setText(vo.getStory());
		   
	   }
}


