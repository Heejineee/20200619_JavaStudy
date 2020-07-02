/*
 *  변수 Scope
 *  변수 종류
 *  	- 지역변수
 *  	- 멤버변수
 *  	- 공유변수
 *  
 *  	public class A
 *  	{
 *  		int a; ===> 멤버변수 ==> 클래스 A가 저장이 될 때마다 생성됨
 *  		static int b; ===> 공유변수 ==>JVM(가상머신) class를 로드할 때
 *  		public static void main(String[] args)
 *  		{
 *  			int c; ===> 지역변수
 *  		} ==> c 변수 ==> main에서만 사용이 가능
 *  	}
 */
public class 변수사용범위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		for(i=1; i<=10; i++)
		{
			System.out.println("i="+i);
		} // i 메모리는 삭제
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
