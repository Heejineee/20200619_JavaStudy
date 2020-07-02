/*
 * 		선택 조건문
 * 		if(조건문)
 * 		{
 * 			조건문이 true면 수행하는 문장 구현
 * 		}
 * 		else
 * 		{
 * 			조건문이 false일 때 수행하는 문장 구현
 * 		}
 * 
 * 		조건문 핵심 => 조건 제작
 */
import java.util.*;
public class 제어문_선택조건문 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자 한개를 입력 받아서 알파벳인지 확인
		char ch='a'; // 변수 초기화 (반드시 해야함)
		/* 유형별 데이터 초기값
		 * int => 0
		 * double => 0.0
		 * long => 0L
		 * boolean => false
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 한개를 입력하세요");
		// 자바는 모든 시작 번호가 0부터 시작한다
		ch=scan.next().charAt(0);
		// 숫자냐고 물어볼땐 ch>='0' && ch<='9'
		/*if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println(ch+"는(은) 알파벳 입니다.");
		}
		else
		{
			System.out.println(ch+"는(은) 알파벳이 아닙니다.");
		}
		}
		*/
		
		if(ch>='0' && ch<='9')
		{
			System.out.println("숫자입니다");
		}
		else
		{
			System.out.println("문자입니다");
		}

	}
}


