package com.sist.method;
class AA
{
	public void AA()		// void 붙으면 생성자가 아닌 일반 인스턴스 메소드가 됨
									// void는 리턴형이 존재하지 않는다 => 특수메소드 => 메모리에 저장
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
		AA a=new AA();	// void 안 붙은거 출력
		a.AA();	// void 붙은거 출력
	}

}
 