/* 
 * 	윈도우 내용을 변경 => 상속
 * 		class A extends JFrame
 * 	있는 그대로 => 포함
 * 		class A
 * 		{
 * 			JFrame f=new JFrame();
 * 		}
 */
// 이거는 상속
import javax.swing.*;

public class MainWindow extends JFrame {
	// 실행 하자마자 윈도우 생성
	// 생성자
	public MainWindow()
	{
		// 윈도우 화면설계
		setSize(800,600);	// JFrame 메소드를 상속 받은 것
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
		new MainWindow();
	}

}

// 이거는 포함
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