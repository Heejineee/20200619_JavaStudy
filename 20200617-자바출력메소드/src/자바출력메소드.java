/*
 * 		화면 출력
 * 			= System.out.println() : 다음 줄에 출력(세로출력)
 * 				ex) System.out.println("Hello");
 * 					 System.out.println("Java");
 * 			 결과 => Hello
 * 						 Java
 * 			= System.out.print() : 옆에 출력(가로출력)
 * 				ex) System.out.println("Hello");
 * 					 System.out.println("Java");
 * 			 결과 => HelloJava
 * 			= System.out.printf() :서식이 있는 출력
 * 				ex) System.out.printf("%5d%5d%5d%5d%5f,%5c",80,80,80,80,80.0,'B') 
 * 					=> 5칸 중 오른쪽에 숫자 넣고 나머지 여백(반대로 하려면 %-5d, %5.2f는 소숫점 이하 2개 한다는거 기본으론 6개임) 정수(d), 문자(c), 실수(f) 출력
 */
public class 자바출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.1f",80.55);
		
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); //printf는 JDK 1.5부터
		
		/*
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %s : 문자열
		 */
	}

}
