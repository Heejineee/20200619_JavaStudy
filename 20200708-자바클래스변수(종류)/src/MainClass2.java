class MovieInfo{
	// �������, �ν��Ͻ� ���� => �޸� ������ ���� ==> new �����!
	String title;
	String director;
	String actor;
	double reserve;
	int rank;
	static String site_name;		// static�� ������ �ϳ��� �ؿ��� ������ �������൵ m3�� ���� ����
}
// MovieInfo m1=new MovieInfo()
public class MainClass2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieInfo m1=new MovieInfo();
		// m1 �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ => MovieInfo m1=new MovieInfo()
		m1.title="#����ִ�(2020)";
		m1.director="������";
		m1.actor="������, �ڽ���";
		m1.reserve=17.4;
		m1.rank=1;
		m1.site_name="CGV";
		
		MovieInfo m2=new MovieInfo();
		// m2 �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ
		m2.title="�㽩: ������ �ٲ� ��ź����(2019)";
		m2.director="���� ��ġ";
		m2.actor="�������� �׷�, ���� Ű���, ���� �κ�";
		m2.reserve=12.1;
		m2.rank=2;
		m2.site_name="�Ե��ó׸�";
		
		MovieInfo m3=new MovieInfo();
		// m3 �޸𸮿� ����Ǿ� �ִ� ������ �ʱⰪ
		m3.title="��ũ ����Ʈ ������(2012)";
		m3.director="�������� ���";
		m3.actor="ũ������ ����, ����Ŭ ����, �Ը� �õ常, �� �ؼ�����, �� �ϵ�, ������ ����Ƹ�, ���� ��� ����, ��� ������";
		m3.reserve=7.5;
		m3.rank=3;
		m3.site_name="�ް��ڽ�";
		
		MovieInfo.site_name="�������";	// �̷��� �ϸ� m1~m3�� site_name�� ��� ������� ���� �ٲ�!
		
		System.out.println("��ȭ�� : "+m1.site_name);
		m3.title="�� ����(2011)";
		System.out.println("��ȭ���� : "+m1.title);
		System.out.println("��ȭ���� : "+m3.title);

	}

}
