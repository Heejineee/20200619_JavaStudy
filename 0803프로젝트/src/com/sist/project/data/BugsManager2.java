package com.sist.project.data;
import java.util.*;
import java.io.*;
public class BugsManager2 {
   // 데이터 저장
   private static ArrayList<BugsVO> List=new ArrayList<BugsVO>();
   static
   {
      try
      {
         /*
          * 파일 읽기
          *    1) 한 글자씩 읽는 방법 : read()
          *       FileInputStream
          *       FileReader
          *    2) 한 줄씩 읽는 방법 : readLine()
          *       전체 데이터를 임시 저장 공간에 저장 후 사용 : BufferedReader
          */
         // 저장된 파일 읽기
         FileInputStream fr=new FileInputStream("c:\\javaDev\\bugs_Music.txt");
         // 메모리에 전체 데이터를 모아서 관리
         BufferedReader in=new BufferedReader(new InputStreamReader(fr));
         while(true)
         {
            String Bugs=in.readLine();   // readLine() => \n
            if(Bugs==null) break; // 종료 => 파일을 다 읽은 경우
            
            StringTokenizer st=new StringTokenizer(Bugs,"|");
            while(st.hasMoreTokens())
            {
               BugsVO vo=new BugsVO();
               vo.setMno(Integer.parseInt(st.nextToken()));
               vo.setCno(Integer.parseInt(st.nextToken()));
               vo.setPoster(st.nextToken());
               vo.setTitle(st.nextToken());
               // String score=st.nextToken();
               // score=score.substring(score.indexOf("점")+1);
               // vo.setScore(score.trim());
               vo.setArtist(st.nextToken());
               //vo.setAlbumtitle(st.nextToken());
               vo.setGenre(st.nextToken());
           
               
                              
               List.add(vo);
               
            }
            
         }
      }catch(Exception ex)
      {
         ex.printStackTrace();
      }
   }
   public ArrayList<BugsVO> BugsListData(int page)
   {
      ArrayList<BugsVO> Bugss=new ArrayList<BugsVO>();
      int i=0;
      int j=0;
      int pagecnt=(page*10)-10;
      /*
       * 1page => 0~9
       * 2page => 10~9
       * 3page => 20~29
       */
      for(BugsVO vo:List)
      {
         // pagecnt => 저장 위치
         if(i<10 && j>=pagecnt)
         {
            Bugss.add(vo);
            i++;   // 10개씩 나눠주는 변수
         }
         j++;   // for 돌아가는 횟수
      }
      return Bugss;
   }
   public int BugsTotalPage()
   {   
      return (int)(Math.ceil(List.size()/10.0));
      // ceil는 올림 메소드(페이지 구할 때)
   }
   // 상세보기
   public BugsVO BugsDetailData(int mno)
   {
      return List.get(mno-1);
   }
   // 영화 전체 읽기
   public ArrayList<BugsVO> BugsAllData(int cno)
   {
      ArrayList<BugsVO> Bugss=new ArrayList<BugsVO>();
      for(BugsVO vo:List)
      {
         if(vo.getCno()==cno)
         {
            Bugss.add(vo);
         }
      }
      return Bugss;
   }
   //검색
   public ArrayList<BugsVO> BugsFindData(String ss)
   {
	   ArrayList<BugsVO> Bugss=new ArrayList<BugsVO>(); //가변배열
	   //list
	   for(BugsVO vo:List)
	   {
		   if(vo.getTitle().contains(ss))
		   {
			   Bugss.add(vo);
		   }
	   }
	   
	   return Bugss;
   }
   public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.print("페이지 : ");
      int page=scan.nextInt();
      /*
         for(MusicVO vo:List)
         {   
            if(vo.getTitle().contains(ss))
            {
            System.out.println(vo.getTitle());
            }
         }
      */
      BugsManager2 m=new BugsManager2();
      System.out.println(page+" page / "+m.BugsTotalPage()+" pages");
      
      // 데이터 읽기
      ArrayList<BugsVO> list=m.BugsListData(page);
      
      for(BugsVO vo:list)
      {
         System.out.println(vo.getTitle());
      }
   }
}