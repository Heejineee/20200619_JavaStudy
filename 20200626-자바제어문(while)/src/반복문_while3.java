/*
 * 	String : Ŭ����
 * 	��� (����) 
 *  1) ���ڰ���
 * 		ex)	String s="ABCDEF";
 * 				s.length() => 6
 * 	2) ���� ����
 * 		ex)	String s="ABCDEF";
 * 				s.charAt(0) => 'A'
 * 			
 */
// ����� ���ڿ��� �Է�
// �빮�� ����, �ҹ��� ���� Ȯ��
import java.util.*;
public class �ݺ���_while3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=""; // ���� ������ ����
		Scanner scan=new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		s=scan.nextLine(); // String���� ���� ���� ���� / next�� scanner �ϳ��� �ϳ��� �ν��ؼ� ���� �ϸ� ���� ���� �� / nextLine�� ���⵵ ����!
		System.out.println(s);
		System.out.println("���� : "+s.length());
		
		int a=0, b=0;
		// a => �ҹ��� ����
		// b => �빮�� ����
		int i=0; // ������ ������ŭ �����ϴ� ���� => ��������
		
		while(i<s.length())
		{
			char c=s.charAt(i);
			if(c>= 'A' && c<='Z')
				b++;
			if(c>='a' && c<='z') // ���ĺ� �ƴ� ���ڸ� �Է��� ���� ������ else �Ⱦ�
				a++;
			
			i++;
		}
		System.out.println("�빮�� ���� : "+b);
		System.out.println("�ҹ��� ���� : "+a);
		

	}

}
