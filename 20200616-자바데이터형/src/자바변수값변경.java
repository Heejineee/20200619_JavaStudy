/*
 * 변수 선언
 * 변수 초기화
 * 변수의 값 변경
 * 다른 변수에 값 전달
 */
public class 자바변수값변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i, j는 사용하지 않는다 (글씨가 비슷해서)
		int a=100;
		// 만약 int 앞에 final 붙으면 상수가 되는거라 오류가 나게됨/지금은 변수라 실행 가능
		System.out.println("a="+a);
		a=200;
		System.out.println("a="+a);
		a=300;
		System.out.println("a="+a);
		
		int b=200; 
		int c=b;
		// c라는 메모리에 b가 갖고있는 값을 대입한다
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		int x,y,z;
		x=y=z=100;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
	}

}
