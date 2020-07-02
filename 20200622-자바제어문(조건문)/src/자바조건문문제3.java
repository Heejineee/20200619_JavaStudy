/*
 * 두 개의 정수를 받아서 최대값, 최소값 출력
 */
import java.util.*;
public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하세요");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int max,min;
		
		if(a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		//정수를 입력 받아서 절대값을 출력하는 프로그램
		System.out.println("정수를 입력하세요");
		int c=scan.nextInt();
		if(c<0)
		{
			System.out.println(-1*c);
		}
		else
		{
			System.out.println(c);
		}
		
		
	}

}
