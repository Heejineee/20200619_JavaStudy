/*
 * 	split() : 문자를 구분해서 자르는 역할  ==> String[]
 * 			  : 문자일 때만 사용 가능
 * 
 */
public class 문자열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="밑반찬,메인반찬,국/탕,찌개,디저트,면/만두,밥/죽/떡,퓨전,김치/젓갈/장류,양념/소스/잼,양식,샐러드,스프,빵,과자,차/음료/술,기타";
		String[] arr=msg.split(","); // 일반 문자열 => 배열로 변경
		for(String s:arr)
		{
			System.out.println(s);
		}
	}

}
