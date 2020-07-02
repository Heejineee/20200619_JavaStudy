import java.util.*;
public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 양의 정수 10개 배열에 저장, 배열에 있는 정수 중 3의 배수만 출력
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		for(int i:arr)
		{
			if(i%3==0)
				System.out.println(i);
		}
		
		System.out.println();
		
		// 정수 10개 저장하는 배열을 만들고 1~10까지 정수를 랜덤하게 생성해 배열에 저장. 배열에 든 숫자들과 평균 출력
		int[] arr1=new int[10];
		for(int i=0; i<10; i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("평균 : "+total/10.0);
		
		System.out.println();
		
		// 과목 이름을 입력받아 점수 출력하는 프로그램
		String course[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[]= {95,88,76,62,55};
		
		Scanner scan=new Scanner(System.in);
		boolean bCheck=false;
		
		while(true)
		{
			System.out.println("과목 입력 : ");
			String user=scan.nextLine();
			if(user.equals("그만"))
			{
				break;
			}
			for(int i=0; i<course.length; i++)
			{
				if(user.equals(course[i]))
				{
					bCheck=true;
					System.out.println(score[i]);
				}
			}
			if(bCheck==false)
			{
				System.out.println("없는 과목입니다!");
			}
		}	
	}

}
