package com.sist.project.data;
import java.io.FileWriter;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class LemonData {
	public void LemonAllData()
	{
		
		ArrayList<LemonVO> list=new ArrayList<LemonVO>();
		String[] site= {
			"https://www.daangn.com/region/%EC%84%9C%EC%9A%B8%ED%8A%B9%EB%B3%84%EC%8B%9C",
			"https://www.daangn.com/region/%EB%B6%80%EC%82%B0%EA%B4%91%EC%97%AD%EC%8B%9C",
			"https://www.daangn.com/region/%EB%8C%80%EA%B5%AC%EA%B4%91%EC%97%AD%EC%8B%9C",
			"https://www.daangn.com/region/%EC%9D%B8%EC%B2%9C%EA%B4%91%EC%97%AD%EC%8B%9C",
			"https://www.daangn.com/region/%EA%B4%91%EC%A3%BC%EA%B4%91%EC%97%AD%EC%8B%9C"	
		};

		int mno=384;
		int cno=5;		
		try 
		{
		Document doc=Jsoup.connect("https://www.daangn.com/region/%EA%B4%91%EC%A3%BC%EA%B4%91%EC%97%AD%EC%8B%9C").get();
		Elements link=doc.select("a.card-link");

			for(int j=0; j<link.size(); j++)
			{
				try
				{
					String url="https://www.daangn.com/"+link.get(j).attr("href");
					Document doc2=Jsoup.connect(url).get();					
					Element poster=doc2.selectFirst("div.image-wrap img");
					System.out.println("포스터 : "+poster.attr("data-lazy"));
					Element title=doc2.selectFirst("h1#article-title");
					System.out.println("제목 : "+title.text());
					Element address=doc2.selectFirst("div#region-name");
					System.out.println("주소 : "+address.text());
					Element price=doc2.selectFirst("p#article-price");
					System.out.println("가격 : "+price.text());
					Element story=doc2.selectFirst("div#article-detail");
					System.out.println("설명 : "+story.text());
					
					String msg=mno+"|"+cno+"|"+poster.attr("data-lazy")+"|"+title.text()+"|"+address.text()+"|"+price.text()+"|"+story.text()+"\r\n";
					FileWriter fw=new FileWriter("c:\\javaDev\\lemon.txt",true);
					fw.write(msg);
					fw.close();
					
					mno++;
					
				}catch(Exception ex) {}
		}

		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());  
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		LemonData m=new LemonData();
		m.LemonAllData();
	}

}

