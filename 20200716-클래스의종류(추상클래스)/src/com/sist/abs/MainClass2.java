package com.sist.abs;
abstract class board
{
	public abstract void write();
	public abstract void content();
	public void update() {
		System.out.println("�Խù� ����");
	}
	public void delete() {
		System.out.println("�Խù� ����");
	}
	public void find() {
		System.out.println("�Խù� ã��");
	}
}
class ReplyBoard extends board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�亯�� �Խ��� �۾���");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
	 System.out.println("���� ����");	
	}
	//	�ٸ� ��� �߰��� �����ϴ�
	// Board�� ������ �ִ� ����� ������ ����
}
class DataBoard extends board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�۾���+���ε�");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸��+�ٿ�ε�");
	}
	
}
class GalleryBoard extends board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�۾���+�̹��� ���ε�");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸��+�̹��� ���=>�ı�Խ���");
		
	}
	
}
class ReplyBoard2 extends board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("�۾���");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("���뺸��+���");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== �亯�� �Խ��� ======");
		board b=new ReplyBoard();
		b.write();
		b.content();
		
		System.out.println("====== ������ �Խ��� ======");
		b=new GalleryBoard();
		b.write();
		b.content();

		System.out.println("====== �ڷ�� ======");
		b=new DataBoard();
		b.write();
		b.content();

		System.out.println("====== ��� �Խ��� ======");
		b=new ReplyBoard2();
		b.write();
		b.content();
	}

}
