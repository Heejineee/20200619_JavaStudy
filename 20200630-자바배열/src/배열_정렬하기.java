/*
 * 20 10 40 50 30
 * - DESC(��������) : 50 40 30 20 10
 * - ASC(�ø�����) : 10 20 30 40 50
 * 
 * 1. �������� : 10 40 30 20 50 ���⼭ 10,40 / 10,30 / 10,20 / 10,50 �� => 1 round
 * 													   40,30 / 40,20 / 40,50 �� => 2 round �̷������� �������� ��
 * 2. �������� : 20 10 40 50 30
 * 					 == ==
 * 						  == ==
 * 							   == ==
 * 									== == �� 
 */
public class �迭_�����ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,10,40,20,50}; 
		System.out.println("���� �� : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n���� �� : ");
		
		// ���� ����
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j]) // <�� �ٲٸ� �������� (ū ���ں��� ����)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				/*
				 * temp �ִ� ����-> �ΰ��� �� �ٲٷ��� ��� �����س��� ����
				 */
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
