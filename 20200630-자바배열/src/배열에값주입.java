import java.util.Arrays;

/*
 * 배열에 값 주입 : 0번부터 입력 / 맨뒤부터 입력하는 방식
 * 		1. 직접 주입
 * 		2. 사용자가 입력한 값 => Scanner
 * 		3. 난수 이용
 * 		4. File 읽기
 * 		5. Web에서 읽어서 주입
 * 		6. 오라클
 * 
 */
// 3명의 학생 성적관리 => 국어, 영어, 수학 ==> 1. 총점 2. 평균 3. 학점 4. 등수
import java.util.*;
public class 배열에값주입 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; // kor1, kor2, kor3 과 같음
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hakjum=new char[3];
		int[] rank=new int[3];
				
		/*
		 * for(int i=0; i<3; i++)
		 * {
		 * 		Scanner scan=new Scanner(System.in); // 이렇게 안에 넣으면 저장공간이 3개 생김 그래서 이렇게 안써!
		 * }
		 */
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			System.out.printf("%d번째 국어 점수 입력 : ",i+1);
			kor[i]=scan.nextInt();
			System.out.printf("%d번째 영어 점수 입력 : ",i+1);
			eng[i]=scan.nextInt();
			System.out.printf("%d번째 수학 점수 입력 : ",i+1);
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		// 학점 계산
		for(int i=0; i<3; i++)
		{
			char c='A';
			switch(total[i]/30)
			{
			case 10:
			case 9:
				c='A';
				break;
			case 8:
				c='B';
				break;
			case 7:
				c='C';
				break;
			case 6:
				c='D';
				break;
			default:
				c='F';
				break;
			}
			hakjum[i]=c;
		}
		// 등수 계산
		for(int i=0; i<3; i++)
		{
			rank[i]=1;
			for(int j=0; j<3; j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		System.out.printf("%-4s%-4s%-4s%-7s%-7s%-5s%-6s\n","국어","영어","수학","총점","평균","학점","등수");
		//%-5d => 80000 (앞에서부터 채우고 뒤에 여백)
		//%5d => 00080 (뒤부터 채우고 앞에 여백)
		/*
		 * %s => String
		 * %d => int
		 * %f => double
		 * %c => char
		 */
		// 등록된 점수를 출력
		for(int i=0; i<3; i++)
		{
			System.out.printf("%-7d%-7d%-7d%-9d%-9.2f%-9c%-5s\n",kor[i],eng[i],math[i],total[i],avg[i],hakjum[i],rank[i]);
			
		}
	}

}
