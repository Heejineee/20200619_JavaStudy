
public class MainClass1 {
	public static void main(String[] args) {
		//표현 => 자바
		/*
		 * 정수
		 * 		= 10진법 (10, 20...)
		 * 		= 8진법 (011 => 9) 앞에 0이 붙으면 8진법
		 * 		= 16진법 (0x10) 0x 앞에 붙임
		 * 		= 2진법 (0b1010) 0b 앞에 붙임
		 * 실수
		 * 		= 저장 크기 => 4byte		10.5f (소숫점 이하 8자리까지 저장)
		 * 		= 저장 크기 => 8byte		10.5 (소숫점 이하 16자리까지 저장)
		 * 문자
		 * 		= '' => 한글자만 저장
		 * 문자열
		 * 		= "" => 여러 글자 저장
		 * 자바는 Unicode (2byte)
		 * ASC(아스키)코드 는 주로 C언어 (1byte, 한글 안됨)
		 */
		System.out.println('A');
		System.out.println("안녕");
		System.out.println(10.5);
		System.out.println(10.5f); //대소문자 구별 x
		System.out.println(10.5F);
		
		System.out.println(10);
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0xA);
		
		/*
		 * 1. 기본 문법
		 * 		- 대소문자 구분
		 * 		- 라이브러리 (클래스 : 대소문자, 메소드: 소문자, 상수 : 모두 대문자)
		 * 		PI=3.14
		 * 		- 변수/상수
		 * 			int kor=100; => 변수
		 * 			final int KOR=200; => 상수
		 * 		- 명령문이 종료가 되면 반드시 ;
		 * 		- 들여쓰기 
		 */
	}
}
