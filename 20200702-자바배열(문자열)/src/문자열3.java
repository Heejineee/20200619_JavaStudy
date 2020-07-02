/*
 * 	문자열을 저장할 수 있는 공간 : String
 * 	String : 일반 변수의 역할
 * 		주요 기능) 문자열 비교 : equals()
 * 						 포함 문자 : contains()
 * 						 문자열 중에 한개 문자 : charAt()
 * 						 저장된 문자의 갯수 : length()
 * 						 문자 자르기 : substring()
 * 						 찾는 문자의 위치 : indexOf(), lastIndexOf()
 * 						 모든 데이터형을 문자열로 변환 : valueOf()
 * 						 공백 문자 제거 : trim() => 좌우만 제거 ex) " Hello " ==> "Hello"
 * 						 문자열 => char[]로 변경 : toCharArray()
 * 						 검색기 : startsWith, endsWith
 * 					※ Wrapper class : 기본형 데이터 (정수, 실수, 문자, 논리)
 * 													int => Integer ==> "2" -> 2 ==> parseInt("2")
 * 													double => Double Boolean, Float, Byte...
 * 
 */
/*
 * 	substring : 필요한 문자만 추출 => 형태소 분석(명사, 부사, 형용사)
 * 		- substring(int start)
 * 		- substring(int start, int end)
 */
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="0123456789";
		System.out.println(msg.substring(5));
		System.out.println(msg.substring(3));
		System.out.println(msg.substring(3,6));
		
		String post="100-010";
		System.out.println(post.substring(0,3));
		System.out.println(post.substring(4,7));
		

	}

}
