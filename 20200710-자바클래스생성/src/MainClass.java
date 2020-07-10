/*
 * 	클래스
 * 		- 변수 : 여러개를 저장 할 때 (반드시 공통으로 들어가는 데이터)
 * 			  ex) 영화 정보 => 영화명, 감독, 출연, 장르, ...
 * 			- 변수의 종류
 * 					- 멤버변수(=인스턴스 변수) : new를 사용할 때마다 따로 저장되는 변수
 * 						※ 메모리 만들어 지는 시점 : new 사용할 때 
 * 						※ heap : 프로그래머가 관리하는 영역 (자동처리가 안된다)
 * 										메모리를 사용하지 않을 경우 (직접처리, GC)
 * 					- 공유변수(=정적변수=static) : 메모리가 한개 => 공통으로 사용되는 변수
 * 						※ 메모리 만들어 지는 시점 : 컴파일러가 컴파일 할 때 자동으로 생성
 * 					- 지역변수 : 지역변수, 매개변수
 * 						※ 메모리 만들어 지는 시점 : 메소드 호출시에
 * 						※ 메모리가 자체 관리 {}을 벗어나면 자동 회수 => stack(LIFO)
 * 	변수 설정 : 초기값
 * 		- 선언과 동시에 값 주입
 * 		- 생성자
 * 		- 초기화 블록
 * 			- 인스턴스 블록
 * 					class A
 * 					{
 * 						int a;
 * 						{
 * 							a=10;
 * 						}
 * 					}
 * 			-	static 초기화
 * 					class A
 * 					{
 * 						static int a;
 * 						static
 * 					}
 * 						a=10;
 * 			- 명시적 초기화
 * 					class A
 * 					{
 * 						int a=0;
 * 						{
 * 							a=100;
 * 						}
 * 						A(){
 * 							a=1000;
 * 						}
 * 					}
 * 
 * 
 * 	생성자 : 멤버변수의 초기값 부여
 *    			   : 제어문을 이용하거나 파일 읽기, 보안 등 구현하고 데이터 값을 가지고 올 때 쓰임
 * 			   : 매번 생성자 사용하는건 아님, 필요할 때만 쓰면 됨!(=> 생략가능)
 * 			   : 생성자는 반드시 필요하기 때문에 자동으로 컴파일러가 추가함 => default 생성자 => 매개변수가 없는 생성자(보이진 않음)
 * 																														-------------------- Student(){} 같이!
 * 			   : 메모리에 저장(클래스) => 호출되는 메소드
 * 				 ----------------- new 생성자() => 한번만 호출한다 => this(자기 자신) 
 * 
 * 	메소드 : 기능
 * 				: 선언부, 구현부
 * 				리턴형 메소드명(매개변수...) ==> 선언부
 * 				{
 * 					구현부
 * 				}
 * 				==> 선언부+구현부=저장
 * 		종류 
 * 			- 인스턴스 메소드 : 클래스 마다 따로 사용하는 메소드
 * 			- 정적 메소드 : static => 모든 클래스 공통으로 사용되는 메소드 ※ 여러군데서 사용할 경우 static 사용!
 * 			- 추상 메소드 : 선언부만 존재(구현이 안된 메소드) => 책 p377에 있당!
 * 
 * 
 */
class Student{
	//	학생 1명에 대한 정보 => 메모리 공간 여러개 만들 수 있다 (new)
	String name;
	String subject;
	int year;	
	static String school;	// 메모리에 저장됨(static이라)
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.school="SIST"; 	// static 변수 사용
		Student s=new Student();		 // name, subject, year => s라는 주소에 저장
		System.out.println(s);
		
		System.out.println(s.name);		// 값 넣기 전 초기값 => null, null, 0
		System.out.println(s.subject);
		System.out.println(s.year);
		
		s.name="홍길동";
		s.subject="개발과";
		s.year=3;
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);	// 이건 계속 같은 값 SIST
		
		Student s1=new Student();
		System.out.println(s1);	// 위 s값과 주소값이 다름
		
		System.out.println(s1.name);  // 값 넣기 전 초기값 => null, null, 0
		System.out.println(s1.subject);
		System.out.println(s1.year);
		s1.name="심청이";
		s1.subject="광고과";
		s1.year=2;
		
		System.out.println(s1.name);	
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		/*
		 * 출력 결과
		 * Student@15db9742
			null
			null
			0
			홍길동
			개발과
			3
			SIST
			Student@6d06d69c
			null
			null
			0
			심청이
			광고과
			2
			SIST
		 */
		
		String ss="Hello Java";
		ss.replace('H','K');
		String ss1="1234567890";
	}

}
