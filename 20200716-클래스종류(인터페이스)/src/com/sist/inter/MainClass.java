package com.sist.inter;
/*
 * 	�������̽� : �߻�Ŭ������ ����(�߻�Ŭ������ ������ ����)
 * 					  : �̿ϼ��� Ŭ���� => �ڽ��� �޸� �Ҵ� �� �� ���� => ������ Ŭ������ ���� �޸� �Ҵ��
 * 					  : �߻�Ŭ����(���ϻ��), �������̽�(���߻��)
 * 					  : ��� �޼ҵ尡 abstract => ���� ����
 * 							�� JDK 1.8 ���ʹ� default �޼ҵ带 �̿��� �޼ҵ� ������ ����!
 * 					  : ����(�߻�Ŭ���� : �������, �������̽� : ���������)
 * 							int a; ==> int a=10;
 * 						ex) interface A
 * 							 {
 * 								// ����
 * 								int a=10;		==> JVM�� ���� public static final int a=10 ���� �� (�����ż� �Ⱥ��̴� ��)
 * 								// �޼ҵ�
 * 								void aaa();	==> JVM�� ���� public abstract void aaa(); �� ��
 * 								int bbb();	==> 
 * 							}
 * 
 * 								interface A
 * 								{
 * 									(public abstract) void aaa();
 * 								}
 * 								==> ����
 * 								class B implements A
 * 								{
 * 									void aaa(){	==> ������. ������ �� ū�ֶ�. public void aaa �� �ؾ���!
 * 									}
 * 								}
 * 
 * 	�������̵�
 * 		1) ��Ӱ���
 * 		2) �޼ҵ���� ����
 * 		3) �Ű����� ����
 * 		4) �������� ����
 * 		5) ���������� => Ȯ��, ��� X
 * 			ũ��) public > protected > default > private
 * 		�� �������̽��� ����� ��� �޼ҵ�� public�̴�! (protected, private ��� �ȵǴµ� default�� �տ� public�� �����Ȱ�)
 * 
 * 	���
 * 		- �������̽� => �������̽�
 * 				extends
 * 		- �������̽� => Ŭ����
 * 				implements
 * 		- Ŭ���� => �������̽�
 * 				!��� �Ұ���! 
 * 		ex) interface A
 * 				K L
 * 			  interface B extends A
 * 				P => K L 
 * 			  class C implements B
 * 				P K L ����
 * 			================
 * 			interface A
 * 			interface B
 * 			class C implements A, B ==> ���߻��
 * 			=================
 * 			interface A
 * 			class B
 * 			class C extends B implements
 * 			* �������̽��� ��� �޼ҵ尡 ������ �ȵȴ�!
 */
interface ���� 
{
	void eat();
	default void run() {
		System.out.println("�׹߷� �ȴ´�");
	}
}
class ��� implements ����
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�ι߷� �ȴ´�");
	}
	
}
class �� implements ����
{
	public void eat() {
		System.out.println("�Ұ��� �Դ´�");
	}
	
}
class �� implements ����
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("������ �Դ´�");
	}
	
}
class ���� implements ����
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("�������� �Դ´�");
		
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� ani=new ��();
		ani.eat();
		ani=new ��();
		ani.eat();
		ani=new ����();
		ani.eat();
	}

}
