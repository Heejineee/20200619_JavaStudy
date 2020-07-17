package com.sist.method;
/*
 * 	메소드
 * 		- 리턴값
 * 		- 매개변수 : 애매한 경우(얼마나 해야할 지 모를 때) ==> 가변매개변수(...)
 */
public class 메소드 {
	public static void concat(String s,String... s1)
	{
		for(String ss:s1)
		{
			s+=ss;			
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=10;	// Object 쓰면 데이터형 관계없음
		Object o1=0.5;
		Object o2='A';
		Object o3="aaaaaa";
		Object o4=new 메소드();
		
		concat("Hello","홍길동","심청이","박문수","춘향이","이순신");
	}

}
