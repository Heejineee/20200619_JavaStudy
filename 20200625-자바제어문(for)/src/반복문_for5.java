// 1~100������ ¦���� ��, Ȧ���� �� 
public class �ݺ���_for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int odd=0, even=0;
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("1~100 ���� ¦�� �� : "+even);
		System.out.println("1~100 ���� Ȧ�� �� : "+odd);
	}

}
