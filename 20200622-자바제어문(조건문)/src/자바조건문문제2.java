/*
 * 사용자 입력 ==> 0,1,2
 * 					  => 0이면 가위
 * 					  => 1이면 바위
 * 					  => 2이면 보
 */
import java.util.*;
public class 자바조건문문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("0, 1, 2 중 하나를 입력 하세요");
		int user=scan.nextInt();
		
		if(user==0)
		{
			System.out.println("Player : 가위");
		}
		if(user==1)
		{
			System.out.println("Player : 바위");
		}
		if(user==2)
		{
			System.out.println("Player : 보");
		}
		
		//컴퓨터
		int com=(int)(Math.random()*3); //Math.random ==> 0.0 ~ 0.99 ==> 3을 곱했으니 0.0 ~ 2.9... ==> int 했으니 0~2
		
		if(com==0)
		{
			System.out.println("Computer : 가위");
		}
		if(com==1)
		{
			System.out.println("Computer : 바위");
		}
		if(com==2)
		{
			System.out.println("Computer : 보");
		}
		
		//사용자 : 컴퓨터
		//컴퓨터가 가위일 때
		if(com==0)
		{
			if(user==0)
			{
				System.out.println("무승부");
			}
			if(user==1)
			{
				System.out.println("Player 승");
			}
			if(user==2)
			{
				System.out.println("Computer 승");
			}
		}
		//컴퓨터가 바위일 때
		if(com==1)
		{
			if(user==0)
			{
				System.out.println("Computer 승");
			}
			if(user==1)
			{
				System.out.println("무승부");
			}
			if(user==2)
			{
				System.out.println("Player 승");
			}
		}
		//컴퓨터가 보일 때
		if(com==2)
		{
			if(user==0)
			{
				System.out.println("Player 승");
			}
			if(user==1)
			{
				System.out.println("Computer 승");
			}
			if(user==2)
			{
				System.out.println("무승부");
			}
		}
		
		//줄여서
		if(com-user==-2 || com-user==1)
		{
			System.out.println("Computer Win!");
		}
		if(com-user==-1 || com-user==2)
		{
			System.out.println("Player Win!");
		}
		if(com-user==0)
		{
			System.out.println("비겼다!");
		}
		
		// ※ 정수, 실수, 문자일 경우에는 == 사용 가능
		// "" 문자열은 ==으로 비교 불가능 ==> equals() 사용
		
	}

}
