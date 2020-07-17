package com.sist.oop;
/*
 * 	자바
 * 		첫번째 줄 : package명 (한번만 사용 가능)
 * 		두번째 줄 : import (여러번 사용 가능)
 * 		세번째 줄 : public class className
 * 						  {
 * 								필요한 변수 설정 => 멤버변수
 * 								변수에 대한 초기화 => 생성자
 * 								기능 => 메소드
 * 						  }
 * 		==> 다른 클래스에 사용시에는 import com.sist.oop.* 
 * 				패키지 이름 com.회사명.기능명 // org.조직명.기능명 이런식으로 사용
 * 
 * 	캡슐화
 * 		- 변수는 private
 * 		- 메소드 public ==> 변수 (getter/setter)
 * 	상속
 * 		- extends : 기존의 클래스 기능을 가지고 온다
 * 			※ 단일 상속만 가능하다
 * 	다형성
 * 		- 수정, 추가할 때 사용
 * 	
 * 	오버로딩
 * 		- 같은 메소드 명으로 여러개의 기능을 만든다
 * 		- 매개변수가 다르다 (갯수나 데이터형이 다르다)
 * 		- 리턴형은 관계 없다
 * 		- 같은 클래스 내에서 만든다
 * 
 * 	plus() :
 * 	int + int => plusInt(int a, int b)
 * 	double + double => plusDouble(double d, double1)
 * 	int + double => plusIntDouble(int a, double d)
 * 	String + String => plusString(String s1, String s2)
 * 	float + double
 * 	long + int
 * 	int + char
 * 			.
 * 			.
 * 			.
 * 
 * 	class A
 * 	{
 * 		int a;
 * 		static int b;
 * 		
 * 		public void disp1()
 * 		{
 * 			=> a, b 사용 가능
 * 			=> disp2() 호출 가능
 * 		}
 * 		
 * 		public static void disp2()
 * 		{
 * 			=> b만 사용 가능
 * 			=> disp1(), a 를 사용할 수 없다
 * 					==> 사용시에는 반드시 new를 사용
 * 		} 
 * 
 */
class Calc{
	// 인스턴스 메소드 : new 사용시 마다 따로 저장되는 메소드
	public void plus(int a, int b)
	{
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
	public void plus(double a, double b)
	{
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a, String b)
	{
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
	public double plus(double d, char c)
	{
		return d+c;
	}
}
public class 오버로딩_중복메소드정의 {
	int a=10;
	static int b=20;
	public void disp1()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void disp2()
	{
		System.out.println(b);
		오버로딩_중복메소드정의 aa= new 오버로딩_중복메소드정의(); // a는 출력이 안돼서 이렇게!
		System.out.println(aa.a);
	}
	public 오버로딩_중복메소드정의()
	{
		System.out.println("this="+this);	// 여기와 밑에 
																// 오버로딩_중복메소드정의 aa= new 오버로딩_중복메소드정의();
																// System.out.println("aa="+aa); 주소 값 같음
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc();	// 메소드 전체 저장
		cc.plus("Hello", "Java");
		cc.plus(100, 200);
		System.out.println(b);	// a는 출력이 안돼서 밑에처럼
		
		오버로딩_중복메소드정의 aa= new 오버로딩_중복메소드정의();
		System.out.println("aa="+aa);
		System.out.println(aa.a);
		
	}

}
