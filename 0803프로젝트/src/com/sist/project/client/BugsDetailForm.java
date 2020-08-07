package com.sist.project.client;
import com.sist.project.data.*;
import java.awt.*;
import java.net.URL;

import javax.swing.*;

import com.sist.project.data.BugsVO;

import java.util.*;

public class BugsDetailForm extends JPanel{
	JLabel poster=new JLabel();
	JLabel la1=new JLabel();
	JLabel[] la=new JLabel[7];
	JTextPane ta=new JTextPane();
	JButton b1,b2;
	public BugsDetailForm()
	{
		   setBackground(Color.white);
		setLayout(null);
		poster.setBounds(10, 15, 350, 400);
		poster.setOpaque(true);
		poster.setBackground(Color.red);
		add(poster);
		poster.setBackground(Color.white);
		la1.setBounds(365, 15, 500, 45);
		la1.setOpaque(true);
		la1.setFont(new Font("���� ���",Font.BOLD,25));
		la1.setBackground(Color.white);		
		add(la1);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(4,1,5,5));
		String[] str= {"����","��Ƽ��Ʈ","�帣"};
		for(int i=0;i<3;i++)
		{
			la[i]= new JLabel(str[i]);
			la[i].setFont(new Font("���� ���",Font.BOLD,20));
			p.add(la[i]);
		}
		p.setBounds(365,80,500,300);
		add(p);
		p.setFont(new Font("���� ���",Font.BOLD,10));
		   p.setBackground(Color.white);
	    /*ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
	    js.setBounds(10, 420, 700, 120);
	    add(js);
	    */
	    
	    /*b1=new JButton("����");
	    b2=new JButton("���");
	    b1.setBackground(Color.red);
	    b2.setBackground(Color.green);
	    JPanel p2=new JPanel();
	    p2.add(b1);
	    p2.add(b2);
	    p2.setBounds(365, 385, 200, 35);
	    add(p2);
	    */
	    
	}
	public void detailPrint(int mno)
	{
		   setBackground(Color.white);
		BugsManager2 m=new BugsManager2();
		BugsVO vo=m.BugsDetailData(mno);
		la1.setText(vo.getTitle());
		try
		{
			URL url=new URL(vo.getPoster());
			Image img=ClientMainFrame.getImage(new ImageIcon(url),
					poster.getWidth(), poster.getHeight());
			poster.setIcon(new ImageIcon(img));
		}
		catch (Exception ex) {}
		
			la[0].setText("����:"+vo.getTitle());
			la[1].setText("��Ƽ��Ʈ:"+vo.getArtist());
			la[2].setText("�帣:"+vo.getGenre());		
		
	}

}