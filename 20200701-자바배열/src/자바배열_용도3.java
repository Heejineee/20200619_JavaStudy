// 사용자가 정수 입력 => 2진법 16bit(0000 0000 0000 0000)로 출력
import java.util.*;
public class 자바배열_용도3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16]; // 0,1만 저장 / 사용자가 요청한 정수
		
		int user=0;
		int index=15; // 뒤에서부터 출력 ==> 배열 제어
		
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력 : (0~32767) : ");
		user=scan.nextInt();
		System.out.println("====== Library 이용 ======");
		System.out.println(Integer.toBinaryString(user)); // 만들어진거 이용한거
		
		while(true) // 종료시점 => break
		{
			binary[index]=user%2;
			user=user/2;
			if(user==0)break;
			index--;
			
		}
		
		// 결과 출력
		for(int i=0; i<16; i++)
		{
			if(i%4==0 && i!=0) // 4자리씩 띄우려고 하는거 뒤에 조건 안쓰면 맨 앞칸도 한칸 띄워서 이렇게 주는거
				System.out.print(" ");
				System.out.print(binary[i]);
		}
	}

}
