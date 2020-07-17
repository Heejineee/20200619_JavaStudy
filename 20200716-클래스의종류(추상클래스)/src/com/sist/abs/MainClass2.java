package com.sist.abs;
abstract class board
{
	public abstract void write();
	public abstract void content();
	public void update() {
		System.out.println("게시물 수정");
	}
	public void delete() {
		System.out.println("게시물 삭제");
	}
	public void find() {
		System.out.println("게시물 찾기");
	}
}
class ReplyBoard extends board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("답변형 게시판 글쓰기");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
	 System.out.println("내용 보기");	
	}
	//	다른 기능 추가가 가능하다
	// Board가 가지고 있는 기능을 재정의 가능
}
class DataBoard extends board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("글쓰기+업로드");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("내용보기+다운로드");
	}
	
}
class GalleryBoard extends board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("글쓰기+이미지 업로드");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("내용보기+이미지 출력=>후기게시판");
		
	}
	
}
class ReplyBoard2 extends board
{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("글쓰기");
	}

	@Override
	public void content() {
		// TODO Auto-generated method stub
		System.out.println("내용보기+댓글");
	}
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====== 답변형 게시판 ======");
		board b=new ReplyBoard();
		b.write();
		b.content();
		
		System.out.println("====== 갤러리 게시판 ======");
		b=new GalleryBoard();
		b.write();
		b.content();

		System.out.println("====== 자료실 ======");
		b=new DataBoard();
		b.write();
		b.content();

		System.out.println("====== 댓글 게시판 ======");
		b=new ReplyBoard2();
		b.write();
		b.content();
	}

}
