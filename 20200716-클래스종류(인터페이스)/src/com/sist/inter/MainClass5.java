package com.sist.inter;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
public class MainClass5 extends JFrame {
	JTable table;	// ���̺� ��縸 
	DefaultTableModel model;	// ���̺� �ȿ� �ִ� ������ ���� => MV
	public MainClass5()
	{
		String[] col= {"","�̸�","����","�ּ�"};
		Object[][] row=new Object[0][4];
		
		// ������ �ڿ��� �� ���� ������ �޼ҵ� ������ ����!
		// ��� ���� �������̵� ����
		model=new DefaultTableModel(row,col) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Class<?> getColumnClass(int columIndex) {
				// TODO Auto-generated method stub
				return getValueAt(0,columIndex).getClass();
			}
			
				
		};
		// �� ���� �Ұ����ϰ� �ϱ�
		
		// table�� ÷��
		table=new JTable(model);
		table.setRowHeight(100);
		JScrollPane js=new JScrollPane(table);
		
		// �����쿡 �߰�
		add("Center",js);
		setSize(350,450);
		
		// ������ �߰�
		Object[] data= {new ImageIcon("c:\\javaDev\\a.png"),"ȫ�浿","����","����"};
		model.addRow(data);
		model.addRow(data);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ȣ��
		new MainClass5();
	}

}
