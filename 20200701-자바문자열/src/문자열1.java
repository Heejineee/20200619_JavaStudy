/*
 * 문자열 비교 : equals()
 * 문자 찾기 : contains()
 * 시작 문자열 : startsWith()
 * 끝나는 문자열 : endsWidth()
 * 문자열 자르기 : substring()
 * 문자 추출 : charAt()
 * 문자의 갯수 : length()
 * 공백문자 제거 : trim()
 * 문자의 위치 찾기 : indexOf(), lastIndexOf()
 * 형변환 : valueOf()
 */
// 로그인 처리
import java.util.*;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// id, pwd
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ID를 입력 : ");
		String id=scan.nextLine();
		System.out.println("비밀번호 입력 : ");
		String pwd=scan.nextLine();
		
		/*
		 * equls : 대소문자 구분해서 비교 (주로 pwd에 쓰임)
		 * equlsIgnoreCase : 대소문자 구분 없이 비교 (주로 id에 쓰임)
		 */
		// 결과
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) // id==ID 이렇게 하면 안됨 (문자열 비교할 땐 equals 써야해) 클래스는 저장공간이 다름 (주소만 저장하고 값은 저장 못함)
		{
			System.out.println("로그인 되었습니다!");
		}
		else
		{
			System.out.println("ID나 비밀번호가 틀립니다!");
		}
		

	}

}
