package com.sist.project.client;

import javax.swing.*;
import com.sist.project.data.talingManager;
import com.sist.project.data.talingVO;
import java.awt.*;
import java.net.URL;
import java.util.*;

public class talingDetailForm extends JPanel {
	JLabel poster=new JLabel();
	JLabel la1=new JLabel("",JLabel.LEFT);
	JLabel[] la=new JLabel[4]; 
	JTextPane ta=new JTextPane();
	JButton b1,b2;
	public talingDetailForm()
	{
		setBackground(Color.white);
		setLayout(null);
		poster.setBounds(10, 15, 350, 400);
		add(poster);
		la1.setBounds(365,15, 500, 45);
		la1.setFont(new Font("���� ���",Font.BOLD,25));
		add(la1);
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(3,1,5,5));
		   p.setBackground(Color.white);
		String[] str= {"Ʃ��","����","�ð�","���"};
		p.setFont(new Font("���� ���",Font.BOLD,11));
		for(int i=0;i<3;i++)
		{
			la[i]=new JLabel(str[i]);
			la[i].setFont(new Font("���� ���",Font.BOLD,20));
			p.add(la[i]);
			
		}
		p.setBounds(365, 80, 500, 300);
		add(p);
		
		ta.setEditable(false);//��ȭ����â�ȿ� �����Է� �Ұ�-��Ȱ��ȭ :�����Ұ�
		JScrollPane js=new JScrollPane(ta);
		js.setBounds(10, 420, 700, 130);
		add(js);
		
		b1=new JButton("��û�ϱ�");
		b2=new JButton("���");
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		JPanel p2=new JPanel();
		p2.add(b1);
		p2.add(b2);
		p2.setBounds(365, 385, 200, 35);
		add(p2);
		p2.setBackground(Color.white);
	}
	public void detailPrint(int lno)
	{
		   setBackground(Color.white);
		talingManager m=new talingManager();
		talingVO vo=m.talingDetailData(lno);
		la1.setText("Ʃ��:"+vo.getName());
		
		  try 
		  { 
			  URL url=new URL(vo.getImage()); 
			  Image img=ClientMainFrame.getImage(new ImageIcon(url), poster.getWidth(), poster.getHeight()); 
			  poster.setIcon(new ImageIcon(img)); 
		  }catch(Exception ex) {}
		 
		
			la[0].setText("���:"+vo.getSpot());
			la[1].setText("����:"+vo.getPrice());
			la[2].setText("�ð�:"+vo.getTime());
		
		ta.setText(vo.getInfo());

		   ta.setFont(new Font("���� ���",Font.PLAIN,12));
	}
}