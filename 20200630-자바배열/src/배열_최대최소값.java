/*
 * ������ ���� 5���� ������ �Ŀ� �ִ밪, �ּҰ� ���ϴ� ���α׷�
 */
public class �迭_�ִ��ּҰ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 5���� �����ϴ� ������ ����� => �迭
		int[] arr=new int[5]; // 0 0 0 0 0
		// 5���� �� ����
		for(int i=0; i<5; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			// 0.0~99.0 ==> ������ȯ ==> 0~99 +1 ==> 1~100
		}
		// ���(for-each��)
		for(int i:arr) // ���⼭ int i�� index�� �ƴ϶� ���� ����� ���� ����
		{
			System.out.print(i+" ");
		}
		System.out.println("\n====== ��� ======");
		// �ּҰ� ���� ���� (���� ū������ �ʱ�ȭ �ؾ���. ���ؾ��ϱ� ����!)
		int min=arr[0];
		// �ִ밪 ���� ���� (���� ���� ������ �ʱ�ȭ �ؾ���!)
		int max=arr[0];
		// �ּҰ�
		for(int i=0; i<5; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		// �ִ밪
		for(int i=0; i<5; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
	}
		System.out.println("�ּҰ� : "+min);
		System.out.println("�ִ밪 : "+max);
}
}