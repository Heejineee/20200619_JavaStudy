/*
 * 		����ÿ� ���� ����ϴ� ������
 * 			=> ���������� ( ++, --)
 * 			=> ��������� (+, -, *, /)
 * 			=> �񱳿�����, ��������
 * 			=> ���Կ����� (=, +=, -=)
 * 
 * 		��Ÿ ������
 * 			=> ���׿����� (if~else�� ��� => ����)
 * 				 ���� ? ��1:��2
 * 				====
 * 				true => ��1
 * 				false => ��2
 */

import java.util.*;
// import java.lang.* ==> System, String, Math �������
//������ �Է¹޾Ƽ� ¦��/Ȧ�� ���
public class ���׿�����_���� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// System.in : Ű���� �Է�
		// System.out : ȭ��
		
		System.out.print("���� �Է� :");
		// �Է¹��� ������ �����Ѵ�
		int a=scan.nextInt(); // �Է¹��� ���� a�� ����
		System.out.println(a%2==0?"¦���Դϴ�":"Ȧ���Դϴ�");
		
		int b=(int)(Math.random()*100)+1;
		System.out.println("b="+b);
		System.out.println(b%2==0?"¦���Դϴ�":"Ȧ���Դϴ�");
//������� === ============= ==
//				  2					1				  3
/*
 * 		������ �켱����
 * 		1) ()
 * 		2) ���׿�����
 * 		3) ���׿�����
 * 		(Math.random*100)
 * 		=============
 * 		0.0~0.99 ==> 100 ==> 0.0~99.0
 * 		(int)(0.0~99.9) ==> (0~99)+1 ==> 1~100
 */

	}

}
