/*
 * 	연산자 => 데이터 가공
 * 	연산 : 연산시 데이터형 동일해야 연산이 된다. => 데이터형을 같게 만든 다음에 연산 해야함!
 * 			- 자동 형변환 : 작은 데이터 -> 큰 데이터 ex) 10 + 10.5 ==> 10.0 + 10.5
 * 			- 강제 형변환 : 큰 데이터 -> 작은 데이터 (프로그래머가 직접 처리)
 * 			※ int 이하는 연산이 되면 int로 결과값 나옴
 * 			※ char는 모든 연산시에 정수로 변경됨
 * 	연산자의 종류
 * 		- 단독 사용 : 산술 연산자, 증감 연산자, 대입 연산자
 * 		- 조건 사용 : 비교 연산자, 논리 연산자, 부정 연산자 (if, for, while문에 사용)
 * 
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=10;
		byte b2=20;
		int b3=b1+b2; // byte로 받으면 오류남 (byte+byte=int 라서!) 

		int a=10;
		long b=20L;
		double d=10.5; // d 생략 가능!
		
		double r=a+b+d; // a=10.0, b=20.0, d=10.5 ==> 40.5 (자동 형변환)
	}

}
