/*
 * 	�迭 :
 * 		1) ���� Ÿ���� �������� ������ ��� �����ϴ� ���α׷�
 * 		2) �Ѱ��� �������� �̿��� �������� ������ ���� 
 * 			������ : �ε��� ��ȣ�� ������ �Ѵ�. (0������ ����)
 * 			ex) int[] arr={10,20,30,40,50}
 * 		3) ���� ��� : ��������[] �迭��; / �������� �迭��[];
 * 										   ==== ���� ��Ī���� ����
 * 					  ex) String[] title=new String[10]; // ��ȭ ������ 10�� ��Ƽ� ����
 * 						   char[] hakjum=new char[10]; // 10�� �л��� ������ ����
 * 						   int[] total=new int[10]; // 10�� �л��� ������ ����
 * 							==> new�� ����ϸ� �޸� ������ ���� ==> 0������ �ʱ�ȭ �ȴ� (String�� null/char�� '\0'/double�� 0.0/float�� 0.0f/long��0L)
 * 							���� ���� �����ϴ� ��� : int[] arr={10,20,30,40,50,60,}
 * 		4) ������ 1. �迭�� ũ�⸦ �ʰ��ϸ� error : ArrayIndexOutOfBoundsException
 * 						 ========
 * 							n�� ==> 0~n-1�� ==> ���� ������ �� �� length
 * 					  2. ��� ���ÿ��� �ַ� for�� �̿�
 * 							
 */
public class �迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5�� ���� ���� ����, ����, ���
		int a=80;
		int b=90;
		int c=75;
		int d=90;
		int e=85;
		
		int total=a+b+c+d+e;
		double avg=total/5.0;
		
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
		
		// �迭 ����ϱ�
		int[] score= {80,90,75,90,85};
		int total2=0;
		double avg2=0.0;
		for(int i=0; i<score.length; i++)
		{
			total2+=score[i];
		}
		avg2=total2/5.0;
		
		System.out.println("���� : "+total2);
		System.out.println("��� : "+avg2);

	}

}
