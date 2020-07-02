import java.util.*;
public class 연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("두자리의 정수(10~99)를 입력하세요");
		int a=scan.nextInt();
		
		if(a%11==0)
		{
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다");
		}
		else
		{
			System.out.println("10의 자리와 1의 자리가 다릅니다!");
		}
	}

}