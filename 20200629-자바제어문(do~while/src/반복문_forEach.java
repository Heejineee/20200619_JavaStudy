/*
 * forEach : ���� for�� ==> ��¿� => web, mobile
 * 			==> �迭, �÷��� => �����Ͱ� ���� �ִ� ���� ���� �ַ� ���
 * 		����) for(�������� ���� : �迭, �÷���)
 */
public class �ݺ���_forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
			for(int i:arr)
			{
				System.out.print(i+" ");
			}
		

	}

}
