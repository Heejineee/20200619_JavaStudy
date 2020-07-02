/*
 * 	반복문 => 반드시 한번 이상을 수행해야 할 때 (do~while)
 * 	형식)		
 * 			초기값 ==> int i=1;
 * 			do {
 * 					반복 수행문장 출력
 * 					System.out.println(i+" ");
 * 					증가식
 * 					i++;
 * 				} while(조건식); ==> i<=5;
 * 			결과값 ==> 1 2 3 4 5
 * 
 */
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 초기값
		int i=1; // 루프변수 ==> 횟수 지정
		do
		{
			System.out.print(i+" "); // 반복 실행문장 (여러문장 실행 가능)
			i++;
		}while(i<=5);
		
		System.out.println("\n====== while ======");
		// 초기값
		i=1;
		while(i<=5)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n====== for ======");
		for(i=1; i<=5; i++)
		{
			System.out.print(i+" ");
		}

	}

}
