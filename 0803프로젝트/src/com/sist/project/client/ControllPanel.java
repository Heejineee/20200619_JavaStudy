package com.sist.project.client;

import java.awt.*;
import javax.swing.*;
public class ControllPanel extends JPanel{
   CardLayout card=new CardLayout();
   ListForm lf=new ListForm();
   //DetailForm df=new DetailForm();
   LemonForm ff;
   ClientMainFrame c;
   NewsForm nf=new NewsForm();
   public ControllPanel(ClientMainFrame c)
   {
	   this.c=c;
	   ff=new LemonForm(c);
	   setLayout(card);
	   add("FF",ff);
	   //add("DF",df);
       add("NF",nf);
	   add("LF",lf);
	   
   }
}