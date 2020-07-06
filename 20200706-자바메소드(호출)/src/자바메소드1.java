/*
 * 	메소드 : 특정 작업을 수행하기 위한 컴퓨터의 명령문의 집합
 * 				: 한가지 일만 수행
 * 				: 세분화 작업
 * 		목적 : 재사용성, 중복된 코드 제거
 * 	 사용법 : 구조화 (단락(기능))
 * 
 *   	명령문 => 메소드(한개의 기능) => 클래스 => 패키지 => .jar(라이브러리)
 *   	
 *   	메소드 
 *   		- 사용자 정의 메소드
 *   				- 형식)	반환형 메소드명(매개변수...)
 *   							{
 *   								return 값; => 값=반환형
 *   								반환형이 없는 경우에는 void, return은 생략이 가능
 *   							}
 *   							==> 메소드 안에서 처리 => 출력 (일반 도스)
 *   							==> 메소드 안에서 처리 => 결과값을 전송 할 수 있다 (웹, 윈도우)
 *   				- 호출)	메소드명(값,값) 
 *   					 ex)	void method(int a, int b)
 *   							=> method(10,20)
 *   							※ 메소드를 호출하고 메소드 수행이 종료(return) => 다시 호출된 위치로 돌아온다
 *   						
 *   							int method() => 호출 => int a=method()
 *   							String method(int a) => 호출 => String s=method(10)
 *   							double method(int a) => 호출 => double d=method(10) ==> int a=10
 *   
 *   							double random()
 *   							String substring(int s, int e)
 *   							boolean equals(String s)
 *      						void printLn()
 *      
 *      						반환형(리턴형)			매개변수
 *         					===================
 *         								O						O			String substring(int s, int e)
 *         					===================
 *         								O						X			int length() // double random()	
 *         					===================	
 *         								X(void)			O			System.out.println(String s)
 *         					===================
 *         								X(viod)			X			System.out.println() =>  다음줄에 ㅊㄹ력			
 *   
 *   		- 라이브러리 메소드
 */
// 실행 형식 => 메소드가 종료해야 다른 문장을 수행한다
public class 자바메소드1 {
	static void aaa()
	{
		System.out.println("aaa() 호출 시작");
		bbb();
		System.out.println("aaa()  호출 종료");
	}
	static void bbb()
	{
		System.out.println("bbb() 호출 시작");
		ccc();
		System.out.println("bbb()  호출 종료");
	}
	static void ccc()
	{
		System.out.println("ccc() 호출 시작");
		ddd();
		System.out.println("ccc()  호출 종료");
	}
	static void ddd()
	{
		System.out.println("ddd() 호출 시작");
		System.out.println("ddd)  호출 종료");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa();	// 시작하는 메소드를 호출(시작한 점만 호출)
	}

}
