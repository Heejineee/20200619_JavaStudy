/*
 * 		���� ���ǹ�
 * 		if(���ǹ�)
 * 		{
 * 			���ǹ��� true�� �����ϴ� ���� ����
 * 		}
 * 		else
 * 		{
 * 			���ǹ��� false�� �� �����ϴ� ���� ����
 * 		}
 * 
 * 		���ǹ� �ٽ� => ���� ����
 */
import java.util.*;
public class ���_�������ǹ� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �Ѱ��� �Է� �޾Ƽ� ���ĺ����� Ȯ��
		char ch='a'; // ���� �ʱ�ȭ (�ݵ�� �ؾ���)
		/* ������ ������ �ʱⰪ
		 * int => 0
		 * double => 0.0
		 * long => 0L
		 * boolean => false
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Ѱ��� �Է��ϼ���");
		// �ڹٴ� ��� ���� ��ȣ�� 0���� �����Ѵ�
		ch=scan.next().charAt(0);
		// ���ڳİ� ����� ch>='0' && ch<='9'
		/*if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
		{
			System.out.println(ch+"��(��) ���ĺ� �Դϴ�.");
		}
		else
		{
			System.out.println(ch+"��(��) ���ĺ��� �ƴմϴ�.");
		}
		}
		*/
		
		if(ch>='0' && ch<='9')
		{
			System.out.println("�����Դϴ�");
		}
		else
		{
			System.out.println("�����Դϴ�");
		}

	}
}


