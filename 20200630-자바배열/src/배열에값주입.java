import java.util.Arrays;

/*
 * �迭�� �� ���� : 0������ �Է� / �ǵں��� �Է��ϴ� ���
 * 		1. ���� ����
 * 		2. ����ڰ� �Է��� �� => Scanner
 * 		3. ���� �̿�
 * 		4. File �б�
 * 		5. Web���� �о ����
 * 		6. ����Ŭ
 * 
 */
// 3���� �л� �������� => ����, ����, ���� ==> 1. ���� 2. ��� 3. ���� 4. ���
import java.util.*;
public class �迭�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3]; // kor1, kor2, kor3 �� ����
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		double[] avg=new double[3];
		char[] hakjum=new char[3];
		int[] rank=new int[3];
				
		/*
		 * for(int i=0; i<3; i++)
		 * {
		 * 		Scanner scan=new Scanner(System.in); // �̷��� �ȿ� ������ ��������� 3�� ���� �׷��� �̷��� �Ƚ�!
		 * }
		 */
		Scanner scan=new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			System.out.printf("%d��° ���� ���� �Է� : ",i+1);
			kor[i]=scan.nextInt();
			System.out.printf("%d��° ���� ���� �Է� : ",i+1);
			eng[i]=scan.nextInt();
			System.out.printf("%d��° ���� ���� �Է� : ",i+1);
			math[i]=scan.nextInt();
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		// ���� ���
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
		// ��� ���
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
		System.out.printf("%-4s%-4s%-4s%-7s%-7s%-5s%-6s\n","����","����","����","����","���","����","���");
		//%-5d => 80000 (�տ������� ä��� �ڿ� ����)
		//%5d => 00080 (�ں��� ä��� �տ� ����)
		/*
		 * %s => String
		 * %d => int
		 * %f => double
		 * %c => char
		 */
		// ��ϵ� ������ ���
		for(int i=0; i<3; i++)
		{
			System.out.printf("%-7d%-7d%-7d%-9d%-9.2f%-9c%-5s\n",kor[i],eng[i],math[i],total[i],avg[i],hakjum[i],rank[i]);
			
		}
	}

}
