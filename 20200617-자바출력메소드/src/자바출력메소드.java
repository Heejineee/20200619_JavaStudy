/*
 * 		ȭ�� ���
 * 			= System.out.println() : ���� �ٿ� ���(�������)
 * 				ex) System.out.println("Hello");
 * 					 System.out.println("Java");
 * 			 ��� => Hello
 * 						 Java
 * 			= System.out.print() : ���� ���(�������)
 * 				ex) System.out.println("Hello");
 * 					 System.out.println("Java");
 * 			 ��� => HelloJava
 * 			= System.out.printf() :������ �ִ� ���
 * 				ex) System.out.printf("%5d%5d%5d%5d%5f,%5c",80,80,80,80,80.0,'B') 
 * 					=> 5ĭ �� �����ʿ� ���� �ְ� ������ ����(�ݴ�� �Ϸ��� %-5d, %5.2f�� �Ҽ��� ���� 2�� �Ѵٴ°� �⺻���� 6����) ����(d), ����(c), �Ǽ�(f) ���
 */
public class �ڹ���¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.1f",80.55);
		
		int a=2;
		int b=2;
		System.out.println(a+"*"+b+"="+a*b);
		System.out.printf("%d*%d=%d",a,b,a*b); //printf�� JDK 1.5����
		
		/*
		 * %d : ����
		 * %f : �Ǽ�
		 * %c : ����
		 * %s : ���ڿ�
		 */
	}

}
