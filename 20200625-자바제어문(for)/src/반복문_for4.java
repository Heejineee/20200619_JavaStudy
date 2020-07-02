/*
 * 1~100 합
 */
public class 반복문_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++)
		{
			sum+=i;
			System.out.printf("1부터 %d까지의 합 : %d\n",i,sum);
		}
		
	}

}
