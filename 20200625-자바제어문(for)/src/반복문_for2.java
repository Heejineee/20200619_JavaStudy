/*
 * 2~9 사용자가 입력 구구단 출력
 */
import java.util.*;
public class 반복문_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("2~9 정수 입력");
		dan=scan.nextInt();
		
		for(int i=1; i<=9; i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		

	}

}
