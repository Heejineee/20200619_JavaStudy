// 1~100까지의 짝수의 합, 홀수의 합 
public class 반복문_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0, even=0;
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~100 까지 짝수 합 : "+even);
		System.out.println("1~100 까지 홀수 합 : "+odd);
	}

}
