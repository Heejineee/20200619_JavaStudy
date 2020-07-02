/*
 * 변수 명칭법 (클래스, 메소드 명칭법도 동일)
 * 	1) 알파벳(대소문자), 한글로 시작
 * 	2) 숫자는 사용 가능(맨앞에 사용 금지)
 * 	3) 키워드는 사용할 수 없다
 * 	4) _, $ 사용 가능
 * 
 * for 형식)
 * 		for(초기화; 조건식; 증감식) 
 * 		{
 * 			반복수행 문장
 * 			실행문장
 * 		} ==> 반복수행문장, 실행문장(괄호 안에 있는거) 둘 다 반복
 * 
 * 		for(초기화; 조건식; 증감식) 
 * 			반복수행 문장
 * 			실행문장
 * 		==> 반복수행문장만 반복
 * 
 *  
 *  */
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		}
		
		System.out.println("================");
		
		for(int i=1; i<=5; i++)
			System.out.println("Hello!!");
			System.out.println("Java=>For");
	}

}
