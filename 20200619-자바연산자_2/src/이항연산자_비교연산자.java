/*
 * 		���׿�����
 * 			- ��� : ������� �� �� ����. ex) int+int = int
 * 														 double+int = double
 * 														 float+long = float
 * 			- �� : true/false
 * 			- �� : true/false	�� ��, �� �����ڴ� ���ǹ�(if)���� ���� ����
 * 			- ����
 * 		�񱳿����� : ���� ���� �� => ����, �Ǽ�, ����, ��
 * 						  ���ڿ��� ���� �� ���� (equals()����ϸ� ��)
 * 						  ���ڿ��� �����ϴ� �������� => String
 * 			1) ����
 * 				- == : ���� ex) 10==20 (false)
 * 				- != : ���� �ʴ� ex) 10!=20 (true)
 * 				- < : �۴� ex) 10<10 (false)
 * 				- > : ũ�� ex) 10>10 (false)
 * 				- <= : �۰ų� ���� ex) 10<=10 (true)
 * 												10<10 || 10==10
 * 				- >= : ũ�ų� ���� ex) 10>=10 (true)
 * 												10>10 || 10==10
 * 			2) ����� : boolean
 */
public class ���׿�����_�񱳿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		char c='A';
		System.out.println(c++); //A ���� B
		System.out.println(c); //B
		System.out.println(b++==a); //b=9 ���� 10
		System.out.println(++b==a); //b=11
		System.out.println(10==20);
		System.out.println(10!=20);
		System.out.println(10<10);
		System.out.println(10>10);
		System.out.println(10<=10);
		System.out.println(10>=10);
		
		System.out.println('A'==65);
		// char�� ���� �����ϸ� ������ ��ȯ�ȴ�
	}

}
