
public class 배열_정리하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {30,20,40,50,10};
		/*
		 * 	i	j		i+j=4 => j=4-i
		 * 	0	4					arr.length-1-i
		 * 1	3
		 * 2	2
		 * 3	1
		 */
		System.out.println("정렬 전 : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후 : ");
		// 버블정렬 
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
