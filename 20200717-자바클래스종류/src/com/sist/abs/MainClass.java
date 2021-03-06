package com.sist.abs;
/*
 * 	클래스 종류
 * 		- 일반클래스(핵심)
 * 				1) 데이터형으로만 사용 => 필요한 데이터를 모아서 관리(캡슐화) => 데이터 은닉화 메소드 통해 접근
 * 																															----------------- 	--------------------
 * 																																private				getter/setter
 * 				2) 액션 => 기능만 가지고 있다(메소드)
 * 				3) 변수 + 메소드 = 혼합
 * 				형식) public class className
 * 						{
 * 							멤버변수, 공유변수
 * 							생성자() => 필요한 경우
 * 							메소드
 * 						}
 * 	
 * 		========
 * 		- 추상클래스
 * 				1) 자신이 메모리 할당 불가능
 * 				2) 생성 => 상속받은 클래스를 통해서 메모리에 저장
 * 				3) 단일 상속
 * 				4) 상속을 받은 클래스는 반드시 구현이 안된 메소드를 구현해서 사용
 * 				5) 여러개의 클래스가 있는 경우 공통으로 적용된 메소드가 있는 경우에 추상클래스 제작
 * 				6) 구분 => 메모리 할당시, 클래스 선언, 생성자 
 * 					ex) A a=new A() => 일반클래스
 * 						  A a=new B() => 추상클래스(자신이 메모리 할당 못해서 다른애 부름)
 * 				7) 메소드 구현이 애매한 경우(경우의 수가 많다) 추상클래스 사용
 * 				8) 기본 틀이 제작되어있어 구현이 쉽다
 * 				9) 요구사항 분석
 * 				형식) public abstract class className
 * 						{
 * 							멤버변수/공유변수
 * 							구현이 안 된 메소드 => 미완성 클래스(생성자는 존재하지 않음)
 * 							구현이 된 메소드
 * 						}
 * 					
 * 		- 인터페이스 : 웹프로그램
 * 				1) 추상클래스의 일종
 * 				2) 다중상속
 * 				3) 인터페이스 => 클래스(상위 클래스) => 상속을 내려야 사용이 가능
 * 						※ 인터페이스는 클래스로부터 상속 받을 수 없다
 * 						※ 인터페이스 => 인터페이스 ==> extends
 * 							인터페이스 => 클래스 ==> implements
 * 							ex) interface A
 * 								  interface B  extends A
 * 
 * 								  interface A
 * 								  class B implements A
 * 							------------------------------------ 밑에는 다중상속
 * 								 interface A
 * 							    class B
 * 							 	class C extends B implements A
 * 
 * 								interface A
 * 								interface B
 * 								class C implements A, B
 * 							==> 여러개의 관련이 없는 클래스를 연결해서 사용하는 프로그램
 * 							==> 결합성(다른 클래스 영향)이 낮은 프로그램을 만들 경우에 주로 사용 (스프링) ==> 스프링은 인터페이스 기반
 * 				형식) public interface interfaceName
 * 						{
 * 							변수 : 상수형 변수 => public final static 데이터형=값
 * 															  -------------------------
 * 																생략시에는 자동으로 추가됨(private, protected는 사용금지)
 * 							메소드 : 구현이 안된 메소드만 가지고 있다
 * 								※ JDK 1.8 이상부터 default로 구현된 메소드 작성 가능 (실무에선 거의 1.7이라 안됨)
 * 						}
 * 		======== 추상, 인터페이스 : 관련된 클래스가 여러개일 때 묶어서 사용(통합)
 * 												- 데이터베이스 연결
 * 												- 웹프로그램(MVC)
 * 
 * 		- 내부클래스 : 애플리케이션
 * 				- 멤버클래스 : 두개 이상의 클래스에서 한개의 데이터 공유할 경우
 * 									 : 네트워크 프로그램, 쓰레드 프로그램, 빅데이터
 * 						형식) class A
 * 								{
 * 									O, X, K
 * 								}
 * 								class B
 * 								{
 * 									A a=new A();
 * 									a.O, a.X, a.K
 * 								}
 * 								==> B b=new B();
 * 										B b1=new B();
 * 
 * 								class A
 * 								{
 * 									O, K, X
 * 									class B
 * 									{
 * 									}
 * 								}
 * 								==> A와 B 둘 다 O, K, X를 가지고 있음
 * 				- 익명의 클래스 : 상속 없이 오버라이딩 할 때(윈도우 클래스)
 * 						형식) class C extends A
 * 								{
 * 									B b=new B(){
 * 										오버라이딩이 가능하다
 * 									}
 * 								}
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
