package com.sist.abs;
/*
 * 	Ŭ������ ����
 * 		- �߻�Ŭ����
 * 		- �������̽� => �߻�Ŭ������ Ȯ�� => �������� Ŭ������ ��Ƽ� ����(���� �ٸ� Ŭ������ �����ؼ� ���)
 * 							 => ���ռ��� ���� ���α׷�
 * 								  --------- Ŭ���� ������ �ٸ� Ŭ������ ������ �ִ���
 * 										�� ������ : �Ѱ��� ��� ������ �� �ִ� �ɷ�(�޼ҵ�)
 * 					- ��� �뵵
 * 							1) ����� �������� �������� ���
 * 							2) �������� Ŭ������ �Ѱ��� Ŭ������ ������ �� 
 * 	===================================================================
 * 				�߻�Ŭ����																�������̽�
 * 	===================================================================
 * 				���� ���																	���� ���
 * 	===================================================================
 * 			������ �ȵ� �޼ҵ�												������ �ȵ� �޼ҵ常
 * 			 ������ �� �޼ҵ�														* ���� �� �޼ҵ� default�� �߰��� (�ֽ� ��������)
 * 	===================================================================
 * ����		public abstract class A										public interface B
 * 			{																			{
 * 				public abstract void display(); //���� �ȵ�			void display(); ==> public abstract void display()	 // �ڵ����� public abstract ����
 * 				public void aaa() {	//���� ��									void aaa();	==> public abstract void aaa();	 // �ڵ����� public abstract ����
 * 				}																		}
 * 			}
 * 
 * 	====================================================================
 * ���		public abstract class A										public interface B
 * ����		{																			{
 * 				private int a;														int a; ==> error	// �������̽��� ������ �ִ� ���� => ����� ����
 * 			}																			}			 ==> int a ==> public final static int a �� �������� �����������
 * 																													 ==> int a=10; �̷��� �ϸ� ���� X
 * 	=====================================================
 * ���� 	��� ���� => �߰��ϸ� ��� Ŭ������ error
 * 			==> �������̽�, �߻�Ŭ������ ��� => ���
 * 					������ �� �� �޼ҵ�� �ݵ�� �����ؼ� ���!
 * ex) public class �߻�Ŭ���� extends JFrame implements MouseListener �̰Ÿ� �ϸ� ������ ���µ�
 * 		�� �� �޼ҵ带 �߰��ϸ� mouseClicked, mousePressed �� �ټ������� �޼ҵ带 �߰��ؾ���
 * 		�� �߿� �ϳ��� ���� �; �� �ؾ��ϴ°� ����!
 * 	======================================================================
 * 
 * 	======================================================================
 * 
 * 
 * 
 * 		- ����Ŭ���� => ���Ŭ����
 * 		- ����Ŭ���� => �͸�Ŭ����
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class �߻�Ŭ���� extends JFrame implements MouseListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

}
