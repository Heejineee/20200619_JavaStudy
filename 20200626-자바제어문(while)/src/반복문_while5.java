/*
 * 	주의점
 * 	1) while은 조건이 없는 경우 error => for(;;)
 * 		ex) while()
 * 			{
 * 			} ==> 오류 발생 (조건식이 없어서)
 * 	2) while에서 무한루프 
 * 		=> for(;;) => while(true) : 가장 많이 등장하는 문제
 * 		ex) for(int i=0; i<10; i++)
 * 					↓(변경 가능)
 * 			 int i=0;
 * 			 while(i<10)
 * 			 {
 * 					i++;
 * 			 }
 * ※ 	for(int j=1; j<=10; j++)
		 {			
		 } ==> j는 메모리에서 사라진다(==> 지역변수) ==> for 밖에서도 쓸거면 밖에서 선언하고 들어가!
 */
// 숫자 입력하면 1부터 그 숫자까지의 합을 구하기
import java.util.*;
public class 반복문_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; // 사용자 요청한 변수
		int i=1; // 사용자 요쳥한 변수까지 증가 (루프변수)
		int sum=0;  // 누적(합)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 :");
		user=scan.nextInt();
		
		while(i<=user)
		{
			sum+=i;
			i++;
		}
		System.out.println("i = "+i); 	// i=i+1
		System.out.println("sum = "+sum);
		
		
	}

}

