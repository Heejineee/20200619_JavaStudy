import java.util.Scanner; //��ĳ�� ������ �����/�ؿ��� Sc�ϰ� ��Ʈ�� �����̽� �ϸ� ������
public class �ڹ���¸޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// \n�� newLine => ���ο� �ٿ� ���
		// \t�� �� => ���� ����
		System.out.printf("%d*%d=%d \t",2,2,4);
		System.out.printf("%d*%d=%d\n",2,3,6);
		
		Scanner scan=new Scanner(System.in); //Ű���� �Է°��� �аڴ�!
		/*
		 * Scanner : ��������
		 * scan : ����
		 * new : �޸𸮿� ����
		 * Scanner(System.in) : �ʱ�ȭ		
		 */
		System.out.print("1' ���� �Է� : ");
		int a=scan.nextInt(); // �Էµ� ������ �о�ͼ� a��� �޸𸮿� ����
		//System.out.print("2' ���� �Է� : ");
		int b=scan.nextInt();
		//���
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		// Scanner => ���������� ���
	}

}

