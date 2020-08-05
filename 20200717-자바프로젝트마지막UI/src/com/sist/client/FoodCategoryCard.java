package com.sist.client;

import javax.swing.*;
import java.awt.*;
import java.net.*;
// JLabel로 하면 이미지 위에 글자 못 올려서 JPanel 씀
public class FoodCategoryCard extends JPanel{
	String title,subject,poster;
	Image img;
	public FoodCategoryCard(String title,String subject,String poster)
	{
		this.title=title;
		this.subject=subject;
		this.poster=poster;
		try
		{
			img=Toolkit.getDefaultToolkit().getImage(new URL(poster));
		}catch(Exception ex) {}
	}
	public void paint(Graphics g)
	{
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		g.setColor(Color.white);
		g.setFont(new Font("맑은 고딕",Font.BOLD,15));
		g.drawString(title, 10, 100);
		g.drawString(subject, 50, 150);
	}
}
