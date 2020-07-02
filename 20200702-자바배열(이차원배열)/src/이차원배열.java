/*
 * 	이차원배열 : [][]
 * 				형식 1) 데이터형[][] 배열명; ==> 권장사항
 * 						2) 데이터형 배열명[][];
 * 						3) 데이터형[] 배열명[]; ==> 행/열
 * 				초기화 : int[][] arr={{1,2,3},{4,5,6},{7,8,9}}; => 3행 3열
 * 							0				1				2
 * 					====================
 * 				0			1				2				3
 * 					 arr[0][0]		arr[0][1]	arr[0][2]
 * 					====================
 * 				1			4				5				6
 * 					arr[1][0]	arr[1][1]		arr[1][2]
 * 					====================
 * 				2			7				8				9
 * 					arr[2][0]		arr[2][1]	arr[2][2]
 * 
 */
// 초기값 1~25
public class 이차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][5]; // 전체 => 0으로 초기화
		
		int k=1; //1~25
		// 초기값
		for(int i=0; i<5; i++) // 행
		{
			for(int j=0; j<5; j++) //열
			{
				arr[i][j]=k; // [0][0] ~ [0][4]
				k++;
			}
		}
		// 출력
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.printf("arr[%d][%d]=%d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
