/*
 * 	메소드 => 결과값 => 리턴값
 * 				=> 메소드 자체에서 출력 => 리턴값(X) ==> void
 */
//		사용자 정수 입력 => 짝수, 홀수 
import java.util.*;
public class 자바메소드3 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		return num;		
	}
	static void process(int num)
	{
		if(num%2==0)
			System.out.println(num+"는(은) 짝수 입니다");
		else
			System.out.println(num+"는(은)홀수 입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 입력값을 받는다
		int num=userInput();
		process(num);
	}

}
