package com.sist.abs;
/*
 * 	추상 클래스
 * 		=> 미완성된 클래스
 * 		=> new를 사용해서 메모리 할당이 불가능
 * 			class A
 * 			=> A a=new A();
 * 			absctract class B
 * 			=> B b=new B(); ==> error
 * 			==> 항상 상속을 내려서 하위 클래스에서 구현 후에 사용해야 함
 * 			==> 기본 틀이 존재
 * 			==> 제시만 한다 : 구현하는 내용이 프로그램마다 다를 수도 있다
 */
// 도형을 그리라고 하면 프로그래머마다 다른 걸 그릴거기 땜에 일단 선언해놓고 구현하는 예시!
abstract class 도형
{
	public abstract void draw();
	public void color()
	{
		System.out.println("검정색으로 그림을 그린다");
	}
}	// ==> 선언만 한 상태
class 삼각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	// 정의 변경 => 재정의
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("파란색으로 그린다");
	}
	
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	
}
class 사각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 g=new 삼각형();
				g.color();
				g.draw();
				
				g=new 사각형();
				g.color();
				g.draw();
				
				g=new 원();
				g.color();
				g.draw();
	}

}
