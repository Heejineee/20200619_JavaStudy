/*
 * 	메소드 : 한가지 기능만 수행 => 다음에 다시 사용할 수 있게 만든다
 * 		- 목적 : 재사용, 반복 제거
 * 		- 형식 : 
 * 				- 반환형이 없는 경우 : void 사용
 * 				- 매개변수가 없는 경우 (매개변수 => 주로 사용자가 요청한 값)
 * 				- 반환형이 존재 => 사용자가 요청한 내용의 결과값 => 반드시 한개만 존재
 * 											   여러개일 경우 : 배열, 클래스
 *					- 매개변수가 존재 => 아이디 중복체크(매개변수는 ID), 우편번호 검색(매개변수는 동, 길)
  				ex) 반환형(리턴형) 메소드명(매개변수, 매개변수..)
  				 		{
  				 			종료 => return (꼭 마지막에 쓰는거 아님/종료하고 싶을 때 중간에도 사용 가능!)
  				 						※ return 문장 밑에는 소스 코딩을 할 수 없다!
  				 							break, continue도 마찬가지로 프로그램 종료하는 문장이기 때문에 이 셋 밑에는 코딩 안됨
  				 		}  				 
 * 		- 메소드는 호출시마다 처음부터 return까지 수행 => 다시 호출한 위치로 돌아온다
 */
//	사용자가 년도를 입력하면 윤년 여부를 확인
import java.util.*;
public class 자바메소드 {
	// 사용자가 년도 입력하는 메소드
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("년도를 입력 : ");
		int year=scan.nextInt();
		return year;
	}
	// 윤년여부를 확인하는 메소드
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			bCheck=true;
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 메소드 아닌 일반 코딩
			Scanner scan=new Scanner(System.in);
			System.out.println("년도를 입력 : ");
			int year=scan.nextInt();
			if((year%4==0 && year%100!=0) || (year%400==0))
			{
				System.out.println(year+"년도는 윤년입니다");
			}
			else
			{
				System.out.println(year+"년도는 윤년이 아닙니다");
			}
		*/
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");
		

	}

}
