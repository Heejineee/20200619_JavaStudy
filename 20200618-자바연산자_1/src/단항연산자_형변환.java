/*
 * 필요시에 데이터형을 변경해서 사용 : 강제 형변환
 * 
 * int + double = double (자동 형변환)
 * ==
 * double로 변환
 * 
 * char + int = int
 * ===
 * int로 변환
 * 
 * int + long
 * ==
 * long으로 변환
 * 
 * char + int + long + double ==> 최종 결과값은 double
 * ===
 *  int
 * =======
 * 		int
 * ===========
 * 			long
 * ===================
 * 				double
 * 
 * (int)double ==> int ==> 큰데이터 => 작은데이터 변경
 * (char)int ==> char
 * 
 * 1) boolean은 제외
 * 2. int 이하는 연산을 하면 결과값이 int
 * 		ex) byte+byte => int
 * 			 char+char => int
 * 			 char+short+byte => int
 * 
 */
public class 단항연산자_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자동형변환
		int a='A'; //a=65
		double d=10; //d=10.0
		//			  int
		char c=65; //c='A';
		
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//강제형변환
		int i=(int)10.5;
		int ii=(int)'A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		
	}

}
