package com.sist.method;
class AA
{
	public void AA()		// void ������ �����ڰ� �ƴ� �Ϲ� �ν��Ͻ� �޼ҵ尡 ��
									// void�� �������� �������� �ʴ´� => Ư���޼ҵ� => �޸𸮿� ����
	{
		System.out.println("AA() Call...");
	}
	public AA()
	{
		System.out.println("AA() Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new AA();	// void �� ������ ���
		a.AA();	// void ������ ���
	}

}
 