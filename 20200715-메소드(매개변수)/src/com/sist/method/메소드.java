package com.sist.method;
/*
 * 	�޼ҵ�
 * 		- ���ϰ�
 * 		- �Ű����� : �ָ��� ���(�󸶳� �ؾ��� �� �� ��) ==> �����Ű�����(...)
 */
public class �޼ҵ� {
	public static void concat(String s,String... s1)
	{
		for(String ss:s1)
		{
			s+=ss;			
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o=10;	// Object ���� �������� �������
		Object o1=0.5;
		Object o2='A';
		Object o3="aaaaaa";
		Object o4=new �޼ҵ�();
		
		concat("Hello","ȫ�浿","��û��","�ڹ���","������","�̼���");
	}

}
