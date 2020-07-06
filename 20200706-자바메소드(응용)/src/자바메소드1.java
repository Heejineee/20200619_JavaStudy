/*
 * 	메소드 : 재사용 목적 => 사용이 편리하게 제작
 * 				: 반복 제거
 * 
 * 
 */
// 5개의 정수를 보내서 sort 하고 전송
public class 자바메소드1 {
	static int[] sort(int[] arr, String type) {
		// sort
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{				
				if(type.equals("ASC"))
				{
					if(arr[i]>arr[j])		// 오름차순
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}					
				}
				if(type.equals("DESC"))
				{
					if(arr[i]<arr[j])		// 내림차순
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
		// 호출
		int[] arr= {10,40,30,50,20};		// sort => 10,20,30,40,50
		System.out.println("정렬 전 : ");
		for(int i:arr) 
		{
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후 : ");
		int[] result=sort(arr,"ASC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후 : ");
		result=sort(arr,"DESC");
		for(int i:result)
		{
			System.out.print(i+" ");
		}
		
	}

}
