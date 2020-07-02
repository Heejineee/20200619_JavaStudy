/*
 * 20 10 40 50 30
 * - DESC(내림차순) : 50 40 30 20 10
 * - ASC(올림차순) : 10 20 30 40 50
 * 
 * 1. 선택정렬 : 10 40 30 20 50 여기서 10,40 / 10,30 / 10,20 / 10,50 비교 => 1 round
 * 													   40,30 / 40,20 / 40,50 비교 => 2 round 이런식으로 차례차례 비교
 * 2. 버블정렬 : 20 10 40 50 30
 * 					 == ==
 * 						  == ==
 * 							   == ==
 * 									== == 비교 
 */
public class 배열_정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {30,10,40,20,50}; 
		System.out.println("정렬 전 : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후 : ");
		
		// 선택 정렬
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j]) // <로 바꾸면 내림차순 (큰 숫자부터 나옴)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				/*
				 * temp 주는 이유-> 두개의 값 바꾸려고 잠시 저장해놓는 공간
				 */
			}
		}
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
