package com.sist.project.client;

import javax.swing.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import com.sist.project.common.Function;

import java.awt.*; 
import java.awt.event.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientMainFrame extends JFrame implements ActionListener,MouseListener,Runnable{
	 ImageIcon lemon;
	JLabel title=new JLabel("레몬마켓",new ImageIcon("c:\\javaDev\\lemon.png"),JLabel.CENTER);
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	DetailForm df=new DetailForm();
	Login login=new Login();
	ControllPanel cp;
	talingListForm lf2=new talingListForm();
	BugsListForm bl=new BugsListForm();
	int curpage=1;
	int totalpage=16;
	
	Socket s; 
	OutputStream out; 
	BufferedReader in; 
	public ClientMainFrame()
	{
		
		cp=new ControllPanel(this);
		title.setFont(new Font("맑은 고딕",Font.BOLD,55));
		//title.setOpaque(true);
		//title.setBackground(Color.magenta);
		setLayout(null);// JFrame (BorderLayout) 사용자 정의로 배치 => null
		title.setBounds(10, 15, 1570, 100);
		// 추가 => add()
		add(title);
		// 메뉴 배치
		mf.setBounds(10, 120, 100, 300 );
		add(mf);
		// 채팅폼 
		cf.setBounds(115, 760, 1465, 200);
		add(cf);
		// 출력화면 
		cp.setBounds(115, 120, 1465, 635);
		add(cp);
		setSize(1600, 1000);
		//setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);// X버튼 클릭시 종료
		 getContentPane().setBackground(Color.white);
		
		mf.b1.addActionListener(this);
		mf.b2.addActionListener(this);
		mf.b3.addActionListener(this);
		mf.b4.addActionListener(this);
		mf.b5.addActionListener(this);
		mf.b6.addActionListener(this);
		
		cp.ff.b1.addActionListener(this);// 이전
		cp.ff.b2.addActionListener(this);// 다음
		
		
		cp.lf.b1.addActionListener(this);
		cp.lf.b2.addActionListener(this);
		cp.lf.b3.addActionListener(this);
		cp.lf.b4.addActionListener(this);
		cp.lf.b5.addActionListener(this);
		cp.lf.b6.addActionListener(this);
		cp.lf.tf.addActionListener(this);
		
		cp.lf2.b1.addActionListener(this);
		cp.lf2.b2.addActionListener(this);
		cp.lf2.b3.addActionListener(this);
		cp.lf2.b4.addActionListener(this);
		cp.lf2.b5.addActionListener(this);
		cp.lf2.b6.addActionListener(this);
		cp.lf2.tf.addActionListener(this);
		
		cp.gf.b1.addActionListener(this);
		cp.gf.b2.addActionListener(this);
		cp.gf.b3.addActionListener(this);
		cp.gf.b4.addActionListener(this);
		cp.gf.b5.addActionListener(this);
		cp.gf.b6.addActionListener(this);
		cp.gf.tf.addActionListener(this);
		
		cp.bl.b1.addActionListener(this);
		cp.bl.b2.addActionListener(this);
		cp.bl.b3.addActionListener(this);
		cp.bl.b4.addActionListener(this);
		cp.bl.tf.addActionListener(this);
		
		// 로그인 처리 
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		// 종료 
		mf.b7.addActionListener(this);
		
		// 채팅 
		cf.tf.addActionListener(this);
				
	}  
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        // 생성자는 호출시에 반드시  => new 생성자()
		UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
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
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2)
		{
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b3)
		{
			cp.card.show(cp, "LF2");
		}
		else if(e.getSource()==mf.b4)
		{
			cp.card.show(cp, "GF");
		}
		else if(e.getSource()==mf.b5)
		{
			cp.card.show(cp, "BL");
		}
		else if(e.getSource()==mf.b6)
		{
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==cp.lf2.b1)
		{
			cp.lf2.talingAllDate(1);
		}
		else if(e.getSource()==cp.lf2.b2)
		{
			cp.lf2.talingAllDate(2);
		}
		else if(e.getSource()==cp.lf2.b3)
		{
			cp.lf2.talingAllDate(3);
		}
		else if(e.getSource()==cp.lf2.b4)
		{
			cp.lf2.talingAllDate(4);
		}
		else if(e.getSource()==cp.lf2.b5)
		{
			cp.lf2.talingAllDate(5);
		}
		else if(e.getSource()==cp.lf2.b6 || e.getSource()==cp.lf2.tf)
		{
			String ss=cp.lf2.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.lf2.tf.requestFocus();
				return; 
			}
			cp.lf2.talingFindData(ss);
		}
else if(e.getSource()==cp.gf.b1)
		{
			cp.gf.MangoAllData(1);
		}
		else if(e.getSource()==cp.gf.b2)
		{
			cp.gf.MangoAllData(2);
		}
		else if(e.getSource()==cp.gf.b3)
		{
			cp.gf.MangoAllData(3);
		}
		else if(e.getSource()==cp.gf.b4)
		{
			cp.gf.MangoAllData(4);
		}
		else if(e.getSource()==cp.gf.b5)
		{
			cp.gf.MangoAllData(5);
		}
		else if(e.getSource()==cp.gf.b6 || e.getSource()==cp.gf.tf)
		{
			String ss=cp.gf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.gf.tf.requestFocus();
				return; 
			}
			cp.gf.MangoFindData(ss);
		}
else if(e.getSource()==cp.bl.b1)
		{
			cp.bl.BugsAllData(1);
		}
		else if(e.getSource()==cp.bl.b2)
		{
			cp.bl.BugsAllData(2);
		}
		else if(e.getSource()==cp.bl.b3)
		{
			cp.bl.BugsAllData(3);
		}
		else if(e.getSource()==cp.bl.b4 || e.getSource()==cp.bl.tf)
		{
			String ss=cp.bl.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.lf.tf.requestFocus();
				return; 
			}
			cp.bl.BugsFindData(ss);
		}
		else if(e.getSource()==cp.ff.b1)// 이전버튼
		{
			if(curpage>1)
			{
				curpage--;
				cp.ff.p.removeAll();// JPanel의 모든 기능을 삭제
				cp.ff.lemonPrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();//JPanel의 원래 기능을 재배치
			}
			
		}
		else if(e.getSource()==cp.ff.b2)// 다음버튼
		{
			if(curpage<totalpage)
			{
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.lemonPrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		else if(e.getSource()==cp.lf.b1)
		{
			cp.lf.lemonAllData(1);
		}
		else if(e.getSource()==cp.lf.b2)
		{
			cp.lf.lemonAllData(2);
		}
		else if(e.getSource()==cp.lf.b3)
		{
			cp.lf.lemonAllData(3);
		}
		else if(e.getSource()==cp.lf.b4)
		{
			cp.lf.lemonAllData(4);
		}
		else if(e.getSource()==cp.lf.b5)
		{
			cp.lf.lemonAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf)
		{
			// 1. 입력된 값 읽기
			String ss=cp.lf.tf.getText();
			if(ss.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				cp.lf.tf.requestFocus();
				return; // 메소드 종료 
			}
			cp.lf.lemonFindData(ss);
		}
		
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)// ID가 입력하지 않을 경우
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "대화명을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
				sex="남자";
			else
				sex="여자";
			
			// 서버로 입력받은 데이터 전송 
			try
			{
				// 연결  => 서버에 대한 정보를 가지고 있다 
				s=new Socket("localhost",6543);
				// 송수신 위치 확인
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				
				// 로그인 요청 (서버로 전송되는 부분)
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex){}
			    
			    //서버에서 전송하는 데이터를 읽어서 출력 
			    new Thread(this).start();
			    // run()의 위치 확인 ==> 자신의 클래스안에 존재 => (this)
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cf.tf)// 채팅 
		{
			String color=cf.box.getSelectedItem().toString();
			String msg=cf.tf.getText();
			if(msg.length()<1)
				return;
			// 데이터를 서버로 전송 
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex){}
			
			    cf.tf.setText("");
		}
		else if(e.getSource()==mf.b7)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==cp.ff.mc[i])
			{
				if(e.getClickCount()==2)
				{
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					//System.out.println(a);
					df.detailPrint(a);
					//cp.card.show(cp,"DF");
					df.setVisible(true);
					break;
				}
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 서버에서 들어오는 데이터를 받아서 처리 
		try
		{
			while(true)
			{
				String msg=in.readLine();
				System.out.println("server=>"+msg);
				StringTokenizer st=
						  new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				   case Function.MYLOG:
				   {
					   setTitle(st.nextToken());
					   login.setVisible(false);// 로그인창
					   setVisible(true);// 영화창 (Main) 
				   }
				   break;
				   case Function.LOGIN:
				   {
					   // 테이블에 출력 
					   String[] data= {
						  st.nextToken(), // id
						  st.nextToken(), // name
						  st.nextToken() // sex
					   };
					   cf.model.addRow(data);
				   }
				   break;
				   case Function.CHAT:
				   {
					     initStyle();
					     append(st.nextToken(),st.nextToken());
				   }
				   break;
				   case Function.EXIT:
				   {
					   String id=st.nextToken();
					   for(int i=0;i<cf.model.getRowCount();i++)
					   {
						   String mid=cf.model.getValueAt(i,0).toString();
						   if(id.equals(mid))
						   {
							   cf.model.removeRow(i);
							   break;
						   }
					   }
				   }
				   break;
				   case Function.MYEXIT:
				   {
					   dispose();// 윈도우 메모리 해제 
					   System.exit(0);// 프로그램 종료 
				   }
				   break;
				}
			}
		}catch(Exception ex) {}
	}
    public void initStyle()
    {
    	Style def=StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE);
    	Style red=cf.ta.addStyle("red", def);
    	StyleConstants.setForeground(red, Color.red);
    	
    	Style blue=cf.ta.addStyle("blue", def);
    	StyleConstants.setForeground(blue, Color.blue);
    	
    	Style green=cf.ta.addStyle("green", def);
    	StyleConstants.setForeground(green, Color.green);
    	
    	Style yellow=cf.ta.addStyle("yellow", def);
    	StyleConstants.setForeground(yellow, Color.yellow);
    	
    	Style gray=cf.ta.addStyle("gray", def);
    	StyleConstants.setForeground(gray, Color.gray);
    	
    	Style cyan=cf.ta.addStyle("cyan", def);
    	StyleConstants.setForeground(cyan, Color.cyan);
    }
    public void append(String msg,String color)
    {
    	try
    	{
    		Document doc=cf.ta.getDocument();
    		doc.insertString(doc.getLength(), msg+"\n", cf.ta.getStyle(color));
    	}catch(Exception ex) {}
    } 
}



