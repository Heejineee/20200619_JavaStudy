// 컴퓨터가 1~100사이의 난수 발생, 사용자가 난수 맞추는 게임 / 힌트=>높다, 낮다 출력
import java.util.*;
/*
 * 1. 컴퓨터가 난수 발생
 * 2. 사용자 입력
 * 3. 입력하면 힌트
 * 4. 종료 여부
 */
public class 반복문_for9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1; // 1~100 사이 난수 발생
		Scanner scan=new Scanner(System.in);
		int count=0;
		for(;;) // 무한루프 => while(true) 동일
		{
			System.out.print("1~100 사이의 정수 입력 : ");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다!!!");
				continue; //처음으로 다시 돌아간다
			}
			count++;
			if(com>user)
			{
				System.out.println("입력된 값보다 높은 수를 입력해라");
			}
			else if(com<user)
			{
				System.out.println("입력된 값보다 낮은 수를 입력해라");
			}
			else
			{
				System.out.println("Game over");
				System.out.println("입력횟수 : "+count);
				break;
			}
			
			System.out.println();
			}
		}
		
	}

