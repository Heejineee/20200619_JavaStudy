/*
 *  ���� Scope
 *  ���� ����
 *  	- ��������
 *  	- �������
 *  	- ��������
 *  
 *  	public class A
 *  	{
 *  		int a; ===> ������� ==> Ŭ���� A�� ������ �� ������ ������
 *  		static int b; ===> �������� ==>JVM(����ӽ�) class�� �ε��� ��
 *  		public static void main(String[] args)
 *  		{
 *  			int c; ===> ��������
 *  		} ==> c ���� ==> main������ ����� ����
 *  	}
 */
public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1; i<=10; i++)
		{
			System.out.println("i="+i);
		} // i �޸𸮴� ����
		System.out.println(i);
		
		i=1;
		System.out.println(i);
		System.out.println();
		
		int j=1;
		for(j=1; j<=5; j++)
		{
			System.out.println(j+"");
		}
		System.out.println();
		j=1;
		while(j<=5)
		{
			System.out.println(j+"");
			j++;
		}
		System.out.println();
		j=1;
		do
		{
			System.out.println(j+"");
			j++;
		}while(j<=5);
	}

}
