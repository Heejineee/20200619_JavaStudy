/*
 * 자바 => 기본형 : 자바에서 지원하는 데이터형
 * 				- 논리형 : boolean => 값 : true/false => if(조건문)을 사용할 때 주로 사용하는 데이터형/턴(게임할때 차례 같은거)할 때도 사용
 */
/*
 * double d='a'; ==> d=97.0
 * char c='a'
 * int i='A' ==> i=65
 * 자동 형변환(업캐스팅) : 더 작은 애가 큰애로 선언되면 큰애 되는것
 * 강제 형변환(다운캐스팅) : 반대
 * 
 * byte b1=10;
 * byte b2=20;
 * byte b3=b1+b2; ==> 오류. byte+byte=int인데 byte로 선언해서!
 * 
 * (int)10.5+(int)10.5==>20
 * (int)(10.5+10.5)==>21
 * 
 * ======>upcasting(자동형변환)
 * byte < short(char) < int < long < float < double
 * <===== downcasting(강제형변환)
 */
public class 자바기본형데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용 방법
		boolean b=false; //소문자로만 써야함! ==>1byte값 가짐, 크기 잴 수 없음! 단독적으로 사용
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		
		byte a1=10;
		byte a2=30;
		byte c=(byte)(a1*a2);
		System.out.println(c); //결과값 ==>44 왜냐면 300을 2진법으로 해서 끝에서 8글자만 가져와서,,
		
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println('홍');
		System.out.println((int)'홍');
		System.out.println((char)54861); 
		//각 문자는 숫자 번호를 가지고 있다. (char는 정수형으로 인식한다)
	}

}