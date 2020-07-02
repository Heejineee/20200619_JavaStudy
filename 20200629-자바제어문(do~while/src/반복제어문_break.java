/*
 * 	반복제어문 ==> 조건문(if)과 같이 사용한다
 * 		- break ==> 반복문을 종료할 때
 * 		- continue ==> 특정 부분을 제외하고 싶은 경우
 * 		- break, continue는 한개의 반복문만 제어 할 수 있다
 * 		- break => 반복문 전체(for, do~while, while), switch
 * 		- continue => 반복문 에서만 사용이 가능
 * 		- return => 메소드 종료 / return에 없는 경우에 JVM이 자동으로 추가
 */
public class 반복제어문_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			// 5일 때
			if(i==5)
				break; // 종료
			System.out.print(i+" "); // 얘를 if문 위에 올리면 5까지 출력하고 끝남
		}
		System.out.println("\n====== for ======");
		// 1~10까지 홀수만 출력
		// 1) 조건문
		for(int i=1; i<=10; i++)
		{
			if(i%2!=0)
			System.out.print(i + " ");
		}
		// 2) 2씩 증가
		System.out.println("\n====== 2씩 증가 ======");
		for(int i=1; i<=10; i+=2)
		{
			System.out.print(i+" ");
		}
		// 3) continue 사용
		System.out.println("\n====== continue ======");
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				continue; // 위의 조건식을 제외 ==> i++로 이동
			System.out.print(i+" ");
		}
		/*
		 *  break => while, for, do~while 동일
		 *  continue => while(조건식으로 이동),
		 *  					for(증가식으로 이동) ==> 그래서 for문에는 continue 잘 안씀
		 */
		
		

	}

}
