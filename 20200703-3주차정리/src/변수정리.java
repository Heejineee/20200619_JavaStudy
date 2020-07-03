/*
 * 	변수 : 필요에 의해 변경해서 사용할 수 있는 메모리 기억공간
 * 	상수 : 변경할 수 없는 값
 * 
 * 	변수의 종류
 * 		1) 한개의 데이터 공간 => 변수
 * 		2) 같은 타입 여러개를 저장하는 공간 => 배열 (연속적으로 메모리에 저장 => 인덱스 이용)
 * 		3) 다른 타입 여러개를 저장하는 공간 => 클래스
 * 				- 변수로만 사용하는 방법 (사용자 정의 데이터형) : 데이터형 클래스
 * 				- 기능만 설정 : 액션 클래스
 * 			※ 변수 : 메모리에 저장 => 프로그램이 종료하면 자동으로 메모리에서 사라진다
 * 
 * 	변수의 기본형 (자바에서 제공하는 메모리 크기)
 * 		- 정수 저장(int => 일반 프로그램, long => 빅데이터/금융 프로그램)
 * 		- 실수 저장 (double)
 * 		- true/false 저장 (boolean => 존재 여부 확인/while문 종료시 사용)
 * 		- 문자 여러개 저장 (String) ==> String이 가장 큼! double보다 더!)
 * 
 * 	변수 선언 : 데이터형 변수명; ex) int a;
 * 	변수 초기화 : 변수명=값; ex) a=10;
 * 
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] com=new int[10]; // 1~10 중복 안되게 숫자 임의 추출
		// 추출
		for(int i=0; i<10; i++)
		{
			com[i]=(int)(Math.random()*10)+1;
		}
		// 출력
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		// 이렇게 하면 중복 발생,,
		System.out.println();
		
		int su=0; // 난수값 저장 (중복 없으면 저장, 중복 되면 난수 다시 발생) => 중복 없으면 false, 있으면 true
		boolean bCheck=false;
		for(int i=0; i<10; i++)
		{
			// 중복 여부 확인, 중복이 되면 다시 난수 발생
			bCheck=true;
			while(bCheck)
			{
				// 난수
				su=(int)(Math.random()*10)+1;
				// 종료 확인
				bCheck=false;
				// 비교 => 같은 수가 저장되었는지 확인
				for(int j=0; j<i; j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			} // while문이 false가 되면 while문 종료
			com[i]=su;
		}
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		

	}

}
