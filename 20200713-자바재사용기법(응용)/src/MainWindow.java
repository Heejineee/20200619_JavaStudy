/* 
 * 	������ ������ ���� => ���
 * 		class A extends JFrame
 * 	�ִ� �״�� => ����
 * 		class A
 * 		{
 * 			JFrame f=new JFrame();
 * 		}
 */
// �̰Ŵ� ���
import javax.swing.*;

public class MainWindow extends JFrame {
	// ���� ���ڸ��� ������ ����
	// ������
	public MainWindow()
	{
		// ������ ȭ�鼳��
		setSize(800,600);	// JFrame �޼ҵ带 ��� ���� ��
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ȣ��
		new MainWindow();
	}

}

// �̰Ŵ� ����
/*

	import javax.swing.*;
	public class MainWindow2 {
		JFrame f=new JFrame();
		public MainWindow2()
		{
			f.setSize(800,600);
			f.setVisible(true);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new MainWindow2();
		}

	}
*/