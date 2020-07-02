/*
 * 온워드: 단 하루의 기적(2020)상영중
	Onward 평점 08 . 1
	판타지/어드벤처
	미국
	2020.06.17 개봉
	 102분, 전체관람가
	감독 댄 스캔론 주연 크리스 프랫, 톰 홀랜드, 옥타비아 스펜서, 줄리아 루이스 드레퓌스
	예매 3위 누적관객192,053명 
	
	위대한 쇼맨(2017)상영중
	The Greatest Showman 평점 09 . 9
	뮤지컬/드라마
	미국
	2017.12.20 개봉 2020.05.21 (재개봉)
	 104분, 12세이상관람가
	감독 마이클 그레이시 주연 휴 잭맨, 잭 에프론
	예매 5위 누적관객1,667,104명
 */
public class 변수설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title="온워드: 단 하루의 기적(2020)";
		boolean isOpen=true;
		double score=8.1;
		String na="미국";
		String genre="판타지/어드벤처";
		String regdate="2020.06.17";
		String director="댄 스캔론";
		String actor="크리스 프랫, 톰 홀랜드, 옥타비아 스펜서, 줄리아 루이스 드레퓌스";
		int time=102;
		int grade=15;
		int rank=1;
		int showUser=192053;		
		
		System.out.println("======영화정보======");
		System.out.println("영화명 : "+title);
		System.out.println(""+(isOpen==true?"상영중":"미개봉"));
		System.out.println("기타 : "+na+""+grade);
		System.out.println("시간 : "+time+"분");
		System.out.println("개봉일 : "+regdate+"개봉");
		System.out.println("감독 : "+director);
		System.out.println("출연 : "+actor);
		System.out.println("순위 : "+rank);
		System.out.println("누적관객수 : "+showUser);
		
		title="위대한 쇼맨(2017)";
		isOpen=true;
		score=9.9;
		na="미국";
		genre="뮤지컬/드라마";
		regdate="2017.12.20";
		director="마이클 그레이시";
		actor="휴 잭맨, 잭 에프론";
		time=104;
		grade=12;
		rank=2;
		showUser=1667104;		

		System.out.println("======영화정보======");
		System.out.println("영화명 : "+title);
		System.out.println(""+(isOpen==true?"상영중":"미개봉"));
		System.out.println("기타 : "+na+""+grade);
		System.out.println("시간 : "+time+"분");
		System.out.println("개봉일 : "+regdate+"개봉");
		System.out.println("감독 : "+director);
		System.out.println("출연 : "+actor);
		System.out.println("순위 : "+rank);
		System.out.println("누적관객수 : "+showUser);
	}

}
