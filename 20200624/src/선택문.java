/*
 * 		���ù�
 * 		 => switch(����, ����, ���ڿ�) ==> break�� ���� ��쿡�� ��� ������ ����
 * 				{
 * 					����
 * 					case ������: ==>�� (�ߺ��� ����)
 * 						ó������ ==>if(����){ó��}
 * 					case ������:
 * 						ó������ ==> �ߺ��� ���� ����� �� ����
 * 				}
 * 			ex) switch(a)
 * 				{
 * 					case 1:
 * 					case 1: ==> error (�ߺ��� ���̶�)
 * 				}
 * 
 */
import java.util.*;
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("����(1~5) : ");
		select=scan.nextInt();
		
		switch(select)
		{
		case 1:
		case 2:
			System.out.println("1~2���� �Է��Ͽ����ϴ�.");
			break;
		case 3:
			System.out.println("3���� �Է��Ͽ����ϴ�.");
			break;
		case 4:
			System.out.println("4���� �Է��Ͽ����ϴ�.");
			break;
		case 5:
			System.out.println("5���� �Է��Ͽ����ϴ�.");
			break;
		default:
			System.out.println("1~5�������� ����ϼ���");
		}
		}

	}
