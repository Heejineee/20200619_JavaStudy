/*
 * 쉬프트연산자 => 비트이동 연산자
 * << : 왼쪽으로 이동 ==> 공백에 0을 채운다
 * ex) 1010 두칸 이동 ==> 101000 ==> 값이 커진다.
 * ==> 산술계산 ==> X<<Y ==> X*2의Y제곱
 * 						ex) 10<<2 ==> 10*2의2제곱 ==> 40
 * >> : 오른쪽으로 이동 ==> 비트를 제거한다
 * ex) 1010 두칸 이동 ==> 10 ==> 값이 작아진다.
 * ==> 산술계산 ==> X>>Y ==> X/2의Y제곱
 * 							ex) 10>>2 ==> 10/2의2제곱 ==> 10/4 ==> 2 (정수 나누기 정수니까 정수만 남김)
 * 
 * ex) 8<<3
 * 		1000 ==> 1000000 ==> 64
 * 		8>>3
 * 		1000 ==> 1 ==> 1
 * 
 * 		20<<3 ==> 20*8 ==> 160
 * 		20>>3 ==>20/8 ==> 2
 */
public class 이항연산자_쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}