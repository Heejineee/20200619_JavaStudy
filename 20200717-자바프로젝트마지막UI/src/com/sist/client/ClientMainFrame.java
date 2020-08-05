package com.sist.client;
//	������ => JFrame ==>  ������� ���õ� Ŭ������ �о�´�
import javax.swing.*;	// ������ ����
import java.awt.*;		// Color, Layout �� ��ġ ����
import java.awt.event.*;	// interface
/*
 * 	����
 * 		- ���(is-a) : ������ Ŭ������ �����ؼ� ���
 * 			public class ClientMainFrame extends JFrame
 * 								------------------------
 * 								JFrame�� ����� ��ü ������ �´�
 * 			ex) class A
 * 				  {
 * 						O X W
 * 				  }
 * 				  class B extends A
 * 				  {
 * 						O X W
 * 				  }
 * 				
 * 		- ����(has-a) : ������ Ŭ������ ���� ���� ���
 * 			ex) public class ClientMainFrame
 * 					{
 * 						JFrame f=new JFrame();
 * 					}
 */		
public class ClientMainFrame extends JFrame implements ActionListener{
	// ������ ũ�� ���� => �����ڿ��� ���
	JLabel title=new JLabel("������ & ���� ��õ",JLabel.CENTER); 
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp=new ControlPanel();
	
	public ClientMainFrame() // ������
	{
		/*
		 * 	Ŭ�������� ������ ��� => ������ �ƴ϶� ������ ��
		 * 	ex) �����ͺ��̽� : ����Ŭ ����
		 * 		  ��Ʈ��ũ : ���� => IP, Port => �ڵ���(����)
		 * 		  �� : ��Ű���� �� �б� => �ڵ� �α���
		 */
		title.setFont(new Font("���� ���",Font.BOLD,55));
		title.setOpaque(true); // �������ϰ�
		setLayout(null);	// JFrame (borderLayout) ����� ���Ƿ� ��ġ => null ==> �� ����� ��ġ�ϰ� ���� �� null�� �ֱ�
		title.setBounds(10, 15, 1570, 100);
		// �����쿡 �߰�(add)
		add(title);
		// �޴� ��ġ
		mf.setBounds(10, 120, 100, 300);
		add(mf);
		
		// ä����
		cf.setBounds(115,760,1465,200);
		add(cf);
		
		// ���ȭ��
		cp.setBounds(115,120,1465,635);
		add(cp);
		setSize(1600,1000);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 	// X��ư Ŭ���� ����
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// �����ڴ� ȣ��ÿ� �ݵ�� new ������()
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}
	public static Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mf.b1)
		{
			cp.card.show(cp, "DF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
	}

}
