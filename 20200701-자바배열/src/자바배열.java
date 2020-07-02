/*
 * 	배열
 * 		=> 여러개 변수를 하나로 묶어서 관리
 * 			(변수 이름을 한개를 가지고 사용 => 배열명)
 * 			변수가 여러개 이기 때문에 구분 ==> 인덱스(첨자)
 * 			※ 주의점 : 인덱스 번호는 0부터 시작
 * 		=> 배열의 갯수를 가지고 올 때는 => 배열명.length
 * 		=> 배열 선언 : 데이터형[] 배열명=new 데이터형[변수갯수] 
 * 								ex) int[] arr=new int[5]
 * 		=> 배열 초기화
 * 				1) new를 이용해서 자동 초기화
 * 				2) 프로그래머가 직접 입력 ex) int[] arr={10,20,30,40,50}
 * 				3) 사용자가 입력, 난수...
 * 			* 데이터형별 초기값
 * 				- int : 0
 * 				- double : 0.0
 * 				- String : null
 * 		=> 배열 값 변경
 * 				- 배열명[원하는 부분]=값 ex) 배열명[6]=100 ==> 일반 변수와 동일하게 취급
 * 		=> 배열 값 출력
 * 				- 0부터~~ ==> for문 사용이 용이 => while 사용 가능
 * 				- 일반 for문 : index 이용 ==> 배열값을 변경하거나 제어할 때 사용
 * 				- for-each : 실제 저장된 값을 읽어온다 ==> 주로 출력용으로 사용
 * 
 */

// 사용자가 년, 월, 일을 입력하면 요일을 출력
import java.util.*;
public class 자바배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 년도, 월, 일 받는 변수 필요
		int year=0, month=0, day=0;
		// 사용자로부터 요청값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력 : ");
		year=scan.nextInt();
		System.out.println("월 입력 : ");
		month=scan.nextInt();
		System.out.println("일 입력 : ");
		day=scan.nextInt();
		
		System.out.println(year+"년도 "+month+"월 "+day+"일");
		/*
		 * 	요일 구하기
		 * 	1) 전년도 까지의 총 날 수 ==> 1년도 1월 1일 ~~ 2019년 12월 31일까지 계산
		 * 	2) 전 달 까지의 총 날 수 ==> 2020년 1월 1일 ~~ 2020년 6월 30일 계산
		 * 	3) 입력된 day까지의 총 날 수 구한다
		 * 	4) 1,2,3 더한 것 % 7 ==> 요일 ==> 0~6까지 나오는데 0은 일요일~ 6 토요일
		 */
		// 전년도까지의 총 날 수
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400; 
		// 윤년은 총 366일 임! ==> 4년마다, 100년마다(제외), 400년마다
		
		// 전달까지의 합
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		// 2월일 경우 28/29
		if((year%4==0 && year%100!=0 || (year%400==0))) // 윤년 조건 (공식)
		{
			lastDay[1]=29;
		}
		else
		{
			lastDay[1]=28;
		}
		
		for(int i=0; i<month-1; i++)
		{
			total+=lastDay[i];
		}
		
		// 입력된 day
		total+=day;
		
		// 요일 구하기
		int week=total%7;
		char[] strWeek= {'일','월','화','수','목','금','토'};
		System.out.println(strWeek[week]+"요일입니다");
	}

}




