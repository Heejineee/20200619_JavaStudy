//	��ȭ��, �⿬, ����, ������, ���� X 5��
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title= {
						"#����ִ�(2020)",
						"�㽩: ������ �ٲ� ��ź����(2019)",
						"��ũ ����Ʈ ������(2012)",
						"�ݵ�(2020)",
						"�ҳ������ ��(2019)",
						};
		String[] actor= {
						"������, �ڽ���",
						"�������� �׷�, ���� Ű���, ���� �κ�",
						"ũ������ ����, ����Ŭ ����, �Ը� �õ常, �� �ؼ�����, �� �ϵ�, ������ ����Ƹ�, ���� ��� ����, ��� ������",
						" ������, ������",
						"�ֵ���, �̾�õ��",
						};
		String[] director= {
						"������",
						"���� ��ġ",
						"�������� ���",
						"����ȣ",
						"������",
						};
		double[] reserve= {17.4,12.1,7.5,38.2,2.7};
		int[] rank= {1,2,3,4,5};
		
		for(int i=0; i<5; i++)
		{
			System.out.println("��ȭ�� : "+title[i]);
			System.out.println("���� : "+director[i]);
			System.out.println("�⿬ : "+actor[i]);
			System.out.println("������ : "+reserve[i]);
			System.out.println("���� : "+rank[i]);
			System.out.println("=============================");
		}

	}

}
