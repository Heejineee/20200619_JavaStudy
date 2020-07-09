import java.util.*;
public class �߱�����_�޼ҵ� {
	// ���� �߻� �޼ҵ�
	static int[] getRand()
	{
		int[] com=new int[3];
		int su=0; // ���� �����ϴ� ����
		boolean bCheck=false; // �ߺ� ���� Ȯ�� (�ߺ� : true / �ߺ�X : false)
		for(int i=0; i<3; i++)
		{
			bCheck=true;
			while(bCheck)
			{
				// ���� �߻�
				su=(int)(Math.random()*9)+1; // 1~9
				bCheck=false;
				for(int j=0; j<i; j++)
				{
					if(com[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			com[i]=su;
		}
		return com;
	}
	
	// ����� �Է� �޼ҵ�
	static int[] userInput()
	{
		int[] user=new int[3];
		
		// �Է�
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("���ڸ� ������ �Է� : ");
			int input=scan.nextInt();
			
			// ù ��° ���� ó�� => �� �ڸ� ���� �Է��� �ȵ� ���
			if(input<100 || input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�!");
				continue; // ó������ �̵�
			}
			user[0]=input/100; // ex) 369 => 369/100=3
			user[1]=(input%100)/10; // ex) 368%100 ==> 68/10 ==> 6
			user[2]=input%10;
			
			// �� ��° ���� ó�� => �ߺ��� ���� �Է��� ���
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("�ߺ��� ������ ����� �� �����ϴ�!");
				continue;
			}
			
			// �� ��° ���� ó�� => 0 �Է��� ��� 
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0�� ����� �� �����ϴ�");
				continue;
			}
			break;
		}
			return user;
	}
	
	// ��~��Ʈ
	static void hint(int[] com, int[] user)
	{
		// ��
					int s=0, b=0;
					for(int i=0; i<3; i++)
					{
						for(int j=0; j<3; j++)
						{
							if(com[i]==user[j])
							{
								if(i==j)
									s++;
								else
									b++;
							}
						}
					}
					// ��Ʈ
					System.out.printf("Input Number : %d%d%d, Result : %dS-%dB\n",user[0],user[1],user[2],s,b);
					if(isEnd(s))
					{
						System.out.println("Game Over!");
						System.exit(0); // if������ break(�ݺ��������� ����) �� ���ϱ�!
					}
	}
	static boolean isEnd(int s)
	{
		if(s==3)
		{
			return true;
		}
		else
			return false;
	}
	static void process()
	{
		int[] com=getRand();
		while(true)
		{
			int[] user=userInput();
			hint(com, user);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
