// 1~100���� 3�� ����� ��, 5�� ����� ��, 7�� ����� �� ���
public class �ݺ���_for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a3=0, a5=0, a7=0;
		for (int i=1; i<=100; i++)
		{
			if(i%3==0)
				a3+=i;
			if(i%5==0)
				a5+=i;
			if(i%7==0)
				a7+=i;
			// �� ���� else if�� ���� 3�� ���, 7�� ��� ���� �Ǵϱ� �ܵ� if������ ��!
		}
		System.out.println("1~100���� 3�� ����� �� : "+a3);
		System.out.println("1~100���� 5�� ����� �� : "+a5);
		System.out.println("1~100���� 7�� ����� �� : "+a7);

		// 100~999���� 7�� ����� ����
		int count=0;
		for(int a=100; a<=999; a++)
		{
			if(a%7==0)
				count++;
		}
		System.out.println("100~999���� 7�� ����� ���� : "+count);
	}

}
