import java.util.*;
public class �ݺ���_2��for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * *
 * **
 * ***
 * ****
 * ***** ==> ����ڰ� �Է��� ������ŭ
 */
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int user=scan.nextInt();
		
		for(int i=1; i<=user; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.printf("[%d,%d]",i,j);
			}
			System.out.println();
		}
	}
}
		
