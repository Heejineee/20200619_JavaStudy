/*
 * 	�޼ҵ� : ���� ���� => ����� ���ϰ� ����
 * 				: �ݺ� ����
 * 
 * 
 */
// 5���� ������ ������ sort �ϰ� ����
public class �ڹٸ޼ҵ�1 {
	static int[] sort(int[] arr, String type) {
		// sort
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{				
				if(type.equals("ASC"))
				{
					if(arr[i]>arr[j])		// ��������
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}					
				}
				if(type.equals("DESC"))
				{
					if(arr[i]<arr[j])		// ��������
					{
						int temp=arr[i];
						
						arr[i]=arr[j];
						arr[j]=temp;
					}					
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ȣ��
		int[] arr= {10,40,30,50,20};		// sort => 10,20,30,40,50
		System.out.println("���� �� : ");
		for(int i:arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println("\n���� �� : ");
		int[] result=sort(arr,"ASC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n���� �� : ");
		result=sort(arr,"DESC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		
	}

}
