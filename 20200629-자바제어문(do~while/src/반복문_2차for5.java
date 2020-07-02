
public class 반복문_2차for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 			==>  1 1
		 * 				    2 2
		 * 					3 3
		 * 					4 4
		 * 					5 5 ==> i=j
		 */
		for(int i=1; i<=5; i++) // 줄 수
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i); // 정수 출력
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		for(int i=1; i<=5; i++) // 줄 수
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j); // 정수 출력
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 11111
		 * 2222
		 * 333
		 * 44
		 * 5
		 * ==> i		j
		 * 		  1		5
		 * 		  2		4
		 * 		  3		3
		 * 		  4		2
		 * 		  5		1 ==> i+j=6 ==> j=6-i
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=6-i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
