/*
 * 	배열 :
 * 		1) 같은 타입의 여러개의 변수를 묶어서 관리하는 프로그램
 * 		2) 한개의 변수명을 이용해 여러개의 변수를 제어 
 * 			구분자 : 인덱스 번호로 구분을 한다. (0번부터 시작)
 * 			ex) int[] arr={10,20,30,40,50}
 * 		3) 선언 방식 : 데이터형[] 배열명; / 데이터형 배열명[];
 * 										   ==== 변수 명칭법과 동일
 * 					  ex) String[] title=new String[10]; // 영화 제목을 10개 모아서 관리
 * 						   char[] hakjum=new char[10]; // 10명 학생의 학점을 관리
 * 						   int[] total=new int[10]; // 10명 학생의 총점을 관리
 * 							==> new를 사용하면 메모리 공간이 생성 ==> 0값으로 초기화 된다 (String은 null/char은 '\0'/double은 0.0/float은 0.0f/long은0L)
 * 							직접 값을 주입하는 방법 : int[] arr={10,20,30,40,50,60,}
 * 		4) 주의점 1. 배열의 크기를 초과하면 error : ArrayIndexOutOfBoundsException
 * 						 ========
 * 							n개 ==> 0~n-1개 ==> 만약 갯수를 모를 땐 length
 * 					  2. 제어문 사용시에는 주로 for문 이용
 * 							
 */
public class 배열선언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5명에 대한 점수 저장, 총점, 평균
		int a=80;
		int b=90;
		int c=75;
		int d=90;
		int e=85;
		
		int total=a+b+c+d+e;
		double avg=total/5.0;
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		
		// 배열 사용하기
		int[] score= {80,90,75,90,85};
		int total2=0;
		double avg2=0.0;
		for(int i=0; i<score.length; i++)
		{
			total2+=score[i];
		}
		avg2=total2/5.0;
		
		System.out.println("총점 : "+total2);
		System.out.println("평균 : "+avg2);

	}

}
