/*
 * 대입 : 결과값을 받는다
 * 종류)	
 * 			- = : int a=10 ==> 10을 a라는 메모리에 대입한다
 * 			- 복합대입연산자 
 * 				- op(연산자)
 * 				- += ex) int a=10; a+=2; ==> a=a+2 ===> a=12
 * 				- -= ex) int a=10; a-=5; ==> a=a-5 ===> a=5
 * 				- *= ex) int a=10; a*=5; ==> a=a*5 ==> a=50
 * 				- /= ex) int a=10; a/=3; ==> a=a/3 ===> a=3
 * 				- %= ex) int a=10; a%=3; ==> a=a%3 ===> a=1
 * 				- &= ex) int a=10; a&=3; ==> a=a&3; ===> a=2
 * 				- |= ex) int a=10; a|=3; ==> a=a|3; ===> a=11
 * 				- <<= ex) int a=10; a<<=3; ==> a=a<<3 ==> a=10<<3 ===> a=80(10*2의3제곱)
 * 				- >>= ex) int a=10; a>>=3; ==> a=a>>3 ==> a=10>>3 ===> a=1(10/2의3제곱)
 * 
 * 한개증가 : 증가연산자 (++)
 * 원하는 갯수만큼 증가 : 복합 대입연산자 (+=5)
 * 한개증가 ==> a++, ++a, a+=1, a=a+1 다 쓸 수 있음!
 */
public class 이항연산자_대입연산자 {
//3씩 증가 할 때, a+=3; 이렇게 쓰는게 더 효율적
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; 
		//복합대입 연산자
		a+=5; //a=a+5==>15
		System.out.println("a="+a);
		
		int b=10;
		b-=5; //b=b-5 ==>5 ==> b값에 5를 빼라
		System.out.println("b="+b);
		
		int c=10;
		c*=5; //c=c*5; 
		System.out.println("c="+c);
		
		int d=10;
		d/=3; //d=d/3;
		System.out.println("d="+d);
	}

}
