
public class �ݺ���_2��for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 * ABCDE
		 */
		char c='A';
		for(int i=1; i<=5; i++)
		{	
			c='A';
			for(int j=1; j<=i; j++)
			{
				System.out.print(c);
				c++;
			}System.out.println();
		}
		System.out.println();
		/*
		 * ABCDE
		 * ABCE
		 * ABC
		 * AB
		 * A
		 */
		char c1='A';
		for(int i=1; i<=5; i++)
		{	
			c1='A';
			for(int j=1; j<=6-i; j++)
			{
				System.out.print(c1);
				c1++;
			}System.out.println();
		}
		System.out.println();
		/*
		 * 1####
		 * #2###
		 * ##3##
		 * ###4#
		 * ####5
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==j)
					System.out.print(i);
				else
					System.out.print("#");
		}System.out.println();
		}
		System.out.println();
		/*
		 * 25 24 23 22 21
		 * 20 19 18 17 16
		 * 15 14 13 12 11
		 * 10  9 	  8   7   6
		 *   5  4   3   2   1
		 */
		int k=25; // 25~1 �����ϴ� ����
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.printf("%2d\t",k);
				k--;
			}System.out.println();
		}
		System.out.println();
		k=1; // ������ �ݴ��
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.printf("%2d\t",k);
				k++;
			}System.out.println();
		}
		System.out.println();
		/*
		 * 		*****
		 * 	 	  ****
		 * 	 	   ***
		 * 		    **
		 * 		     *
		 * 	�ټ�(i)	����(j)	��ǥ(k)
		 * 		1			0			5
		 * 		2			1			4
		 * 		3			2			3
		 * 		4			3			2
		 * 		5			4			1
		 * =================
		 * 	j+1=i => j=i-1
		 * i+k=6 => k=6-i
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i-1; j++) // ���� ���
			{
				System.out.print(" ");
			}
			for(k=1; k<=6-i; k++) // ��ǥ ���
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 			*
		 * 		   **
		 * 		  ***
		 * 		 ****
		 * 		*****
		 * 
		 * 		�ټ�(i)		����(j)		��ǥ(k)
		 * 			1				4				1 		==> i=k / k<=i
		 * 			2				3				2				i+j=5 ==> j=5-i
		 * 			3				2				3
		 * 			4				1				4
		 * 			5				0				5
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5-i; j++) // ���� ���
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++) // ��ǥ ���
			{
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i);
			}System.out.println();
		}System.out.println();
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		/*
		 * 			1
		 * 		  22
		 * 		 333
		 * 		4444
		 * 	   55555 
		 */
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5-i; j++) // ���� ���
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++) // ��ǥ ���
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
	