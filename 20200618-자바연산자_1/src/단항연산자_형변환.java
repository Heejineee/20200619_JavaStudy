/*
 * �ʿ�ÿ� ���������� �����ؼ� ��� : ���� ����ȯ
 * 
 * int + double = double (�ڵ� ����ȯ)
 * ==
 * double�� ��ȯ
 * 
 * char + int = int
 * ===
 * int�� ��ȯ
 * 
 * int + long
 * ==
 * long���� ��ȯ
 * 
 * char + int + long + double ==> ���� ������� double
 * ===
 *  int
 * =======
 * 		int
 * ===========
 * 			long
 * ===================
 * 				double
 * 
 * (int)double ==> int ==> ū������ => ���������� ����
 * (char)int ==> char
 * 
 * 1) boolean�� ����
 * 2. int ���ϴ� ������ �ϸ� ������� int
 * 		ex) byte+byte => int
 * 			 char+char => int
 * 			 char+short+byte => int
 * 
 */
public class ���׿�����_����ȯ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ڵ�����ȯ
		int a='A'; //a=65
		double d=10; //d=10.0
		//			  int
		char c=65; //c='A';
		
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//��������ȯ
		int i=(int)10.5;
		int ii=(int)'A';
		System.out.println("i="+i);
		System.out.println("ii="+ii);
		
	}

}
