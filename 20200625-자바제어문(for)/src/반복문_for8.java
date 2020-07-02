// A-Z까지 출력
public class 반복문_for8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='A'; ch<='Z'; ch++)
		{
			System.out.print(ch);
		}
		System.out.println();
		for(char ch='a'; ch<='z'; ch++)
		{
			System.out.print(ch);
		}
		// for문은 블럭 안에서만 사용되고 사라져서 변수명이 같은데도 출력이 된거!  

		for(int i=10; i>=1; i--)
		{
			System.out.println(i);
		}
		System.out.println("================");
		for(int i=1, j=10; i<=10; i++,j--)
		{
			System.out.println("i="+i+", j="+j);
		}
	}

}
