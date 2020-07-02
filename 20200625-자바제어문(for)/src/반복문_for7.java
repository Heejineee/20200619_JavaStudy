// 1-2+3-4+5-6+7-8+9-10
public class 반복문_for7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println(sum);
		
		// ★★☆★★☆★★☆★★☆ 출력
		
		for(int j=1; j<=12; j++)
		{
			if(j%3==0)
				System.out.print('☆');
			else
				System.out.print('★');
		}
	}

}
