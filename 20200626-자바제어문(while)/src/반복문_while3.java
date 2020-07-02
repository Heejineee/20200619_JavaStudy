/*
 * 	String : 클래스
 * 	기능 (제공) 
 *  1) 문자갯수
 * 		ex)	String s="ABCDEF";
 * 				s.length() => 6
 * 	2) 문자 저장
 * 		ex)	String s="ABCDEF";
 * 				s.charAt(0) => 'A'
 * 			
 */
// 사용자 문자열을 입력
// 대문자 갯수, 소문자 갯수 확인
import java.util.*;
public class 반복문_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=""; // 문자 여러개 저장
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		s=scan.nextLine(); // String으로 받은 값을 저장 / next면 scanner 하나를 하나로 인식해서 띄어쓰기 하면 따로 따로 됨 / nextLine은 띄어쓰기도 포함!
		System.out.println(s);
		System.out.println("갯수 : "+s.length());
		
		int a=0, b=0;
		// a => 소문자 갯수
		// b => 대문자 갯수
		int i=0; // 문자의 갯수만큼 증가하는 변수 => 루프변수
		
		while(i<s.length())
		{
			char c=s.charAt(i);
			if(c>= 'A' && c<='Z')
				b++;
			if(c>='a' && c<='z') // 알파벳 아닌 숫자를 입력할 수도 있으니 else 안씀
				a++;
			
			i++;
		}
		System.out.println("대문자 갯수 : "+b);
		System.out.println("소문자 갯수 : "+a);
		

	}

}
