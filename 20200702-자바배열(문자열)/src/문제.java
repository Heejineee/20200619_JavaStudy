import java.util.*;
public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� 10�� �迭�� ����, �迭�� �ִ� ���� �� 3�� ����� ���
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		for(int i:arr)
		{
			if(i%3==0)
				System.out.println(i);
		}
		
		System.out.println();
		
		// ���� 10�� �����ϴ� �迭�� ����� 1~10���� ������ �����ϰ� ������ �迭�� ����. �迭�� �� ���ڵ�� ��� ���
		int[] arr1=new int[10];
		for(int i=0; i<10; i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
		}
		int total=0;
		for(int i:arr)
		{
			total+=i;
		}
		System.out.println("��� : "+total/10.0);
		
		System.out.println();
		
		// ���� �̸��� �Է¹޾� ���� ����ϴ� ���α׷�
		String course[]= {"Java","C++","HTML5","��ǻ�ͱ���","�ȵ���̵�"};
		int score[]= {95,88,76,62,55};
		
		Scanner scan=new Scanner(System.in);
		boolean bCheck=false;
		
		while(true)
		{
			System.out.println("���� �Է� : ");
			String user=scan.nextLine();
			if(user.equals("�׸�"))
			{
				break;
			}
			for(int i=0; i<course.length; i++)
			{
				if(user.equals(course[i]))
				{
					bCheck=true;
					System.out.println(score[i]);
				}
			}
			if(bCheck==false)
			{
				System.out.println("���� �����Դϴ�!");
			}
		}	
	}

}
