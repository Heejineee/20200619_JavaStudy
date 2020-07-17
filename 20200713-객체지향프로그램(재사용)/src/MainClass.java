/*
 * 	재사용 => 기존에 만들어진 클래스를 사용(반복 코딩을 제거)
 * 		1) 상속 (is-a)
 * 			- 이미 만들어진 기능을 변경해서 사용
 * 				public class MyWindow extends JFrame
 * 														====== 확장된 클래스
 * 		2) 포함 (has-a)
 * 			- 이미 만들어진 기능을 변경 없이 그대로 사용
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
 * 		위의 A값이 여기에 다 들어옴
 * 	}
 * 
 */
import javax.swing.*;
public class MainClass extends JFrame {
	public MainClass()		// 생성자는 가급적이면 public 메소드로 만든다
	{
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}
