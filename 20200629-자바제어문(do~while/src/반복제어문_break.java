/*
 * 	�ݺ���� ==> ���ǹ�(if)�� ���� ����Ѵ�
 * 		- break ==> �ݺ����� ������ ��
 * 		- continue ==> Ư�� �κ��� �����ϰ� ���� ���
 * 		- break, continue�� �Ѱ��� �ݺ����� ���� �� �� �ִ�
 * 		- break => �ݺ��� ��ü(for, do~while, while), switch
 * 		- continue => �ݺ��� ������ ����� ����
 * 		- return => �޼ҵ� ���� / return�� ���� ��쿡 JVM�� �ڵ����� �߰�
 */
public class �ݺ����_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			// 5�� ��
			if(i==5)
				break; // ����
			System.out.print(i+" "); // �긦 if�� ���� �ø��� 5���� ����ϰ� ����
		}
		System.out.println("\n====== for ======");
		// 1~10���� Ȧ���� ���
		// 1) ���ǹ�
		for(int i=1; i<=10; i++)
		{
			if(i%2!=0)
			System.out.print(i + " ");
		}
		// 2) 2�� ����
		System.out.println("\n====== 2�� ���� ======");
		for(int i=1; i<=10; i+=2)
		{
			System.out.print(i+" ");
		}
		// 3) continue ���
		System.out.println("\n====== continue ======");
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				continue; // ���� ���ǽ��� ���� ==> i++�� �̵�
			System.out.print(i+" ");
		}
		/*
		 *  break => while, for, do~while ����
		 *  continue => while(���ǽ����� �̵�),
		 *  					for(���������� �̵�) ==> �׷��� for������ continue �� �Ⱦ�
		 */
		
		

	}

}
