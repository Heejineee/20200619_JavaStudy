/*
 * 	�ݺ��� => �ݵ�� �ѹ� �̻��� �����ؾ� �� �� (do~while)
 * 	����)		
 * 			�ʱⰪ ==> int i=1;
 * 			do {
 * 					�ݺ� ���๮�� ���
 * 					System.out.println(i+" ");
 * 					������
 * 					i++;
 * 				} while(���ǽ�); ==> i<=5;
 * 			����� ==> 1 2 3 4 5
 * 
 */
public class �ݺ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ʱⰪ
		int i=1; // �������� ==> Ƚ�� ����
		do
		{
			System.out.print(i+" "); // �ݺ� ���๮�� (�������� ���� ����)
			i++;
		}while(i<=5);
		
		System.out.println("\n====== while ======");
		// �ʱⰪ
		i=1;
		while(i<=5)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n====== for ======");
		for(i=1; i<=5; i++)
		{
			System.out.print(i+" ");
		}

	}

}
