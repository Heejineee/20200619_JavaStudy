
import java.util.*;
public class �������ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����� => �����Է� (1~12)
		 * 12, 1, 1 => �ܿ��Դϴ�
		 * 3, 4, 5 => ���Դϴ�
		 * 6, 7, 8 => �����Դϴ�
		 * 9, 10, 11 => �����Դϴ�
		 */
		/*
		int month=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� (1~12)");
		month=scan.nextInt();
		
		if(month==12 || month>=1 && month<3)
		{
			System.out.println("�ܿ��Դϴ�");
		}
		else if(month>=3 && month<6)
		{
			System.out.println("���Դϴ�");
		}
		else if(month>=6 && month<9)
		{
			System.out.println("�����Դϴ�");
		}
		else if(month>=9 && month<12)
		{
			System.out.println("�����Դϴ�");
		}
		else
			System.out.println("1~12�� ���ڸ� �Է��ϼ���");
		*/
		
		//���� �Է¹޾Ƽ� ����/���ĺ�/�ѱ�/Ư������ ����
		char ch='a';
		System.out.println("���ڸ� �Է��ϼ���!");
		Scanner scan=new Scanner(System.in);
		ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
		{
			System.out.println("�����Դϴ�");
		}
		else if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
		{
			System.out.println("���ĺ� �Դϴ�");
		}
		else if(ch>='��' && ch<='�R' || ch>='��' && ch<='��')
		{
			System.out.println("�ѱ� �Դϴ�");
		}
		else 
		{
			System.out.println("Ư������ �Դϴ�");
		}
	}

	
	
}
