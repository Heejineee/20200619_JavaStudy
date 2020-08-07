package com.sist.project.client;
import javax.swing.*;

import com.sist.project.data.LemonManager;
import com.sist.project.data.LemonVO;
import com.sist.project.data.MovieVO;

import java.awt.*;
import java.net.*;//URL 
public class DetailForm extends JFrame{
   JLabel poster=new JLabel();
   JLabel la1=new JLabel("",JLabel.CENTER);
   JLabel[] la=new JLabel[3];
   JTextPane ta=new JTextPane();
   public DetailForm()
   {
	   setBackground(Color.white);
	   setLayout(null);
	   poster.setBounds(10, 15, 350, 450);
	   add(poster);
	   la1.setBounds(365, 15, 500, 45);
	   la1.setFont(new Font("讣篮 绊雕",Font.BOLD,40));
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
	   js.setBounds(10, 470,855, 150);
	   add(js);
	   
	   setSize(900, 670);
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
	   
	   la[0].setText("力格 : "+vo.getTitle());
	   la[1].setText("林家 : "+vo.getAddress());
	   la[2].setText("啊拜 : "+vo.getPrice());
	   ta.setText(vo.getStory());
	   
   }
}