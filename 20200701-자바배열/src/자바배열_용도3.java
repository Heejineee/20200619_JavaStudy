// ����ڰ� ���� �Է� => 2���� 16bit(0000 0000 0000 0000)�� ���
import java.util.*;
public class �ڹٹ迭_�뵵3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16]; // 0,1�� ���� / ����ڰ� ��û�� ����
		
		int user=0;
		int index=15; // �ڿ������� ��� ==> �迭 ����
		
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է� : (0~32767) : ");
		user=scan.nextInt();
		System.out.println("====== Library �̿� ======");
		System.out.println(Integer.toBinaryString(user)); // ��������� �̿��Ѱ�
		
		while(true) // ������� => break
		{
			binary[index]=user%2;
			user=user/2;
			if(user==0)break;
			index--;
			
		}
		
		// ��� ���
		for(int i=0; i<16; i++)
		{
			if(i%4==0 && i!=0) // 4�ڸ��� ������ �ϴ°� �ڿ� ���� �Ⱦ��� �� ��ĭ�� ��ĭ ����� �̷��� �ִ°�
				System.out.print(" ");
				System.out.print(binary[i]);
		}
	}

}
