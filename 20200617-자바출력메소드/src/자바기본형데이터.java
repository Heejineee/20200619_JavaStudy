/*
 * �ڹ� => �⺻�� : �ڹٿ��� �����ϴ� ��������
 * 				- ���� : boolean => �� : true/false => if(���ǹ�)�� ����� �� �ַ� ����ϴ� ��������/��(�����Ҷ� ���� ������)�� ���� ���
 */
/*
 * double d='a'; ==> d=97.0
 * char c='a'
 * int i='A' ==> i=65
 * �ڵ� ����ȯ(��ĳ����) : �� ���� �ְ� ū�ַ� ����Ǹ� ū�� �Ǵ°�
 * ���� ����ȯ(�ٿ�ĳ����) : �ݴ�
 * 
 * byte b1=10;
 * byte b2=20;
 * byte b3=b1+b2; ==> ����. byte+byte=int�ε� byte�� �����ؼ�!
 * 
 * (int)10.5+(int)10.5==>20
 * (int)(10.5+10.5)==>21
 * 
 * ======>upcasting(�ڵ�����ȯ)
 * byte < short(char) < int < long < float < double
 * <===== downcasting(��������ȯ)
 */
public class �ڹٱ⺻�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� ���
		boolean b=false; //�ҹ��ڷθ� �����! ==>1byte�� ����, ũ�� �� �� ����! �ܵ������� ���
		System.out.println("b="+b);
		b=true;
		System.out.println("b="+b);
		
		byte a1=10;
		byte a2=30;
		byte c=(byte)(a1*a2);
		System.out.println(c); //����� ==>44 �ֳĸ� 300�� 2�������� �ؼ� ������ 8���ڸ� �����ͼ�,,
		
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println('ȫ');
		System.out.println((int)'ȫ');
		System.out.println((char)54861); 
		//�� ���ڴ� ���� ��ȣ�� ������ �ִ�. (char�� ���������� �ν��Ѵ�)
	}

}