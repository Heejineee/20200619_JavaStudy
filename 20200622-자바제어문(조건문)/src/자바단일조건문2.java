/*
 * 1) 단일 조건문은 여러개를 사용해도 처음부터 마지막까지 수행된다
 * 2) {}을 생략할 때는 수행문장이 1개일 경우
 */
public class 자바단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15; //3의 배수, 5의 배수, 7의 배수 물어보기
		if(a%3==0) // if문 뒤에 ; 하면 if문장이 종료돼서 단독 실행문장이 되어버림 (실행은 되지만 하지 않는게 좋다)
				System.out.println(a+"는 3의 배수");
				System.out.println("if(a%3=0) 수행문장");
		//한문장
		if(a%5==0)
			System.out.println(a+"는 5의 배수");
		//한문장
		if(a%7==0)
			System.out.println(a+"는 7의 배수");
		//한문장
	}

}
