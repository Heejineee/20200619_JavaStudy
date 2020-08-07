package com.sist.project.data;

// 데이터 관리
import java.util.*;
import java.io.*;

public class talingManager {

	
	//데이터 저장
		private static ArrayList<talingVO> list=
				new ArrayList<talingVO>();
		//모든 자바파일에서 공통으로 사용해야 하기 때문에 반드시 static으로 선언
		//프로그램 시작할때 => 데이터 수집 => ArrayList에 저장후 시작
		static
		{
			try
			{	
				
				//저장된 파일 읽기*****
				FileInputStream fr=new FileInputStream("c:\\javaDev\\taling_data2.txt");
				//메모리에 전체 데이터를 모아서 관리
				BufferedReader in=new BufferedReader(new InputStreamReader(fr));//버퍼드리더 임시 기억저장장치
				while(true)
				{
					String lesson=in.readLine(); // readLine() => \n줄이 바뀔때까지 읽어옴
					if(lesson==null) break; // 종료 => 파일을 다 읽은 경우
					
					
					StringTokenizer st=new StringTokenizer(lesson,"|");
					while(st.hasMoreTokens())
					{
						try {
						talingVO vo=new talingVO();
						vo.setLno(Integer.parseInt(st.nextToken()));
						vo.setCno(Integer.parseInt(st.nextToken()));
						vo.setTitle(st.nextToken());
						vo.setImage("https:"+st.nextToken());
						vo.setPrice(st.nextToken());
						vo.setSpot(st.nextToken());
						vo.setName(st.nextToken());
						vo.setTime(st.nextToken());
						vo.setInfo(st.nextToken());
						
						list.add(vo);
						}catch(Exception ex) {}
					}
				}
			}catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		public ArrayList<talingVO> movieListData(int page)
		{//총페이지 나누는 방법
			ArrayList<talingVO> lessons=new ArrayList<talingVO>();
			int i=0;
			int j=0;
			int pagecnt=(page*10)-10;
			
			for(talingVO vo:list)
			{
				if(i<10 && j>=pagecnt)
				{
					lessons.add(vo);
					i++;
				}
				j++;
			}
			return lessons;
			
		}
		public int lessonTotalPage()
		{
			return (int)(Math.ceil(list.size()/10.0));
			//ceil는 올림 메소드
		}
		//상세보기
		public talingVO talingDetailData(int mno)
		{
			return list.get(mno-1);//get에 들어가는건 인댁스번호라서 0번부터 시작
		}
		//영화전체읽기
		public ArrayList<talingVO> talingAllData(int cno)
		{
			ArrayList<talingVO> movies=new ArrayList<talingVO>();
			for(talingVO vo:list)
			{
				if(vo.getCno()==cno)
				{
					movies.add(vo);
				}
			}
			return movies;
		}
		//무비검색
		public ArrayList<talingVO> movieFindData(String ss)
		{//Arraylist는 몇개가 검색되도 유동적으로 대응이 가능하지만 배열은 갯수를 정해놔서 한계가 있다
			ArrayList<talingVO> movies=new ArrayList<talingVO>();//가변형인 배열
			//list
			for(talingVO vo:list)
			{
				if(vo.getTitle().contains(ss))
				{
					movies.add(vo);
				}
			}
			
			return movies;
		}
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.print("페이지:");
			int page=scan.nextInt();
			
			talingManager m=new talingManager();
			System.out.println(page+" page / "+m.lessonTotalPage()+" pages");
			
			//데이터 읽기
			ArrayList<talingVO> list=m.movieListData(page);
			
			for(talingVO vo:list)
			{
				System.out.println(vo.getInfo());
			}
			/*
			 * for(MovieVO vo:list) { if(vo.getTitle().contains(ss))
			 * {System.out.println(vo.getTitle()); } }
			 */
		}
	}