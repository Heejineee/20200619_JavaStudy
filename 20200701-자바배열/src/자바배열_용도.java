// 가위 바위 보
/*
 * 0 => 가위
 * 1 => 바위
 * 2 => 보
 */
import java.util.*;
public class 자바배열_용도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터 => 난수
		int com=(int)(Math.random()*3); // 0~2
		// 사용자 입력
		Scanner scan=new Scanner(System.in);
		System.out.print("0(가위), 1(바위), 2(보) : ");
		int user=scan.nextInt();
		
		// 입력된 결과 확인
		String[] result= {"가위","바위","보"};
		System.out.println("컴퓨터 : "+result[com]);
		System.out.println("사용자 : "+result[user]);
		
	
	}

}
