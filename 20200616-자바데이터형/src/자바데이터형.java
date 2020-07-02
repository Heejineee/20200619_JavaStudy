/*
 * 		자바에서 사용하는 데이터형(자료형) => 메모리의 크기 지정 / 컴퓨터는 0,1 => bit
 * 
 * 		- 정수
 * 			= byte (0,1을 8개를 저장하는 공간) => 8bit(=1byte) ex) 11111111(음수, -128) / 01111111 (양수, 127) => -128~127 저장
 * 			   주로 파일 읽기, 쓰기, 업로드, 다운로드, 네트워크 전송 에 쓰임 
 * 			= short (0,1을 16개를 저장하는 공간) => 16bit(=2byte) ex) 1111 1111 1111 1111(-32768) / 0111 1111 1111 1111 (32767) => -32768~32767 저장
 * 			   C언어와 호환성을 위해 쓰임 (사용빈도가 없다)
 * 			= int (0,1을 32개를 저장하는 공간) => 32bit(=3byte) ex) 1111 1111 1111 1111 1111 1111 1111 1111 / 0111 1111 1111 1111 1111 1111 1111 1111
 * 			   평상시에 사용하는 모든 정수는 컴퓨터에서 int로 인식을 한다. => default (자바 코딩의 정수는 대부분 int 사용)
 * 			= long (0,1을 64개를 저장하는 공간)
 * 			   빅데이터, 금융권, 주식에 주로 사용
 * 		- 실수
 * 			= 4byte => 소수점(6자리) ==> float
 * 			= 8byte => 소수점(15자리) ==> double ==> default
 * 			※ 문제점 : 작은건 큰거에 들어가지만 큰건 작은거에 못들어감 ex) float f = 10.5; => f 안붙이면 기본적으로 double인데 더 작은 float으로 선언해서 오류남.
 * 						  그러니 저장 공간이 첨부할 값보다 크거나 같아야 한다. (저장 공간은 float, 첨부할 값은 10.5)
 * 		- 문자
 * 			= char (0,1 => 16bit) : 음수는 없이 양수만 ==> 0~65535
 * 			※ 문자마다 고유의 번호를 갖고 있다. 'A' ==> 65, 'a' ==> 97, '0' ==> 49
 * 		- 논리
 * 			= boolean (1byte) => true/false 저장 / 로그인 처리시, 아이디 체크(아이디 있냐 없냐) 주로 사용
 * 
 *  	메모리에 저장하는 크기 (byte 크기 비교가 아니라 수를 얼마나 많이 표현하냐에 따라 나눈거임)
 *  	 byte < short < int < long < float < double
 *  			   char
 *  	쓸 때 int는 그냥 숫자 10, 20 / long은 10l, 20L 이런식으로
 *  		   float은 10.5f, 10.5F / double은 그냥 10.5 이렇게
 *  
 *  
 *  변수 : 한개의 데이터를 저장하는 메모리 공간의 별칭
 *  변수명 제작
 *  	1) 알파벳이나 한글로 시작한다
 *  		알파벳은 반드시 대소문자 구분 (a와 A는 다른 것)
 *  	2) 숫자 사용이 가능 (단, 맨 앞에는 사용할 수 없다) a1, a2 이런식은 가능 / 2a, 1a 는 불가능
 *  	3) 특수문자 사용 가능(_, $) / 언더바는 임시파일, 단어가 여러개일 경우에 주로 사용
 *  	4) 키워드(자바에서 사용중인 단어)는 사용할 수 없다.
 *  	5) 변수의 길이는 15자 이내로 한다. (보통 3~7자리 사용)
 *  
 *  변수 선언 / 초기화
 *  1) 변수 선언 => 저장 해야되는 데이터가 존재 / 변수는 반드시 초기값을 설정해야 한다.
 *  	형식) 데이터형 변수명; 
 *  		ex) 점수를 저장 => int jumsu;
 *  								 jumsu = 100; -> 키보드로 입력을 받거나 파일에 있는 데이터 읽을 때 사용
 *  								 (int jumsu = 100;) -> 직접 입력 방식
 *  		ex) 여러개 잡을 때 => int a=0;
 *  									 int b=0;
 *  									 int c=0;
 *  									 (int a,b,c;
 *  									  int a=0, b=0, c=0;)
 *  
 *  변수의 초기값
 *  1. 정수형
 *  	byte ==> 0
 *  	short ==> 0
 *  	int ==> 0
 *  	long ==>0L
 *  2. 실수형
 *  	float ==> 0.0F(f)
 *  	double ==> 0.0D(d) => d(D)는 생략 가능
 *  3. 문자형
 *  	'A' ==> ''(error)
 *  4. 논리형
 *  	boolean ==> false/true
 *  ※ 모든 변수는 초기화를 해야 한다.
 */
public class 자바데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학, 총점, 평균, 학점
		int kor=80;
		int eng=80;
		int math=80;
		
		int total=240;
		double avg=80.0;
		char score='B';
		
		//출력
		System.out.println("국어점수 : "+kor); //문자열 결합
		System.out.println("영어점수 : "+eng);
		System.out.println("수학점수 : "+math);
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+avg);
		System.out.println("학점 : "+score);
	}

}
