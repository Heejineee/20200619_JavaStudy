/*
 * 	�ݺ��� - for, while, do~while
 * 		- for : �ݺ� Ƚ���� �ִ� ��쿡 �ַ� ���
 * 		- while : �ݺ� Ƚ���� ���� ��쿡 �ַ� ���
 * 		- do~while : ������ ���߿� �˻� => �ѹ� �̻� �ݵ�� ������
 * 
 *  	1) for
 *  		����)		for(int i=1; i<=10; i++)
 *  					{
 *  						�ݺ� ���๮�� : 10���� �����ϴ� ����
 *  					}
 *  					==> �ʱⰪ, ���ǽ�, ���๮��, ������
 *  									  ===== true => �ݺ� / false => ����
 *  									  �� ���ǽ��� false�� ������ ���ѷ����� ��!
 */
public class �ݺ���_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 ���
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
	}

}
