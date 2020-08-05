package com.sist.project.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import com.sist.project.data.*;
public class CardPrint extends JFrame{
    public CardPrint()
    {
    	//setLayout(null);
    	LemonManager m=new LemonManager();
    	ArrayList<LemonVO> lemons=m.lemonListData(1);
    	JPanel p=new JPanel();
    	p.setLayout(null);
    	JScrollPane pp=new JScrollPane();
    	Dimension size = new Dimension();//����� �����ϱ� ���� ��ü ����
    	size.setSize(1000, 1000);//��ü�� ����� ����
    	p.setPreferredSize(size);//������ ������ ������ �ִ� ��ü�� �̿��� �г��� ������ ����
    	pp.setViewportView(p);
    	add("Center",pp);
    	
		 int i=0;
		 for(LemonVO vo:lemons) 
		 { 
			 LemonListCard fc=new LemonListCard(vo); 
			 fc.setBounds(10, 15+(i*190), 700, 200);
			 p.add(fc);
			 i++;
		 }
		 
    	
    	setSize(1300, 500);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new CardPrint();
	}

}