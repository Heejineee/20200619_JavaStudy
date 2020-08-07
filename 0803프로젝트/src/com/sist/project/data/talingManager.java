package com.sist.project.data;

// ������ ����
import java.util.*;
import java.io.*;

public class talingManager {

	
	//������ ����
		private static ArrayList<talingVO> list=
				new ArrayList<talingVO>();
		//��� �ڹ����Ͽ��� �������� ����ؾ� �ϱ� ������ �ݵ�� static���� ����
		//���α׷� �����Ҷ� => ������ ���� => ArrayList�� ������ ����
		static
		{
			try
			{	
				
				//����� ���� �б�*****
				FileInputStream fr=new FileInputStream("c:\\javaDev\\taling_data2.txt");
				//�޸𸮿� ��ü �����͸� ��Ƽ� ����
				BufferedReader in=new BufferedReader(new InputStreamReader(fr));//���۵帮�� �ӽ� ���������ġ
				while(true)
				{
					String lesson=in.readLine(); // readLine() => \n���� �ٲ𶧱��� �о��
					if(lesson==null) break; // ���� => ������ �� ���� ���
					
					
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
		{//�������� ������ ���
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
			//ceil�� �ø� �޼ҵ�
		}
		//�󼼺���
		public talingVO talingDetailData(int mno)
		{
			return list.get(mno-1);//get�� ���°� �δ콺��ȣ�� 0������ ����
		}
		//��ȭ��ü�б�
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
		//����˻�
		public ArrayList<talingVO> movieFindData(String ss)
		{//Arraylist�� ��� �˻��ǵ� ���������� ������ ���������� �迭�� ������ ���س��� �Ѱ谡 �ִ�
			ArrayList<talingVO> movies=new ArrayList<talingVO>();//�������� �迭
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
			System.out.print("������:");
			int page=scan.nextInt();
			
			talingManager m=new talingManager();
			System.out.println(page+" page / "+m.lessonTotalPage()+" pages");
			
			//������ �б�
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