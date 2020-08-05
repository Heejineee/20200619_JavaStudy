package com.sist.project.data;
//������ ���� 
import java.util.*;
import java.io.*;

public class LemonManager {
 // ������ ���� 
	private static ArrayList<LemonVO> list=new ArrayList<LemonVO>();
	
	static
	{
		try
		{
			FileInputStream fr=new FileInputStream("c:\\javaDev\\lemon.txt");
			BufferedReader in=new BufferedReader(new InputStreamReader(fr));
			while(true)
			{
				String lemon=in.readLine(); // readLine() => \n
				if(lemon==null) break; // ���� => ������ �� ���� ��� 
			
				StringTokenizer st=new StringTokenizer(lemon,"|");
				while(st.hasMoreTokens())
				{
					try
					{
						LemonVO vo=new LemonVO();
						vo.setMno(Integer.parseInt(st.nextToken()));
						vo.setCno(Integer.parseInt(st.nextToken()));
						vo.setPoster(st.nextToken());
						vo.setTitle(st.nextToken());
						vo.setAddress(st.nextToken());
						vo.setPrice(st.nextToken());
						vo.setStory(st.nextToken());
						list.add(vo);
					}catch(Exception ex) {}
					
				}
			}
			
		}catch(Exception ex) 
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public ArrayList<LemonVO> lemonListData(int page)
	{
		ArrayList<LemonVO> lemons=new ArrayList<LemonVO>();
		int i=0;
		int j=0;
		int pagecnt=(page*10)-10;
		/*
		 *    1page  => 0~9
		 *    2page  => 10~19
		 *    3page  => 20~29
		 */
		for(LemonVO vo:list)
		{
			// pagecnt => ���� ��ġ 
			if(i<10 && j>=pagecnt)
			{
				lemons.add(vo);
				i++;// 10���� �����ִ� ���� 
			}
			j++;// for���ư��� Ƚ��
		}
		return lemons;
	}
	public int lemonTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
		// ceil�� �ø� �޼ҵ� 
	}
	// �󼼺��� 
	public LemonVO lemonDetailData(int mno)
	{
		return list.get(mno-1);
	}
	// ��ȭ ��ü �б�
	public ArrayList<LemonVO> lemonAllData(int cno)
	{
		ArrayList<LemonVO> lemons=new ArrayList<LemonVO>();
		for(LemonVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				lemons.add(vo);
			}
		}
		return lemons;
	}
	// �˻� 
	public ArrayList<LemonVO> lemonFindData(String ss)
	{
		ArrayList<LemonVO> lemons=new ArrayList<LemonVO>();// �����迭 
		// list
		for(LemonVO vo:list)
		{
			if(vo.getTitle().contains(ss))
			{
				lemons.add(vo);
			}
		}
		return lemons;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("������:");
		int page=scan.nextInt();
		
		LemonManager m=new LemonManager();
		System.out.println(page+" page / "+m.lemonTotalPage()+" pages");
		
		// ������ �б� 
		ArrayList<LemonVO> list=m.lemonListData(page);
		
		for(LemonVO vo:list)
		{
			System.out.println(vo.getTitle());
		}
	}
}

