/*
 * 'A'+'B' =>������ȯ : 65+66=131(int) char, short, byte => ���� => ����� int
 * 
 * �� ������ : ���������� �ʰ��ϸ� error�� �ƴ϶� �����÷ο츦 �߻�  ex) int ==> 1~10 �� �� 11 �� ������ �ƴ� 1
 * 
 * 10+10.5 ==> double
 * ==
 * 10.0  ==> ���� ���������� ������ ����
 * 
 * 'A'+1 ==> int
 * ==
 * 65
 * 
 */
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=64;
		byte b2=64;
		byte b3=(byte)(b1+b2);
		System.out.println("b3="+b3); //�����÷ο� �߻��ؼ� ����� -128
		
		int a=5;
		int b=2;
		
		System.out.println(a%b); //5%2 ==>1
		System.out.println(-a%b); //-5%2 ==>-1
		System.out.println(a%-b); //5%-2 ==>1
		System.out.println(-a%-b); //-5%-2 ==>-1
		
		System.out.println((int)(10.5+10.5));
		System.out.println((int)10.5+(int)10.5); 
		/*��������ȯ
		 * (int)(10.5+10.5)
		 *       ========
		 *       1=>21.0==>21
		 * (int)10.5+(int)10.5 ==> 20
		 * ====== ======
		 *    10            10
		 */
	}

}
