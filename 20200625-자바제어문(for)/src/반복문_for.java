/*
 * 	반복문 - for, while, do~while
 * 		- for : 반복 횟수가 있는 경우에 주로 사용
 * 		- while : 반복 횟수가 없는 경우에 주로 사용
 * 		- do~while : 조건을 나중에 검색 => 한번 이상 반드시 수행함
 * 
 *  	1) for
 *  		형식)		for(int i=1; i<=10; i++)
 *  					{
 *  						반복 수행문장 : 10번을 수행하는 문장
 *  					}
 *  					==> 초기값, 조건식, 수행문장, 증가식
 *  									  ===== true => 반복 / false => 종료
 *  									  ※ 조건식이 false가 없으면 무한루프가 됨!
 */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 출력
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}

}
