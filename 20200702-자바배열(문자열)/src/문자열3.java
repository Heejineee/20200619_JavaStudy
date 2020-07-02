/*
 * 	���ڿ��� ������ �� �ִ� ���� : String
 * 	String : �Ϲ� ������ ����
 * 		�ֿ� ���) ���ڿ� �� : equals()
 * 						 ���� ���� : contains()
 * 						 ���ڿ� �߿� �Ѱ� ���� : charAt()
 * 						 ����� ������ ���� : length()
 * 						 ���� �ڸ��� : substring()
 * 						 ã�� ������ ��ġ : indexOf(), lastIndexOf()
 * 						 ��� ���������� ���ڿ��� ��ȯ : valueOf()
 * 						 ���� ���� ���� : trim() => �¿츸 ���� ex) " Hello " ==> "Hello"
 * 						 ���ڿ� => char[]�� ���� : toCharArray()
 * 						 �˻��� : startsWith, endsWith
 * 					�� Wrapper class : �⺻�� ������ (����, �Ǽ�, ����, ��)
 * 													int => Integer ==> "2" -> 2 ==> parseInt("2")
 * 													double => Double Boolean, Float, Byte...
 * 
 */
/*
 * 	substring : �ʿ��� ���ڸ� ���� => ���¼� �м�(���, �λ�, �����)
 * 		- substring(int start)
 * 		- substring(int start, int end)
 */
public class ���ڿ�3 {

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
