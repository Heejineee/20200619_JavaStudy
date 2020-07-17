class Member
{
	// 인스턴스 변수 => 저장 => new
	private String name;	// 접근 불가능
	public int age;	// 접근 가능
	protected String addr;	// 접근 가능
	String tel;	// 접근 가능

	//	필요하면 변수를 사용 가능하게 만든다
	public void setName(String n)	// 메모리에 저장
	{
		name=n;
	}
	public String getName()	// 메모리에서 데이터 읽기
	{
		return name;
	} 
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Member에 저장되어 있는 변수에 접근
		// Member를 저장
		Member m=new Member();
		// 변수값을 지정
		//	m.name="홍길동";
		m.setName("홍길동");
		m.age=30;
		m.addr="서울";
		m.tel="010-1111-1111";

		// 출력
		System.out.println("이름 : "+m.getName());
		System.out.println("나이 : "+m.age);
		System.out.println("주소 : "+m.addr);
		System.out.println("전화 : "+m.tel);
	}

}
