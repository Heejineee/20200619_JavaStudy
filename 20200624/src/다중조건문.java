/*
 * 		1. ������ ����
 * 			1) ����ڰ� ��û ==> �ַ� ���
 * 			2) File �б�
 * 			3) ����Ŭ ����
 * 			4) ���� �ִ� ������ �б�
 * 		2. ����� ��û�� �������� 
 */
import java.util.*;
public class �������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���� �Է�");
		int kor, eng, math,total;
		double avg;
		char hakjum;

		System.out.println("���� ���� �Է� : ");
		kor=scan.nextInt();
		System.out.println("���� ���� �Է� : ");
		eng=scan.nextInt();
		System.out.println("���� ���� �Է� : ");
		math=scan.nextInt();

		total=kor+eng+math;
		avg=total/3.0;
		
		if(avg>=90)
			hakjum='A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else
			hakjum='F';
		
		System.out.println("======����======");
		System.out.println("���� ���� : "+kor);
		System.out.println("���� ���� : "+eng);
		System.out.println("���� ���� : "+math);
		System.out.println("���� : "+total);
		System.out.printf("��� : %.2f\n",avg);
		System.out.println("���� : "+hakjum);
	}

}
