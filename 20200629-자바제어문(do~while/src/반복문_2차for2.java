
public class 반복문_2차for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
		{
			System.out.println("**********");
		}
		System.out.println("====== 2차 for문 ======");
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.print("*");
			}
			System.out.println(); // 다음줄에 출력
		}
	}

}
