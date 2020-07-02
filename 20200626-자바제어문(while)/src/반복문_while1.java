/*
 * 	while => 무한루프 (데이터베이스 (오라클), 파일 읽기, 서버 제작)
 * 								==============      			======
 * 									파일 : XML, JSON
 * 									=> break(종료) 반드시 해줘야함
 * 	형식)
 * 			초기값 ------------- 1 (실행순서)
 * 			while(조건식) ----- 2 ==> true ==> {} 안에 있는 내용 수행 / false(종료)
 * 			{
 * 				반복수행문장 -- 3
 * 				증가식  --------- 4 ==> 증가 후 조건식 비교
 * 			{
 * 	예시) 1~10 정수를 출력
 * 		1) 1~10까지 변경되는 변수 => 루프변수
 * 			int i=1; 시작 => 1
 * 			while(i<=10) => 10
 * 			{
 * 				System.out.println(i);
 * 				i++;
 * 			}
 */
// 정수값을 받아서 받은 정수 갯수만큼 ★을 출력
import java.applet.*;
import java.util.Scanner;
public class 반복문_while1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int user=0;
		int i=1; // 사용자가 요청한 값까지 변경할 변수 => while문에서 사용하는 변수
		
		// 정수값을 받는다
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		user=scan.nextInt();
		
		while(i<=user)
		{
			System.out.print("★");
			i++; // user의 갯수가 될 때까지 루프 실행
		}
	}

}
