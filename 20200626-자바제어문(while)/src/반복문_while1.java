/*
 * 	while => ���ѷ��� (�����ͺ��̽� (����Ŭ), ���� �б�, ���� ����)
 * 								==============      			======
 * 									���� : XML, JSON
 * 									=> break(����) �ݵ�� �������
 * 	����)
 * 			�ʱⰪ ------------- 1 (�������)
 * 			while(���ǽ�) ----- 2 ==> true ==> {} �ȿ� �ִ� ���� ���� / false(����)
 * 			{
 * 				�ݺ����๮�� -- 3
 * 				������  --------- 4 ==> ���� �� ���ǽ� ��
 * 			{
 * 	����) 1~10 ������ ���
 * 		1) 1~10���� ����Ǵ� ���� => ��������
 * 			int i=1; ���� => 1
 * 			while(i<=10) => 10
 * 			{
 * 				System.out.println(i);
 * 				i++;
 * 			}
 */
// �������� �޾Ƽ� ���� ���� ������ŭ ���� ���
import java.applet.*;
import java.util.Scanner;
public class �ݺ���_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0;
		int i=1; // ����ڰ� ��û�� ������ ������ ���� => while������ ����ϴ� ����
		
		// �������� �޴´�
		Scanner scan=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		user=scan.nextInt();
		
		while(i<=user)
		{
			System.out.print("��");
			i++; // user�� ������ �� ������ ���� ����
		}
	}

}
