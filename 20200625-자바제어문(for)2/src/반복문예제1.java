// AaBbCcDd....Zz
public class 반복문예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='a';
		for(char ch='A'; ch<='Z'; ch++)
		{
			//System.out.print(ch+""+c++);
			//System.out.print(ch+""+(char)(ch+32));
			System.out.print(ch+""+c);
			c++;
		}
		System.out.println();
		// 조건이 없이 1~10 홀수만 출력
		for(int i=1; i<=10; i+=2)
		{
				System.out.print(i+"\t");
	}
		System.out.println();
		for(int j=2; j<=10; j+=2)
		{
			System.out.print(j+"\t");
		}
		System.out.println();
		// 1~5 ==> 1,2,3,4,5
		for(int a=1; a<=5; a++)
		{
			System.out.print(a);
			if(a<5)
				System.out.print(",");
		}
		System.out.println();
		// 10 ==> 1010, 15 ==> 1111 (2진법 출력)
		int su=10;
		for(;;)
		{
			int b=su%2;
			System.out.print(b);
			su=su/2;
			if(su==0)
				break;
		}
	}
}
