/*
 * 	�ڹٿ��� �����ϴ� ���
 * = ���ǹ�, ���ù�
 * 		= �������ǹ� : if 
 * 					���� : if(���ǹ�) ==> ���ǹ��� �ݵ�� ����, ��, �� ������ ������
 * 							{
 * 								������ true�� ���� �����ϴ� ����
 * 							}
 * 		= �������ǹ� : if ~ else
 * 					���� : if(���ǹ�)
 * 							{
 * 								������ true�� ��쿡 �����ϴ� ����
 * 							}
 * 							else
 * 							{
 * 								������ false�� ��쿡 �����ϴ� ����
 * 							}			==> �α��� ó��, ID�ߺ�üũ �� �ַ� ���
 * 		= �������ǹ� : if ~ else if ~ else if ~ else
 * 					���� : if(���ǹ�)
 *							{
 *								������ true�� �����ϴ� ���� => ���� �� ���� ����
 *							}
 *							else if(���ǹ�)
 *							{
 *								������ true�� �����ϴ� ���� => ���� �� ���� ����
 *							}
 *							else if(���ǹ�)
 *							{
 *								������ true�� �����ϴ� ���� => ���� �� ���� ����
 *							}
 *							else if(���ǹ�)
 *							{
 *								������ true�� �����ϴ� ���� => ���� �� ���� ����
 *							}
 *							else
 *							{
 *								�ش� ������ ���� ��쿡 ������ �����ϴ� ���� => ���� ����
 *							}
 *				  
 * 						
 * 		= ���ù� : switch ~ case
 * = �ݺ���
 * 		= �ݺ� Ƚ���� ������ ��� (for)
 * 		= �ݺ� Ƚ���� ���� �ȵ� ��� (while)
 * 		= �ݵ�� �ѹ� �̻� ���� (do~while)
 * = �ݺ����
 * 		= break : �ݺ��� ������ �� ��
 * 		= continue : Ư���κ��� ������ �� ��
 */
import java.util.*;
// ���� 2��, char 1(+, -, *, /)
// ��Ģ����
public class ���_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		// a,b => ����ڰ� �Է�
		// c => ���� ����� ����
		char op='+';
		
		// ������� �Է°��� �޴´�
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� : ");
		a=scan.nextInt();
		
		System.out.println("�ι�° ���� �Է� : ");
		b=scan.nextInt();
		
		System.out.println("������(+, -, *, /) : ");
		op=scan.next().charAt(0);
		// scan.next�� '+' ���°� �ƴ� "+" ���·� �����ͼ� charAt(0) ���� �ϸ� '+' ���·� ������
		// Scanner => char�� �޾Ƽ� ó���ϴ� ����� ���� => ���ڿ�
		// System.in => ����ó���� �ؾ��Ѵ�
		
		// ����ó��
		if(op=='+')
		{
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",a,b,a*b);
		}
		if(op=='/')
		{
			// ���� ó��
			if(b==0)
			{
				System.out.println("0���� ���� �� �����ϴ�");
			}
			else
			{
				System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b); //%.2f => �Ҽ��� 2��° �ڸ�����
			}
		}
		System.out.println("���α׷� ����");
		} //main => end ==> ���α׷� ����
		 // main : ���α׷� ����, ���� �޼ҵ�
	
			
	}

