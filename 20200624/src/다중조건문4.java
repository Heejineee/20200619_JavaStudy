
import java.util.*;
public class 다중조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사용자 => 정수입력 (1~12)
		 * 12, 1, 1 => 겨울입니다
		 * 3, 4, 5 => 봄입니다
		 * 6, 7, 8 => 여름입니다
		 * 9, 10, 11 => 가을입니다
		 */
		/*
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요 (1~12)");
		month=scan.nextInt();
		
		if(month==12 || month>=1 && month<3)
		{
			System.out.println("겨울입니다");
		}
		else if(month>=3 && month<6)
		{
			System.out.println("봄입니다");
		}
		else if(month>=6 && month<9)
		{
			System.out.println("여름입니다");
		}
		else if(month>=9 && month<12)
		{
			System.out.println("가을입니다");
		}
		else
			System.out.println("1~12의 숫자를 입력하세요");
		*/
		
		//문자 입력받아서 숫자/알파벳/한글/특수문자 구분
		char ch='a';
		System.out.println("문자를 입력하세요!");
		Scanner scan=new Scanner(System.in);
		ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println("숫자입니다");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println("알파벳 입니다");
		}
		else if(ch>='가' && ch<='힣' || ch>='ㄱ' && ch<='ㅎ')
		{
			System.out.println("한글 입니다");
		}
		else 
		{
			System.out.println("특수문자 입니다");
		}
	}

	
	
}
