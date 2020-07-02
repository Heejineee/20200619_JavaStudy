import java.util.*; //Scanner=>이전에 만들어진 자바파일을 읽어 온다
/*
 * class Scanner {
 * }
 * 위의 import가 이런 의미다~
 */
public class 자바입출력메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력값 받기
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : "); //println 하면 정수 입력 : 하고 밑에 입력하게 되는데 이건 옆에 쓸 수 있다 
		int a=scan.nextInt(); //실수 입력 받으려면 double a=scan.nextDouble(); 
		//double a=100 ==> a=100.0
		//char a=97 ==> a='a'
		System.out.println("a="+a);
		
		System.out.println(~100); //음수표현. 물결 붙히면 됨
		System.out.println(Integer.toBinaryString(240)); //2진법으로 바꿔줌 ==> 결과 11110000 으로 나오니까 0b붙여서 2진법 0b11110000 이라고 해야함
		System.out.println(Integer.toHexString(240)); //8진법으로 바꿔줌 ==> 결과 360 으로 나오니까 0붙여서 8진법 0360 이라고 해야함
		System.out.println(Integer.toOctalString(240)); //16진법으로 바꿔줌 ==> 결과 f0 으로 나오니까 0x붙여서 16진법 0xf0 이라고 해야함
	}

}
