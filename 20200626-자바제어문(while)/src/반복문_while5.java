/*
 * 	������
 * 	1) while�� ������ ���� ��� error => for(;;)
 * 		ex) while()
 * 			{
 * 			} ==> ���� �߻� (���ǽ��� ���)
 * 	2) while���� ���ѷ��� 
 * 		=> for(;;) => while(true) : ���� ���� �����ϴ� ����
 * 		ex) for(int i=0; i<10; i++)
 * 					��(���� ����)
 * 			 int i=0;
 * 			 while(i<10)
 * 			 {
 * 					i++;
 * 			 }
 * �� 	for(int j=1; j<=10; j++)
		 {			
		 } ==> j�� �޸𸮿��� �������(==> ��������) ==> for �ۿ����� ���Ÿ� �ۿ��� �����ϰ� ��!
 */
// ���� �Է��ϸ� 1���� �� ���ڱ����� ���� ���ϱ�
import java.util.*;
public class �ݺ���_while5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0; // ����� ��û�� ����
		int i=1; // ����� �䫊�� �������� ���� (��������)
		int sum=0;  // ����(��)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է� :");
		user=scan.nextInt();
		
		while(i<=user)
		{
			sum+=i;
			i++;
		}
		System.out.println("i = "+i); 	// i=i+1
		System.out.println("sum = "+sum);
		
		
	}

}

