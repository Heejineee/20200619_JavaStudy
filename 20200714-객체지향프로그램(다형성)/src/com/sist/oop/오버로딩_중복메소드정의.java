package com.sist.oop;
/*
 * 	�ڹ�
 * 		ù��° �� : package�� (�ѹ��� ��� ����)
 * 		�ι�° �� : import (������ ��� ����)
 * 		����° �� : public class className
 * 						  {
 * 								�ʿ��� ���� ���� => �������
 * 								������ ���� �ʱ�ȭ => ������
 * 								��� => �޼ҵ�
 * 						  }
 * 		==> �ٸ� Ŭ������ ���ÿ��� import com.sist.oop.* 
 * 				��Ű�� �̸� com.ȸ���.��ɸ� // org.������.��ɸ� �̷������� ���
 * 
 * 	ĸ��ȭ
 * 		- ������ private
 * 		- �޼ҵ� public ==> ���� (getter/setter)
 * 	���
 * 		- extends : ������ Ŭ���� ����� ������ �´�
 * 			�� ���� ��Ӹ� �����ϴ�
 * 	������
 * 		- ����, �߰��� �� ���
 * 	
 * 	�����ε�
 * 		- ���� �޼ҵ� ������ �������� ����� �����
 * 		- �Ű������� �ٸ��� (������ ���������� �ٸ���)
 * 		- �������� ���� ����
 * 		- ���� Ŭ���� ������ �����
 * 
 * 	plus() :
 * 	int + int => plusInt(int a, int b)
 * 	double + double => plusDouble(double d, double1)
 * 	int + double => plusIntDouble(int a, double d)
 * 	String + String => plusString(String s1, String s2)
 * 	float + double
 * 	long + int
 * 	int + char
 * 			.
 * 			.
 * 			.
 * 
 * 	class A
 * 	{
 * 		int a;
 * 		static int b;
 * 		
 * 		public void disp1()
 * 		{
 * 			=> a, b ��� ����
 * 			=> disp2() ȣ�� ����
 * 		}
 * 		
 * 		public static void disp2()
 * 		{
 * 			=> b�� ��� ����
 * 			=> disp1(), a �� ����� �� ����
 * 					==> ���ÿ��� �ݵ�� new�� ���
 * 		} 
 * 
 */
class Calc{
	// �ν��Ͻ� �޼ҵ� : new ���� ���� ���� ����Ǵ� �޼ҵ�
	public void plus(int a, int b)
	{
		System.out.printf("%d+%d=%d\n",a,b,a+b);
	}
	public void plus(double a, double b)
	{
		System.out.printf("%f+%f=%f\n",a,b,a+b);
	}
	public void plus(String a, String b)
	{
		System.out.printf("%s+%s=%s\n",a,b,a+b);
	}
	public double plus(double d, char c)
	{
		return d+c;
	}
}
public class �����ε�_�ߺ��޼ҵ����� {
	int a=10;
	static int b=20;
	public void disp1()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void disp2()
	{
		System.out.println(b);
		�����ε�_�ߺ��޼ҵ����� aa= new �����ε�_�ߺ��޼ҵ�����(); // a�� ����� �ȵż� �̷���!
		System.out.println(aa.a);
	}
	public �����ε�_�ߺ��޼ҵ�����()
	{
		System.out.println("this="+this);	// ����� �ؿ� 
																// �����ε�_�ߺ��޼ҵ����� aa= new �����ε�_�ߺ��޼ҵ�����();
																// System.out.println("aa="+aa); �ּ� �� ����
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cc=new Calc();	// �޼ҵ� ��ü ����
		cc.plus("Hello", "Java");
		cc.plus(100, 200);
		System.out.println(b);	// a�� ����� �ȵż� �ؿ�ó��
		
		�����ε�_�ߺ��޼ҵ����� aa= new �����ε�_�ߺ��޼ҵ�����();
		System.out.println("aa="+aa);
		System.out.println(aa.a);
		
	}

}
