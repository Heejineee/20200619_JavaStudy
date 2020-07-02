/*
 * 'A'+'B' =>정수변환 : 65+66=131(int) char, short, byte => 연산 => 결과값 int
 * 
 * ※ 주의점 : 데이터형을 초과하면 error가 아니라 오버플로우를 발생  ex) int ==> 1~10 일 때 11 은 에러가 아닌 1
 * 
 * 10+10.5 ==> double
 * ==
 * 10.0  ==> 같은 데이터형만 연산이 가능
 * 
 * 'A'+1 ==> int
 * ==
 * 65
 * 
 */
public class 이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=64;
		byte b2=64;
		byte b3=(byte)(b1+b2);
		System.out.println("b3="+b3); //오버플로우 발생해서 결과값 -128
		
		int a=5;
		int b=2;
		
		System.out.println(a%b); //5%2 ==>1
		System.out.println(-a%b); //-5%2 ==>-1
		System.out.println(a%-b); //5%-2 ==>1
		System.out.println(-a%-b); //-5%-2 ==>-1
		
		System.out.println((int)(10.5+10.5));
		System.out.println((int)10.5+(int)10.5); 
		/*강제형변환
		 * (int)(10.5+10.5)
		 *       ========
		 *       1=>21.0==>21
		 * (int)10.5+(int)10.5 ==> 20
		 * ====== ======
		 *    10            10
		 */
	}

}
