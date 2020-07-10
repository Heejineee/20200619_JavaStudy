/*
 * 	Ŭ����
 * 		- ���� : �������� ���� �� �� (�ݵ�� �������� ���� ������)
 * 			  ex) ��ȭ ���� => ��ȭ��, ����, �⿬, �帣, ...
 * 			- ������ ����
 * 					- �������(=�ν��Ͻ� ����) : new�� ����� ������ ���� ����Ǵ� ����
 * 						�� �޸� ����� ���� ���� : new ����� �� 
 * 						�� heap : ���α׷��Ӱ� �����ϴ� ���� (�ڵ�ó���� �ȵȴ�)
 * 										�޸𸮸� ������� ���� ��� (����ó��, GC)
 * 					- ��������(=��������=static) : �޸𸮰� �Ѱ� => �������� ���Ǵ� ����
 * 						�� �޸� ����� ���� ���� : �����Ϸ��� ������ �� �� �ڵ����� ����
 * 					- �������� : ��������, �Ű�����
 * 						�� �޸� ����� ���� ���� : �޼ҵ� ȣ��ÿ�
 * 						�� �޸𸮰� ��ü ���� {}�� ����� �ڵ� ȸ�� => stack(LIFO)
 * 	���� ���� : �ʱⰪ
 * 		- ����� ���ÿ� �� ����
 * 		- ������
 * 		- �ʱ�ȭ ���
 * 			- �ν��Ͻ� ���
 * 					class A
 * 					{
 * 						int a;
 * 						{
 * 							a=10;
 * 						}
 * 					}
 * 			-	static �ʱ�ȭ
 * 					class A
 * 					{
 * 						static int a;
 * 						static
 * 					}
 * 						a=10;
 * 			- ����� �ʱ�ȭ
 * 					class A
 * 					{
 * 						int a=0;
 * 						{
 * 							a=100;
 * 						}
 * 						A(){
 * 							a=1000;
 * 						}
 * 					}
 * 
 * 
 * 	������ : ��������� �ʱⰪ �ο�
 *    			   : ����� �̿��ϰų� ���� �б�, ���� �� �����ϰ� ������ ���� ������ �� �� ����
 * 			   : �Ź� ������ ����ϴ°� �ƴ�, �ʿ��� ���� ���� ��!(=> ��������)
 * 			   : �����ڴ� �ݵ�� �ʿ��ϱ� ������ �ڵ����� �����Ϸ��� �߰��� => default ������ => �Ű������� ���� ������(������ ����)
 * 																														-------------------- Student(){} ����!
 * 			   : �޸𸮿� ����(Ŭ����) => ȣ��Ǵ� �޼ҵ�
 * 				 ----------------- new ������() => �ѹ��� ȣ���Ѵ� => this(�ڱ� �ڽ�) 
 * 
 * 	�޼ҵ� : ���
 * 				: �����, ������
 * 				������ �޼ҵ��(�Ű�����...) ==> �����
 * 				{
 * 					������
 * 				}
 * 				==> �����+������=����
 * 		���� 
 * 			- �ν��Ͻ� �޼ҵ� : Ŭ���� ���� ���� ����ϴ� �޼ҵ�
 * 			- ���� �޼ҵ� : static => ��� Ŭ���� �������� ���Ǵ� �޼ҵ� �� ���������� ����� ��� static ���!
 * 			- �߻� �޼ҵ� : ����θ� ����(������ �ȵ� �޼ҵ�) => å p377�� �ִ�!
 * 
 * 
 */
class Student{
	//	�л� 1�� ���� ���� => �޸� ���� ������ ���� �� �ִ� (new)
	String name;
	String subject;
	int year;	
	static String school;	// �޸𸮿� �����(static�̶�)
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.school="SIST"; 	// static ���� ���
		Student s=new Student();		 // name, subject, year => s��� �ּҿ� ����
		System.out.println(s);
		
		System.out.println(s.name);		// �� �ֱ� �� �ʱⰪ => null, null, 0
		System.out.println(s.subject);
		System.out.println(s.year);
		
		s.name="ȫ�浿";
		s.subject="���߰�";
		s.year=3;
		
		System.out.println(s.name);
		System.out.println(s.subject);
		System.out.println(s.year);
		System.out.println(Student.school);	// �̰� ��� ���� �� SIST
		
		Student s1=new Student();
		System.out.println(s1);	// �� s���� �ּҰ��� �ٸ�
		
		System.out.println(s1.name);  // �� �ֱ� �� �ʱⰪ => null, null, 0
		System.out.println(s1.subject);
		System.out.println(s1.year);
		s1.name="��û��";
		s1.subject="�����";
		s1.year=2;
		
		System.out.println(s1.name);	
		System.out.println(s1.subject);
		System.out.println(s1.year);
		System.out.println(Student.school);
		
		/*
		 * ��� ���
		 * Student@15db9742
			null
			null
			0
			ȫ�浿
			���߰�
			3
			SIST
			Student@6d06d69c
			null
			null
			0
			��û��
			�����
			2
			SIST
		 */
		
		String ss="Hello Java";
		ss.replace('H','K');
		String ss1="1234567890";
	}

}
