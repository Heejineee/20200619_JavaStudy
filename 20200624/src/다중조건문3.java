// ��Ģ���� 
/*
 * ���� => ���� 2��, ������(+, -, *, /)
 * 		  
 */
import java.util.*;
public class �������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		char op='+';
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է� ex)90 100 : ");
		a=scan.nextInt();
		b=scan.nextInt();
		
		System.out.println("������ �Է�(+, -, *, /) : ");
		op=scan.next().charAt(0);
		
		if(op=='+')
		{
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		else if(op=='-')
		{
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		else if(op=='*')
		{
			System.out.printf("%d*%d=%d\n",a,b,a*b);
		}
		else if(op=='/')
		{
			if(b==0)
			{
				System.out.printf("0���� ���� �� ����!");
			}
			else
			{
				System.out.printf("%d/%d=%.2f\n",a,b,(double)a/b);
			}
		}
		else
		{
			System.out.println("�߸��� ������ �Է��Դϴ�!");
		}
		}

	}