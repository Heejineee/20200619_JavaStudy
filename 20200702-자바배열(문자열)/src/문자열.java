/*
 * 	�迭 : ���� Ÿ���� ������ ��� ����
 * 		- ���� : �������� �޷θ� ���� (�ε���)
 * 		- ������ �迭 : [] , [][] , [][][]
 * 							   ==
 * 								1) ���ڿ� �迭 : String[] arr  == String arr[]
 * 								2) ���� �迭 : int[] arr == int arr[]
 * 								3) �� �迭 : boolean[] arr == boolean arr[]
 * 		- �ʱⰪ 1) String[] arr;
 * 						  arr=new String[10];
 * 					  2) int[] arr => ����� ���ÿ� �ʱⰪ
 * 						  ** int[] arr=new int[10]
 * 						  arr=new int[10];
 * 						
 * 						  int[] arr={10,20,30,40,50} ==> ��ϵ� ����(5�� ����)
 * 							==> ����ÿ� �޸� ���� ������ ��� ==> �������̴�
 * 		- ��� : �ε��� ��ȣ(0~)
 * 			- �Ϲ� for�� : �ε����� �̿��Ѵ� (����) ==> �� ����, �� ������ �̿�
 * 			- ���� for��(for-each) : ���� ����� �� (��¿�) ==> �� ���� �Ұ���
 * 
 * 		
 * 
 */
public class ���ڿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� 5�� ������ ��� ���ϱ�
		int[] arr= {30,50,70,90,10};
		/*
		int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		double avg=total/5.0;
		System.out.println("����� ���� ��� : "+avg);
		*/
		int total=0;
		for(int i=0; i<5; i++)
		{
			total+=arr[i];
		}
		System.out.println("����� ������ ��� : "+(total/5.0));
		
		// ���� for
		/*
		 * for(���� ����� �������� : �迭��)
		 * arr => 30.50.70.90.10
		 * for(int i:arr)
		 * 	=> i=30
		 * 	=> i=50
		 * 	=> i=70
		 * 	=> i=90
		 * 	=> i=10
		 * 	=> ���� ���� �� �ڵ� ����
		 */
		total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("����� ������ ��� : "+(total/5.0));

	}

}
