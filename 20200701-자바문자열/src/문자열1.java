/*
 * ���ڿ� �� : equals()
 * ���� ã�� : contains()
 * ���� ���ڿ� : startsWith()
 * ������ ���ڿ� : endsWidth()
 * ���ڿ� �ڸ��� : substring()
 * ���� ���� : charAt()
 * ������ ���� : length()
 * ���鹮�� ���� : trim()
 * ������ ��ġ ã�� : indexOf(), lastIndexOf()
 * ����ȯ : valueOf()
 */
// �α��� ó��
import java.util.*;
public class ���ڿ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id, pwd
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ID�� �Է� : ");
		String id=scan.nextLine();
		System.out.println("��й�ȣ �Է� : ");
		String pwd=scan.nextLine();
		
		/*
		 * equls : ��ҹ��� �����ؼ� �� (�ַ� pwd�� ����)
		 * equlsIgnoreCase : ��ҹ��� ���� ���� �� (�ַ� id�� ����)
		 */
		// ���
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) // id==ID �̷��� �ϸ� �ȵ� (���ڿ� ���� �� equals �����) Ŭ������ ��������� �ٸ� (�ּҸ� �����ϰ� ���� ���� ����)
		{
			System.out.println("�α��� �Ǿ����ϴ�!");
		}
		else
		{
			System.out.println("ID�� ��й�ȣ�� Ʋ���ϴ�!");
		}
		

	}

}
