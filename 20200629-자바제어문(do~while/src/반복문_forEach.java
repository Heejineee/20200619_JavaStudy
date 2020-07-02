/*
 * forEach : 향상된 for문 ==> 출력용 => web, mobile
 * 			==> 배열, 컬렉션 => 데이터가 묶여 있는 상태 에서 주로 사용
 * 		형태) for(데이터형 변수 : 배열, 컬렉션)
 */
public class 반복문_forEach {

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
