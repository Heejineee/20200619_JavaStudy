/*
 * 		1. 데이터 저장
 * 			1) 사용자가 요청 ==> 주로 사용
 * 			2) File 읽기
 * 			3) 오라클 연결
 * 			4) 웹에 있는 데이터 읽기
 * 		2. 사용자 요청한 내용으로 
 */
import java.util.*;
public class 다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수 입력");
		int kor, eng, math,total;
		double avg;
		char hakjum;

		System.out.println("국어 점수 입력 : ");
		kor=scan.nextInt();
		System.out.println("영어 점수 입력 : ");
		eng=scan.nextInt();
		System.out.println("수학 점수 입력 : ");
		math=scan.nextInt();

		total=kor+eng+math;
		avg=total/3.0;
		
		if(avg>=90)
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else
			hakjum='F';
		
		System.out.println("======성적======");
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		System.out.println("총점 : "+total);
		System.out.printf("평균 : %.2f\n",avg);
		System.out.println("학점 : "+hakjum);
	}

}
