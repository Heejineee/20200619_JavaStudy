/*
 * 	�޼ҵ� : Ư�� �۾��� �����ϱ� ���� ��ǻ���� ��ɹ��� ����
 * 				: �Ѱ��� �ϸ� ����
 * 				: ����ȭ �۾�
 * 		���� : ���뼺, �ߺ��� �ڵ� ����
 * 	 ���� : ����ȭ (�ܶ�(���))
 * 
 *   	��ɹ� => �޼ҵ�(�Ѱ��� ���) => Ŭ���� => ��Ű�� => .jar(���̺귯��)
 *   	
 *   	�޼ҵ� 
 *   		- ����� ���� �޼ҵ�
 *   				- ����)	��ȯ�� �޼ҵ��(�Ű�����...)
 *   							{
 *   								return ��; => ��=��ȯ��
 *   								��ȯ���� ���� ��쿡�� void, return�� ������ ����
 *   							}
 *   							==> �޼ҵ� �ȿ��� ó�� => ��� (�Ϲ� ����)
 *   							==> �޼ҵ� �ȿ��� ó�� => ������� ���� �� �� �ִ� (��, ������)
 *   				- ȣ��)	�޼ҵ��(��,��) 
 *   					 ex)	void method(int a, int b)
 *   							=> method(10,20)
 *   							�� �޼ҵ带 ȣ���ϰ� �޼ҵ� ������ ����(return) => �ٽ� ȣ��� ��ġ�� ���ƿ´�
 *   						
 *   							int method() => ȣ�� => int a=method()
 *   							String method(int a) => ȣ�� => String s=method(10)
 *   							double method(int a) => ȣ�� => double d=method(10) ==> int a=10
 *   
 *   							double random()
 *   							String substring(int s, int e)
 *   							boolean equals(String s)
 *      						void printLn()
 *      
 *      						��ȯ��(������)			�Ű�����
 *         					===================
 *         								O						O			String substring(int s, int e)
 *         					===================
 *         								O						X			int length() // double random()	
 *         					===================	
 *         								X(void)			O			System.out.println(String s)
 *         					===================
 *         								X(viod)			X			System.out.println() =>  �����ٿ� ������			
 *   
 *   		- ���̺귯�� �޼ҵ�
 */
// ���� ���� => �޼ҵ尡 �����ؾ� �ٸ� ������ �����Ѵ�
public class �ڹٸ޼ҵ�1 {
	static void aaa()
	{
		System.out.println("aaa() ȣ�� ����");
		bbb();
		System.out.println("aaa()  ȣ�� ����");
	}
	static void bbb()
	{
		System.out.println("bbb() ȣ�� ����");
		ccc();
		System.out.println("bbb()  ȣ�� ����");
	}
	static void ccc()
	{
		System.out.println("ccc() ȣ�� ����");
		ddd();
		System.out.println("ccc()  ȣ�� ����");
	}
	static void ddd()
	{
		System.out.println("ddd() ȣ�� ����");
		System.out.println("ddd)  ȣ�� ����");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		aaa();	// �����ϴ� �޼ҵ带 ȣ��(������ ���� ȣ��)
	}

}
