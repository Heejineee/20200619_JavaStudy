/*
 * 2~9 ����ڰ� �Է� ������ ���
 */
import java.util.*;
public class �ݺ���_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("2~9 ���� �Է�");
		dan=scan.nextInt();
		
		for(int i=1; i<=9; i++)
		{
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		

	}

}
