/*
 * 	indexOf, lastIndexOf : 문자의 위치 찾기 => 정수값
 */
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="onnijeqiwod.pmnsjejeflkjfkljklfjsdklfds.java";
		System.out.println(msg.indexOf("."));
		System.out.println(msg.lastIndexOf("."));
		System.out.println("확장자 : "+msg.substring(msg.lastIndexOf(".")+1)); // . 다음부터 자를거니까 +1

	}

}
