/*
 * 	�޼ҵ� : �Ѱ��� ��ɸ� ���� => ������ �ٽ� ����� �� �ְ� �����
 * 		- ���� : ����, �ݺ� ����
 * 		- ���� : 
 * 				- ��ȯ���� ���� ��� : void ���
 * 				- �Ű������� ���� ��� (�Ű����� => �ַ� ����ڰ� ��û�� ��)
 * 				- ��ȯ���� ���� => ����ڰ� ��û�� ������ ����� => �ݵ�� �Ѱ��� ����
 * 											   �������� ��� : �迭, Ŭ����
 *					- �Ű������� ���� => ���̵� �ߺ�üũ(�Ű������� ID), �����ȣ �˻�(�Ű������� ��, ��)
  				ex) ��ȯ��(������) �޼ҵ��(�Ű�����, �Ű�����..)
  				 		{
  				 			���� => return (�� �������� ���°� �ƴ�/�����ϰ� ���� �� �߰����� ��� ����!)
  				 						�� return ���� �ؿ��� �ҽ� �ڵ��� �� �� ����!
  				 							break, continue�� ���������� ���α׷� �����ϴ� �����̱� ������ �� �� �ؿ��� �ڵ� �ȵ�
  				 		}  				 
 * 		- �޼ҵ�� ȣ��ø��� ó������ return���� ���� => �ٽ� ȣ���� ��ġ�� ���ƿ´�
 */
//	����ڰ� �⵵�� �Է��ϸ� ���� ���θ� Ȯ��
import java.util.*;
public class �ڹٸ޼ҵ� {
	// ����ڰ� �⵵ �Է��ϴ� �޼ҵ�
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("�⵵�� �Է� : ");
		int year=scan.nextInt();
		return year;
	}
	// ���⿩�θ� Ȯ���ϴ� �޼ҵ�
	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			bCheck=true;
		}
		else
		{
			bCheck=false;
		}
		return bCheck;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �޼ҵ� �ƴ� �Ϲ� �ڵ�
			Scanner scan=new Scanner(System.in);
			System.out.println("�⵵�� �Է� : ");
			int year=scan.nextInt();
			if((year%4==0 && year%100!=0) || (year%400==0))
			{
				System.out.println(year+"�⵵�� �����Դϴ�");
			}
			else
			{
				System.out.println(year+"�⵵�� ������ �ƴմϴ�");
			}
		*/
		int year=userInput();
		boolean bCheck=isYear(year);
		if(bCheck==true)
			System.out.println("�����Դϴ�");
		else
			System.out.println("������ �ƴմϴ�");
		

	}

}
