package com.sist.project.data;
import java.util.*;
import java.io.*;
public class BugsManager2 {
   // ������ ����
   private static ArrayList<BugsVO> List=new ArrayList<BugsVO>();
   static
   {
      try
      {
         /*
          * ���� �б�
          *    1) �� ���ھ� �д� ��� : read()
          *       FileInputStream
          *       FileReader
          *    2) �� �پ� �д� ��� : readLine()
          *       ��ü �����͸� �ӽ� ���� ������ ���� �� ��� : BufferedReader
          */
         // ����� ���� �б�
         FileInputStream fr=new FileInputStream("c:\\javaDev\\bugs_Music.txt");
         // �޸𸮿� ��ü �����͸� ��Ƽ� ����
         BufferedReader in=new BufferedReader(new InputStreamReader(fr));
         while(true)
         {
            String Bugs=in.readLine();   // readLine() => \n
            if(Bugs==null) break; // ���� => ������ �� ���� ���
            
            StringTokenizer st=new StringTokenizer(Bugs,"|");
            while(st.hasMoreTokens())
            {
               BugsVO vo=new BugsVO();
               vo.setMno(Integer.parseInt(st.nextToken()));
               vo.setCno(Integer.parseInt(st.nextToken()));
               vo.setPoster(st.nextToken());
               vo.setTitle(st.nextToken());
               // String score=st.nextToken();
               // score=score.substring(score.indexOf("��")+1);
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
         // pagecnt => ���� ��ġ
         if(i<10 && j>=pagecnt)
         {
            Bugss.add(vo);
            i++;   // 10���� �����ִ� ����
         }
         j++;   // for ���ư��� Ƚ��
      }
      return Bugss;
   }
   public int BugsTotalPage()
   {   
      return (int)(Math.ceil(List.size()/10.0));
      // ceil�� �ø� �޼ҵ�(������ ���� ��)
   }
   // �󼼺���
   public BugsVO BugsDetailData(int mno)
   {
      return List.get(mno-1);
   }
   // ��ȭ ��ü �б�
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
   //�˻�
   public ArrayList<BugsVO> BugsFindData(String ss)
   {
	   ArrayList<BugsVO> Bugss=new ArrayList<BugsVO>(); //�����迭
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
      System.out.print("������ : ");
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
      
      // ������ �б�
      ArrayList<BugsVO> list=m.BugsListData(page);
      
      for(BugsVO vo:list)
      {
         System.out.println(vo.getTitle());
      }
   }
}