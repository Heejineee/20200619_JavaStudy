package com.sist.abs;
/*
 * 	�߻� Ŭ����
 * 		=> �̿ϼ��� Ŭ����
 * 		=> new�� ����ؼ� �޸� �Ҵ��� �Ұ���
 * 			class A
 * 			=> A a=new A();
 * 			absctract class B
 * 			=> B b=new B(); ==> error
 * 			==> �׻� ����� ������ ���� Ŭ�������� ���� �Ŀ� ����ؾ� ��
 * 			==> �⺻ Ʋ�� ����
 * 			==> ���ø� �Ѵ� : �����ϴ� ������ ���α׷����� �ٸ� ���� �ִ�
 */
// ������ �׸���� �ϸ� ���α׷��Ӹ��� �ٸ� �� �׸��ű� ���� �ϴ� �����س��� �����ϴ� ����!
abstract class ����
{
	public abstract void draw();
	public void color()
	{
		System.out.println("���������� �׸��� �׸���");
	}
}	// ==> ���� �� ����
class �ﰢ�� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�ﰢ���� �׸���");
	}
	// ���� ���� => ������
	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("�Ķ������� �׸���");
	}
	
}
class �� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("���� �׸���");
	}
	
}
class �簢�� extends ����
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("�簢���� �׸���");
	}
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		���� g=new �ﰢ��();
				g.color();
				g.draw();
				
				g=new �簢��();
				g.color();
				g.draw();
				
				g=new ��();
				g.color();
				g.draw();
	}

}
