/*
 * ���� ��Ī�� (Ŭ����, �޼ҵ� ��Ī���� ����)
 * 	1) ���ĺ�(��ҹ���), �ѱ۷� ����
 * 	2) ���ڴ� ��� ����(�Ǿտ� ��� ����)
 * 	3) Ű����� ����� �� ����
 * 	4) _, $ ��� ����
 * 
 * for ����)
 * 		for(�ʱ�ȭ; ���ǽ�; ������) 
 * 		{
 * 			�ݺ����� ����
 * 			���๮��
 * 		} ==> �ݺ����๮��, ���๮��(��ȣ �ȿ� �ִ°�) �� �� �ݺ�
 * 
 * 		for(�ʱ�ȭ; ���ǽ�; ������) 
 * 			�ݺ����� ����
 * 			���๮��
 * 		==> �ݺ����๮�常 �ݺ�
 * 
 *  
 *  */
public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello!!");
			System.out.println("Java=>For");
		}
		
		System.out.println("================");
		
		for(int i=1; i<=5; i++)
			System.out.println("Hello!!");
			System.out.println("Java=>For");
	}

}
