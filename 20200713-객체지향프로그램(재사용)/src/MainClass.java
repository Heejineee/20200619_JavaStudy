/*
 * 	���� => ������ ������� Ŭ������ ���(�ݺ� �ڵ��� ����)
 * 		1) ��� (is-a)
 * 			- �̹� ������� ����� �����ؼ� ���
 * 				public class MyWindow extends JFrame
 * 														====== Ȯ��� Ŭ����
 * 		2) ���� (has-a)
 * 			- �̹� ������� ����� ���� ���� �״�� ���
 * 				public class MyWindow
 * 				{
 * 					JFrame f=new JFrame();
 * 				}
 * 
 * 	public class A
 * 	{
 * 		String name;
 * 		int age;
 * 		public void display();
 * 	}
 * 
 * 	public class B extends A
 * 	{
 * 		���� A���� ���⿡ �� ����
 * 	}
 * 
 */
import javax.swing.*;
public class MainClass extends JFrame {
	public MainClass()		// �����ڴ� �������̸� public �޼ҵ�� �����
	{
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}
