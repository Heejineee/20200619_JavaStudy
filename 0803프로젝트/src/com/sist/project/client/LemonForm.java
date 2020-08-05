package com.sist.project.client;
import java.awt.*;
import javax.swing.*;
import com.sist.project.data.*;
import java.util.*;//ArrayList
public class LemonForm extends JPanel{
   JButton b1,b2;
   JPanel p=new JPanel();
   LemonCard[] mc=new LemonCard[10];
   ClientMainFrame c;
   public LemonForm(ClientMainFrame c)
   {
	   this.c=c;
	   setLayout(new BorderLayout());
	   b1=new JButton("¢¸");
	   b2=new JButton("¢º");
	   
	   
	   p.setLayout(new GridLayout(2,5,5,5));
	   
	   lemonPrint(1);
	   add("West",b1);add("Center",p);add("East",b2);
   }
   public void lemonPrint(int page)
   {
	   LemonManager m=new LemonManager();
	   ArrayList<LemonVO> list=m.lemonListData(page);
	   int i=0;
	   for(LemonVO vo:list)
	   {
		   mc[i]=new LemonCard(vo.getTitle(),vo.getPoster());
		   p.add(mc[i]);
		   mc[i].addMouseListener(c);
		   i++;
	   }
   }
}

