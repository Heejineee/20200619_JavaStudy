package com.sist.project.client;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
    JButton b1,b2,b3,b4,b5,b6,b7;
    // ÃÊ±âÈ­ (¹öÆ°) ==> ¹èÄ¡ (»ý¼ºÀÚ)
    public MenuForm()
    {
 	   setBackground(Color.white);
    	b1=new JButton("µÑ·¯º¸±â");
    	b1.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,15));
    	b2=new JButton("µ¿³×¸¶ÄÏ");
    	b2.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,15));
    	b3=new JButton("µ¿³×Æ©ÅÍ");
    	b3.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,15));
    	b4=new JButton("µ¿³×Ä«Æä");
    	b4.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,15));
    	b5=new JButton("µ¿³×¹ÂÁ÷");
    	b5.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,15));
    	b6=new JButton("µ¿³×¼Ò½Ä");
    	b6.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,15));
    	b7=new JButton("Á¾·á");
    	b7.setFont(new Font("¸¼Àº °íµñ",Font.BOLD,15));
    	
    	setLayout(new GridLayout(7, 1,5,5));
    	add(b1);
    	add(b2);
    	add(b3);
    	add(b4);
    	add(b5);
    	add(b6);
    	add(b7);
    }
}




