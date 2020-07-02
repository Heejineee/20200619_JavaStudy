/*
 * 제어문
 * 		- 종류
 * 			1) 조건문
 * 				- 단일 조건문 : if(조건문 ==> true/false) 
 * 									{
 * 										실행문장 ==> 조건이 true일 경우에 처리하는 문장
 * 													 ==> 조건이 false가 되면 실행 문장을 수행하지 않는다.
 * 									}
 * 									※ 모든 제어문은 {}을 사용하지 않으면 한개의 문장만 수행한다.
 * 								ex) if(조건문)
 * 										실행문장 1
 * 										실행문장 2 ==> 무조건 실행하는 문장(괄호 안쳐졌으니 true든 false든 하는애)
 * 				- 선택 조건문 : true일 경우/ false일 경우 처리하는 문장이 다름
 * 									ex) 로그인 처리가 될 경우/ 로그인 처리가 안 된 경우
 * 									형식) if(조건문)
 * 												조건이 true일 경우에 처리 문장
 * 											else
 * 												조건이 false일 경우에 처리 문장
 * 				- 다중 조건문 : 조건에 해당하는 문장만 수행 => 한번만 수행
 * 									 형식) if(조건문)
 * 												실행문장 1 ==> 조건이 true일 때 수행하고 종료 
 * 											else if(조건문)
 * 												실행문장 2 ==> 조건이 true일 때 수행하고 종료 
 * 											else if(조건문)
 * 												실행문장 3 ==> 조건이 true일 때 수행하고 종료 
 * 											else if(조건문)
 * 												실행문장 4 ==> 조건이 true일 때 수행하고 종료 
 * 											else
 * 												실행문장 5 ==> 조건에 해당하는 사항이 없는 경우
 * 
 * 			2) 선택문
 * 			3) 반복문
 * 			4) 반복제어문
 * 		- 형식
 * 		- 흐름 이해
 * 		- 구현
 */
public class 자바단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// score가 60 이상이면 성공, 60 이하면 실패
		int score=60;
		if(score>=60)
			System.out.println("성공");
		if(score<60)
			System.out.println("실패");
		
		if(score>=60) {
			System.out.println("첫번째 if문 수행");
			System.out.println("Success");
		}
		if(score<60) {
			System.out.println("두번째 if문 수행");
			System.out.println("Fail");
		}
	
	}

}
