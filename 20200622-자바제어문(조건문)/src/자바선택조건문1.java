/*
 * 		���� ���ǹ� : if~else (�α��� ó��/ ���̵� �ߺ�üũ/�۾��� (����/���)/¦���� Ȧ����/�빮�ڳ� �ҹ��ڳ� � ����)
 * 			����)
 * 					if(���ǹ�)
 * 					{
 * 						==> ������ true�� �� ó���ϴ� ����
 * 					}
 * 					else
 * 					{
 * 						==> ������ false�� ��쿡 ó���ϴ� ����
 * 					}
 * 
 */
import java.util.Scanner; //Ű����κ��� �Է°��� �޴´�
public class �ڹټ������ǹ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner�� ���� => Ű������ �Է°��� �ִ� ��쿡 ó��
		Scanner scan=new Scanner(System.in);
		//�ڹ��� ��� Ŭ����, ����� ���� Ŭ���� ==> ������ �� ��
		//�ݵ�� new �̿��ؼ� ����
		//System.in ==> ����� Ű���� �Է°��� �ݵ��.
		//System.out ==> ����Ϳ� ����� �� ���
		System.out.print("������ �Է�(1~100) : ");
		int a=scan.nextInt(); //�Էµ� ���� �޾Ƽ� a��� �޸� ������ ����
		if(a<1 || a>100)
		{
			System.out.println("�߸��� �Է��Դϴ�\n���α׷��� �����մϴ�.");
		}
		else
		{
			//1~100���� ������ ������ �Է��� �Ǿ�����
			System.out.println(a+"�� �ԷµǾ����ϴ�~");
			
		}
	}

}
