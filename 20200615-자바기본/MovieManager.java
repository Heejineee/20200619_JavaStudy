package com.sist.project.data;
//데이터 관리 
import java.util.*;
import java.io.*;

public class MovieManager {
 // 데이터 저장 
	private static ArrayList<MovieVO> list=
			 new ArrayList<MovieVO>();
	
	static
	{
		try
		{
			
			// 저장된 파일 읽기 
			FileInputStream fr=new FileInputStream("c:\\javaDev\\daum_movie1.txt");
			// 메모리에 전체데이터를 모아서 관리 
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String movie=in.readLine(); // readLine() => \n
				if(movie==null) break; // 종료 => 파일을 다 읽은 경우 
			
				StringTokenizer st=new StringTokenizer(movie,"|");
				while(st.hasMoreTokens())
				{
					MovieVO vo=new MovieVO();
					vo.setMno(Integer.parseInt(st.nextToken()));
					vo.setCno(Integer.parseInt(st.nextToken()));
					vo.setTitle(st.nextToken());
					vo.setPoster("https:"+st.nextToken());
					String score=st.nextToken();
					score=score.substring(score.indexOf("점")+1);
					vo.setScore(score.trim());
					vo.setDirector(st.nextToken());
					vo.setActor(st.nextToken());
					vo.setGenre(st.nextToken());
					String regdate=st.nextToken();
					regdate=regdate.substring(0,regdate.lastIndexOf("개"));
					vo.setRegdate(regdate);
					String grade=st.nextToken();
					grade=grade.substring(grade.indexOf(",")+1);
					vo.setGrade(grade.trim());
					// 90,000 ==> 90000
					vo.setShowUser(Integer.parseInt(st.nextToken().replace(",", "")));
					vo.setStory(st.nextToken());
					list.add(vo);
				}
			}
			
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public ArrayList<MovieVO> movieListData(int page)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		/*
		 *    1page  => 0~9
		 *    2page  => 10~19
		 *    3page  => 20~29
		 */
		for(MovieVO vo:list)
		{
			// pagecnt => 저장 위치 
			if(i<10 && j>=pagecnt)
			{
				movies.add(vo);
				i++;// 10개씩 나눠주는 변수 
			}
			j++;// for돌아가는 횟수
		}
		return movies;
	}
	public int movieTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
		// ceil는 올림 메소드 
	}
	// 상세보기 
	public MovieVO movieDetailData(int mno)
	{
		return list.get(mno-1);
	}
	// 영화 전체 읽기
	public ArrayList<MovieVO> movieAllData(int cno)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();
		for(MovieVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				movies.add(vo);
			}
		}
		return movies;
	}
	// 검색 
	public ArrayList<MovieVO> movieFindData(String ss)
	{
		ArrayList<MovieVO> movies=new ArrayList<MovieVO>();// 가변배열 
		// list
		for(MovieVO vo:list)
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
		
		MovieManager m=new MovieManager();
		System.out.println(page+" page / "+m.movieTotalPage()+" pages");
		
		// 데이터 읽기 
		ArrayList<MovieVO> list=m.movieListData(page);
		
		for(MovieVO vo:list)
		{
			System.out.println(vo.getTitle());
		}
		/*
		 * for(MovieVO vo:list) { if(vo.getTitle().contains(ss)) {
		 * System.out.println(vo.getTitle()); } }
		 */
	}
}

