// ���� ���� ���� => ����, ���, ����
import java.util.*;
public class �ڹٸ޼ҵ�2 {
	// �Է� �޴� �޼ҵ�
	static int userInput(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(subject+" ���� �Է� : ");
		int score=scan.nextInt();
		return score;
	}
	// ���� ���ϴ� �޼ҵ�
	static int total(int kor, int eng, int math)
	{
		return kor+eng+math;
	}
	// ��� ���ϴ� �޼ҵ� => �ƿ� ����ϴ� �ַ� ���� �ؿ��� ȣ�⸸ �ϸ� ��� ��!
	static void avg(int total)
	{
		System.out.printf("��� : %.2f\n",total/3.0);
	}
	// ���� ���ϱ�
	static char hakjum(int total)
	{
		char hakjum='A';
		switch(total/30)
		{
		case 10:
		case 9:
			hakjum='A';
			break;
		case 8:
			hakjum='B';
			break;
		case 7:
			hakjum='C';
			break;
		case 6:
			hakjum='D';
			break;
			default:
				hakjum='F';
			break;
		}		
		return hakjum;			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=userInput("����");
		int eng=userInput("����");
		int math=userInput("����");
		
		int total=total(kor,eng,math);	// ������, �޼ҵ�� ���Ƶ� ��
		
		// ���
		System.out.println("���� ���� : "+kor);
		System.out.println("���� ���� : "+eng);
		System.out.println("���� ���� : "+math);
		
		System.out.println("���� : "+total);
		avg(total);
		System.out.println("���� : "+hakjum(total));
		
	}

}
