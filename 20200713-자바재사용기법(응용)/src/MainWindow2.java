/*
 * 	자바의 모든 클래스는 상속을 받는다. (생략 하는 것일 뿐!)
 * 	class MainWindow2 extends Object
 * 													 ====== 모든 클래스가 상속을 받아서 처리!
 */
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
