/*
 * 	배열 : 같은 타입을 여러개 묶어서 관리
 * 		- 생성 : 연속적인 메로리 구조 (인덱스)
 * 		- 일차원 배열 : [] , [][] , [][][]
 * 							   ==
 * 								1) 문자열 배열 : String[] arr  == String arr[]
 * 								2) 정수 배열 : int[] arr == int arr[]
 * 								3) 논리 배열 : boolean[] arr == boolean arr[]
 * 		- 초기값 1) String[] arr;
 * 						  arr=new String[10];
 * 					  2) int[] arr => 선언과 동시에 초기값
 * 						  ** int[] arr=new int[10]
 * 						  arr=new int[10];
 * 						
 * 						  int[] arr={10,20,30,40,50} ==> 등록된 갯수(5개 배정)
 * 							==> 선언시에 메모리 저장 갯수를 등록 ==> 고정적이다
 * 		- 출력 : 인덱스 번호(0~)
 * 			- 일반 for문 : 인덱스를 이용한다 (제어) ==> 값 변경, 값 삭제에 이용
 * 			- 향상된 for문(for-each) : 실제 저장된 값 (출력용) ==> 값 변경 불가능
 * 
 * 		
 * 
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 5개 저장해 평균 구하기
		int[] arr= {30,50,70,90,10};
		/*
		int total=arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
		double avg=total/5.0;
		System.out.println("저장된 수의 평균 : "+avg);
		*/
		int total=0;
		for(int i=0; i<5; i++)
		{
			total+=arr[i];
		}
		System.out.println("저장된 정수의 평균 : "+(total/5.0));
		
		// 향상된 for
		/*
		 * for(실제 저장된 데이터형 : 배열명)
		 * arr => 30.50.70.90.10
		 * for(int i:arr)
		 * 	=> i=30
		 * 	=> i=50
		 * 	=> i=70
		 * 	=> i=90
		 * 	=> i=10
		 * 	=> 값이 없을 떄 자동 종료
		 */
		total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("저장된 정수의 평균 : "+(total/5.0));

	}

}
