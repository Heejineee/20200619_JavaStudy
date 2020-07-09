// 국어 영어 수학 => 총점, 평균, 학점
import java.util.*;
public class 자바메소드2 {
	// 입력 받는 메소드
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(subject+" 점수 입력 : ");
		int score=scan.nextInt();
		return score;
	}
	// 총점 구하는 메소드
	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	// 평균 구하는 메소드 => 아예 출력하는 애로 만들어서 밑에서 호출만 하면 출력 됨!
	static void avg(int total)
	{
		System.out.printf("평균 : %.2f\n",total/3.0);
	}
	// 학점 구하기
	static char hakjum(int total)
	{
		char hakjum='A';
		switch(total/30)
		{
		case 10:
		case 9:
			hakjum='A';
			break;
		case 8:
			hakjum='B';
			break;
		case 7:
			hakjum='C';
			break;
		case 6:
			hakjum='D';
			break;
			default:
				hakjum='F';
			break;
		}		
		return hakjum;			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=userInput("국어");
		int eng=userInput("영어");
		int math=userInput("수학");
		
		int total=total(kor,eng,math);	// 변수명, 메소드명 같아도 됨
		
		// 출력
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		
		System.out.println("총점 : "+total);
		avg(total);
		System.out.println("학점 : "+hakjum(total));
		
	}

}
