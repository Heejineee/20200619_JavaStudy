// ���� ���� ��
/*
 * 0 => ����
 * 1 => ����
 * 2 => ��
 */
import java.util.*;
public class �ڹٹ迭_�뵵 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ǻ�� => ����
		int com=(int)(Math.random()*3); // 0~2
		// ����� �Է�
		Scanner scan=new Scanner(System.in);
		System.out.print("0(����), 1(����), 2(��) : ");
		int user=scan.nextInt();
		
		// �Էµ� ��� Ȯ��
		String[] result= {"����","����","��"};
		System.out.println("��ǻ�� : "+result[com]);
		System.out.println("����� : "+result[user]);
		
	
	}

}
