import java.io.FileReader;

public class �ڹٸ޼ҵ�5 {
	static String[] title= {
			"#����ִ�",
			"���",
			"�¿���: �� �Ϸ��� ����",
			"�Ҹ���",
			"�κ����� 2020",
			"��ũ ����Ʈ",
			"������ ���",
			"Ʈ���� ���ͽ� ��",
			"�߱��ҳ�",
			"�ƹ�ư, �ƴ�"
	};
	static void titleMax()
	{
		int max=0;
		for(int i=0; i<title.length;i++)
		{
			if(max<title[i].length())
				max=title[i].length();
		}
		for(int i=0;i<title.length;i++)
		{
			if(max==title[i].length())
				System.out.println(title[i]);
		}
	}
	static void titleMin()
	{
		int min=100;
		for(int i=0; i<title.length;i++)
		{
			if(min>title[i].length())
				min=title[i].length();
		}
		for(int i=0;i<title.length;i++)
		{
			if(min==title[i].length())
				System.out.println(title[i]);
		}
	}
	static void process()
	{
		System.out.println("���� �� ��ȭ�� : ");
		titleMax();
	}
	static void process2()
	{
		System.out.println("���� ª�� ��ȭ�� : ");
		titleMin();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		process();
		process2();
		/*
			FileReader fr=new FileReader("C:\\javaDev\\news.txt");
			String news="";
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			System.out.println(sb.toString());
		*/

	}

}
