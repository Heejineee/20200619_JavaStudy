package com.sist.client;
import java.awt.*;
import javax.swing.*;

public class MenuForm extends JPanel {
	JButton b1,b2,b3,b4,b5,b6,b7;
	public MenuForm()
	{
		b1=new JButton("��ü�Ź�");
		b1.setFont(new Font("���� ����",Font.PLAIN,20));
		b2=new JButton("�α�Ź�");
		b2.setFont(new Font("���� ����",Font.PLAIN,20));
		b3=new JButton("�м���ȭ");
		b3.setFont(new Font("���� ����",Font.PLAIN,20));
		b4=new JButton("���ڱ��");
		b4.setFont(new Font("���� ����",Font.PLAIN,20));
		b5=new JButton("����/��Ȱ");
		b5.setFont(new Font("���� ����",Font.PLAIN,20));
		b6=new JButton("����/����");
		b6.setFont(new Font("���� ����",Font.PLAIN,20));
		b7=new JButton("���ᳪ��");
		b7.setFont(new Font("���� ����",Font.PLAIN,20));
		
		setLayout(new GridLayout(1,7,10,10));
		add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);
	}
}
