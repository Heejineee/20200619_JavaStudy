
public class MainClass1 {
	public static void main(String[] args) {
		//ǥ�� => �ڹ�
		/*
		 * ����
		 * 		= 10���� (10, 20...)
		 * 		= 8���� (011 => 9) �տ� 0�� ������ 8����
		 * 		= 16���� (0x10) 0x �տ� ����
		 * 		= 2���� (0b1010) 0b �տ� ����
		 * �Ǽ�
		 * 		= ���� ũ�� => 4byte		10.5f (�Ҽ��� ���� 8�ڸ����� ����)
		 * 		= ���� ũ�� => 8byte		10.5 (�Ҽ��� ���� 16�ڸ����� ����)
		 * ����
		 * 		= '' => �ѱ��ڸ� ����
		 * ���ڿ�
		 * 		= "" => ���� ���� ����
		 * �ڹٴ� Unicode (2byte)
		 * ASC(�ƽ�Ű)�ڵ� �� �ַ� C��� (1byte, �ѱ� �ȵ�)
		 */
		System.out.println('A');
		System.out.println("�ȳ�");
		System.out.println(10.5);
		System.out.println(10.5f); //��ҹ��� ���� x
		System.out.println(10.5F);
		
		System.out.println(10);
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0xA);
		
		/*
		 * 1. �⺻ ����
		 * 		- ��ҹ��� ����
		 * 		- ���̺귯�� (Ŭ���� : ��ҹ���, �޼ҵ�: �ҹ���, ��� : ��� �빮��)
		 * 		PI=3.14
		 * 		- ����/���
		 * 			int kor=100; => ����
		 * 			final int KOR=200; => ���
		 * 		- ��ɹ��� ���ᰡ �Ǹ� �ݵ�� ;
		 * 		- �鿩���� 
		 */
	}
}
