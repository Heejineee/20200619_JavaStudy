package com.sist.abs;
/*
 * 	클래스의 종류
 * 		- 추상클래스
 * 		- 인터페이스 => 추상클래스를 확장 => 여러개의 클래스를 모아서 관리(서로 다른 클래스를 연결해서 사용)
 * 							 => 결합성이 낮은 프로그램
 * 								  --------- 클래스 수정시 다른 클래스에 영향을 주는지
 * 										※ 응집성 : 한개의 기능 수행할 수 있는 능력(메소드)
 * 					- 사용 용도
 * 							1) 기능이 여러개로 나눠지는 경우
 * 							2) 여러개의 클래스를 한개의 클래스로 제어할 때 
 * 	===================================================================
 * 				추상클래스																인터페이스
 * 	===================================================================
 * 				단일 상속																	다중 상속
 * 	===================================================================
 * 			구현이 안된 메소드												구현이 안된 메소드만
 * 			 구현이 된 메소드														* 구현 된 메소드 default가 추가됨 (최신 버전에서)
 * 	===================================================================
 * 형식		public abstract class A										public interface B
 * 			{																			{
 * 				public abstract void display(); //구현 안된			void display(); ==> public abstract void display()	 // 자동으로 public abstract 붙음
 * 				public void aaa() {	//구현 된									void aaa();	==> public abstract void aaa();	 // 자동으로 public abstract 붙음
 * 				}																		}
 * 			}
 * 
 * 	====================================================================
 * 멤버		public abstract class A										public interface B
 * 변수		{																			{
 * 				private int a;														int a; ==> error	// 인터페이스가 가지고 있는 변수 => 상수형 변수
 * 			}																			}			 ==> int a ==> public final static int a 라서 변수값을 지정해줘야함
 * 																													 ==> int a=10; 이렇게 하면 에러 X
 * 	=====================================================
 * 단점 	기능 설정 => 추가하면 모든 클래스가 error
 * 			==> 인터페이스, 추상클래스를 사용 => 상속
 * 					구현이 안 된 메소드는 반드시 구현해서 사용!
 * ex) public class 추상클래스 extends JFrame implements MouseListener 이거만 하면 오류가 나는데
 * 		이 때 메소드를 추가하면 mouseClicked, mousePressed 등 다섯가지의 메소드를 추가해야함
 * 		이 중에 하나만 쓰고 싶어도 다 해야하는게 단점!
 * 	======================================================================
 * 
 * 	======================================================================
 * 
 * 
 * 
 * 		- 내부클래스 => 멤버클래스
 * 		- 내부클래스 => 익명클래스
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 추상클래스 extends JFrame implements MouseListener {

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
