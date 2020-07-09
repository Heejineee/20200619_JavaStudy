//	영화명, 출연, 감독, 예매율, 순위 X 5개
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title= {
						"#살아있다(2020)",
						"밤쉘: 세상을 바꾼 폭탄선언(2019)",
						"다크 나이트 라이즈(2012)",
						"반도(2020)",
						"소년시절의 너(2019)",
						};
		String[] actor= {
						"유아인, 박신혜",
						"샤를리즈 테론, 니콜 키드먼, 마고 로비",
						"크리스찬 베일, 마이클 케인, 게리 올드만, 앤 해서웨이, 톰 하디, 마리옹 꼬띠아르, 조셉 고든 레빗, 모건 프리먼",
						" 강동원, 이정현",
						"주동우, 이양천새",
						};
		String[] director= {
						"조일형",
						"제이 로치",
						"리스토퍼 놀란",
						"연상호",
						"증국상",
						};
		double[] reserve= {17.4,12.1,7.5,38.2,2.7};
		int[] rank= {1,2,3,4,5};
		
		for(int i=0; i<5; i++)
		{
			System.out.println("영화명 : "+title[i]);
			System.out.println("감독 : "+director[i]);
			System.out.println("출연 : "+actor[i]);
			System.out.println("예매율 : "+reserve[i]);
			System.out.println("순위 : "+rank[i]);
			System.out.println("=============================");
		}

	}

}
