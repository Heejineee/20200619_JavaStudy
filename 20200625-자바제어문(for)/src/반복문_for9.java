// ��ǻ�Ͱ� 1~100������ ���� �߻�, ����ڰ� ���� ���ߴ� ���� / ��Ʈ=>����, ���� ���
import java.util.*;
/*
 * 1. ��ǻ�Ͱ� ���� �߻�
 * 2. ����� �Է�
 * 3. �Է��ϸ� ��Ʈ
 * 4. ���� ����
 */
public class �ݺ���_for9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1; // 1~100 ���� ���� �߻�
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(;;) // ���ѷ��� => while(true) ����
		{
			System.out.print("1~100 ������ ���� �Է� : ");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("�߸��� �Է��Դϴ�!!!");
				continue; //ó������ �ٽ� ���ư���
			}
			count++;
			if(com>user)
			{
				System.out.println("�Էµ� ������ ���� ���� �Է��ض�");
			}
			else if(com<user)
			{
				System.out.println("�Էµ� ������ ���� ���� �Է��ض�");
			}
			else
			{
				System.out.println("Game over");
				System.out.println("�Է�Ƚ�� : "+count);
				break;
			}
			
			System.out.println();
			}
		}
		
	}

