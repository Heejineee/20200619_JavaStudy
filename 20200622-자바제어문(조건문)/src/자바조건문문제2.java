/*
 * ����� �Է� ==> 0,1,2
 * 					  => 0�̸� ����
 * 					  => 1�̸� ����
 * 					  => 2�̸� ��
 */
import java.util.*;
public class �ڹ����ǹ�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("0, 1, 2 �� �ϳ��� �Է� �ϼ���");
		int user=scan.nextInt();
		
		if(user==0)
		{
			System.out.println("Player : ����");
		}
		if(user==1)
		{
			System.out.println("Player : ����");
		}
		if(user==2)
		{
			System.out.println("Player : ��");
		}
		
		//��ǻ��
		int com=(int)(Math.random()*3); //Math.random ==> 0.0 ~ 0.99 ==> 3�� �������� 0.0 ~ 2.9... ==> int ������ 0~2
		
		if(com==0)
		{
			System.out.println("Computer : ����");
		}
		if(com==1)
		{
			System.out.println("Computer : ����");
		}
		if(com==2)
		{
			System.out.println("Computer : ��");
		}
		
		//����� : ��ǻ��
		//��ǻ�Ͱ� ������ ��
		if(com==0)
		{
			if(user==0)
			{
				System.out.println("���º�");
			}
			if(user==1)
			{
				System.out.println("Player ��");
			}
			if(user==2)
			{
				System.out.println("Computer ��");
			}
		}
		//��ǻ�Ͱ� ������ ��
		if(com==1)
		{
			if(user==0)
			{
				System.out.println("Computer ��");
			}
			if(user==1)
			{
				System.out.println("���º�");
			}
			if(user==2)
			{
				System.out.println("Player ��");
			}
		}
		//��ǻ�Ͱ� ���� ��
		if(com==2)
		{
			if(user==0)
			{
				System.out.println("Player ��");
			}
			if(user==1)
			{
				System.out.println("Computer ��");
			}
			if(user==2)
			{
				System.out.println("���º�");
			}
		}
		
		//�ٿ���
		if(com-user==-2 || com-user==1)
		{
			System.out.println("Computer Win!");
		}
		if(com-user==-1 || com-user==2)
		{
			System.out.println("Player Win!");
		}
		if(com-user==0)
		{
			System.out.println("����!");
		}
		
		// �� ����, �Ǽ�, ������ ��쿡�� == ��� ����
		// "" ���ڿ��� ==���� �� �Ұ��� ==> equals() ���
		
	}

}
