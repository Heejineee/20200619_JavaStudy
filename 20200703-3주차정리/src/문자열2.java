// trim(), replace()
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" Hello Java ";
		System.out.println(s);
		System.out.println(s.trim());		// 좌우 공백 제거
		
		System.out.println(s.replace(' ', '-')); 		// 모든 공백을 -로 변경
		System.out.println(s.substring(1,6));
	}
	

}
