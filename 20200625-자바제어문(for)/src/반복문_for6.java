// 1~100까지 3의 배수의 합, 5의 배수의 합, 7의 배수의 합 출력
public class 반복문_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0, a5=0, a7=0;
		for (int i=1; i<=100; i++)
		{
			if(i%3==0)
				a3+=i;
			if(i%5==0)
				a5+=i;
			if(i%7==0)
				a7+=i;
			// ※ 만약 else if를 쓰면 3의 배수, 7의 배수 누적 되니까 단독 if문으로 씀!
		}
		System.out.println("1~100까지 3의 배수의 합 : "+a3);
		System.out.println("1~100까지 5의 배수의 합 : "+a5);
		System.out.println("1~100까지 7의 배수의 합 : "+a7);

		// 100~999까지 7의 배수의 갯수
		int count=0;
		for(int a=100; a<=999; a++)
		{
			if(a%7==0)
				count++;
		}
		System.out.println("100~999까지 7의 배수의 갯수 : "+count);
	}

}
