/*
 * 1. ������ �Է¹޾Ƽ� ¦������ Ȧ������ Ȯ�� => �����) 10�� ¦����, 11�� Ȧ����
 * 2. ���� 3���� �Է� �޾Ƽ� ����, ���/���� => ���ǹ� 60 �̻� D / 70 �̻� C / 80 �̻� B / 90 �̻� A / �������� F
 * 																	�������� : 80, �������� : 80, �������� : 80, ���� : 240, ��� : 80.0, ���� : B
 */
import java.util.*;
public class �ڹ����ǹ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int a=0;
		a=scan.nextInt();
		
		if(a%2==0)
		{
			System.out.println(a+"��(��) ¦����");
		}
		else
			System.out.println(a+"��(��) Ȧ����");
	
		
		System.out.println("����, ����, ���� ���� �Է�");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		char score='A';		

		if(avg>=90 && avg<100)
		{
			score='A';
		}
		if(avg>=80 && avg<90) 
		{
			score='B';
		}
		if(avg>=70 && avg<80)
		{
			score='C';
		}
		if(avg>=60 && avg<70) 
		{
			score='D';
		}
		if(avg<60)
		{
			score='F';
		}
		System.out.println("���� : "+sum);
		System.out.printf("��� :%.2f\n",avg);
		System.out.println("���� : "+score);
	}	
}
