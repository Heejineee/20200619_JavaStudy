package com.sist.project.client;
import java.awt.*;
import javax.swing.*;
public class MenuForm extends JPanel {
    JButton b1,b2,b3,b4,b5,b6,b7;
    // �ʱ�ȭ (��ư) ==> ��ġ (������)
    public MenuForm()
    {
 	   setBackground(Color.white);
    	b1=new JButton("�ѷ�����");
    	b1.setFont(new Font("���� ���",Font.BOLD,15));
    	b2=new JButton("���׸���");
    	b2.setFont(new Font("���� ���",Font.BOLD,15));
    	b3=new JButton("����Ʃ��");
    	b3.setFont(new Font("���� ���",Font.BOLD,15));
    	b4=new JButton("����ī��");
    	b4.setFont(new Font("���� ���",Font.BOLD,15));
    	b5=new JButton("���׹���");
    	b5.setFont(new Font("���� ���",Font.BOLD,15));
    	b6=new JButton("���׼ҽ�");
    	b6.setFont(new Font("���� ���",Font.BOLD,15));
    	b7=new JButton("����");
    	b7.setFont(new Font("���� ���",Font.BOLD,15));
    	
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




