/*
 * 임의의 정수 5개를 저장한 후에 최대값, 최소값 구하는 프로그램
 */
public class 배열_최대최소값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 5개를 저장하는 공간을 만든다 => 배열
		int[] arr=new int[5]; // 0 0 0 0 0
		// 5개의 값 변경
		for(int i=0; i<5; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			// 0.0~99.0 ==> 정수변환 ==> 0~99 +1 ==> 1~100
		}
		// 출력(for-each문)
		for(int i:arr) // 여기서 int i는 index가 아니라 실제 저장된 값을 대입
		{
			System.out.print(i+" ");
		}
		System.out.println("\n====== 결과 ======");
		// 최소값 저장 공간 (가장 큰값으로 초기화 해야함. 비교해야하기 때문!)
		int min=arr[0];
		// 최대값 저장 공간 (가장 작은 값으로 초기화 해야함!)
		int max=arr[0];
		// 최소값
		for(int i=0; i<5; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		// 최대값
		for(int i=0; i<5; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
	}
		System.out.println("최소값 : "+min);
		System.out.println("최대값 : "+max);
}
}