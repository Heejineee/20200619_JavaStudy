/*
 * 1. 정수를 입력받아서 짝수인지 홀수인지 확인 => 결과값) 10은 짝수다, 11은 홀수다
 * 2. 정수 3개를 입력 받아서 총점, 평균/학점 => 조건문 60 이상 D / 70 이상 C / 80 이상 B / 90 이상 A / 나머지는 F
 * 																	국어점수 : 80, 영어점수 : 80, 수학점수 : 80, 총점 : 240, 평균 : 80.0, 학점 : B
 */
import java.util.*;
public class 자바조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a=0;
		a=scan.nextInt();
		
		if(a%2==0)
		{
			System.out.println(a+"는(은) 짝수다");
		}
		else
			System.out.println(a+"는(은) 홀수다");
	
		
		System.out.println("국어, 영어, 수학 점수 입력");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		char score='A';		

		if(avg>=90 && avg<100)
		{
			score='A';
		}
		if(avg>=80 && avg<90) 
		{
			score='B';
		}
		if(avg>=70 && avg<80)
		{
			score='C';
		}
		if(avg>=60 && avg<70) 
		{
			score='D';
		}
		if(avg<60)
		{
			score='F';
		}
		System.out.println("총점 : "+sum);
		System.out.printf("평균 :%.2f\n",avg);
		System.out.println("학점 : "+score);
	}	
}
