import java.util.*; //Scanner=>������ ������� �ڹ������� �о� �´�
/*
 * class Scanner {
 * }
 * ���� import�� �̷� �ǹ̴�~
 */
public class �ڹ�����¸޼ҵ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Է°� �ޱ�
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է� : "); //println �ϸ� ���� �Է� : �ϰ� �ؿ� �Է��ϰ� �Ǵµ� �̰� ���� �� �� �ִ� 
		int a=scan.nextInt(); //�Ǽ� �Է� �������� double a=scan.nextDouble(); 
		//double a=100 ==> a=100.0
		//char a=97 ==> a='a'
		System.out.println("a="+a);
		
		System.out.println(~100); //����ǥ��. ���� ������ ��
		System.out.println(Integer.toBinaryString(240)); //2�������� �ٲ��� ==> ��� 11110000 ���� �����ϱ� 0b�ٿ��� 2���� 0b11110000 �̶�� �ؾ���
		System.out.println(Integer.toHexString(240)); //8�������� �ٲ��� ==> ��� 360 ���� �����ϱ� 0�ٿ��� 8���� 0360 �̶�� �ؾ���
		System.out.println(Integer.toOctalString(240)); //16�������� �ٲ��� ==> ��� f0 ���� �����ϱ� 0x�ٿ��� 16���� 0xf0 �̶�� �ؾ���
	}

}
