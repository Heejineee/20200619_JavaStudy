/*		j		0		1		2		3		4
 *	i	  	================
 *  0			1  	2	  3	  4	  5
 * 		 ================
 *  1					6    7	  8	  	  
 *  		================
 *  2							9
 * 		 ================
 *  3					1    11	  12	  	  
 * 		 ================
 *  4			13	14	15	16	17
 *  
 *  			j_s(tart)		j_(end)
 *  i=0			0				4
 *  i=1			1				3
 *  i=2			2				2
 *  		i와 j_s ==> j_s=i
 *  		i와 j_e ==> i+j_e=4 ==> j_e=4-i
 *  		for(int i=0; i<3; i++)
 *  		{
 *  			for(int j=1; j<=4-i; j++)
 *  				{
 *  				}
 *  i=3			1				3
 *  i=4			0				4
 *  		i와 j_s ==> i+j_s=4 ==> j_s=4-i
 *  		i와 j_e ==> i=j_e ==> j_e=i
 *  
 *  		
 */
public class 이차원배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5행 5열 배열
		int[][] arr=new int[5][5];
		
		int k=1;
		for(int i=0; i<3; i++)
		{
			for(int j=i; j<=4-i; j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		for(int i=3; i<=4; i++)
		{
			for(int j=4-i; j<=i; j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		// 출력
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(arr[i][j]==0)
					System.out.print("\t");
				else
					System.out.print(arr[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}

}
