package com.sist.data;

import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MainClass3 {
	
	public static FoodHouseVO[] categoryFoodData()
	{
		FoodHouseVO[] food=new FoodHouseVO[10];
		try
		{
			Document doc=Jsoup.connect("https://www.mangoplate.com/top_lists/1965_hotel_bingsu").get();
			Elements title=doc.select("span.title h3");
			Elements score=doc.select("strong.point span");
			Elements address=doc.select("p.etc");
			Elements poster=doc.select("img.center-croping");
			Elements review=doc.select("p.short_review");
			for(int i=0; i<10; i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(score.get(i).text());
				System.out.println(address.get(i).text());
				System.out.println(poster.get(i).attr("data-original"));	// 속성 값일땐 attr, 그냥 텍스트일 땐 text
				System.out.println(review.get(i).text());
				System.out.println("===========================================");
				food[i]=new FoodHouseVO();
				food[i].setTitle(title.get(i).text());
				food[i].setScore(Double.parseDouble(score.get(i).text()));	
				// 문자열을 double형으로 변환하는거 Double.parseDouble()
				// 문자열 => 정수 Integer.parseInt()
				//	문자열 => 논리 Boolean.parseBoolean()
				// 얘네 다 Wrapper Class
				food[i].setAddress(address.get(i).text());
				food[i].setPoster(poster.get(i).attr("data-original"));
				food[i].setReview(review.get(i).text());				
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();  // 에러 위치 확인
		}
		return food;
	}
	public static CategoryVO[] categoryListDate() {
		CategoryVO[] cate=new CategoryVO[10];
		try
		{
			Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
			// System.out.println(doc);
			Elements title=doc.select("div.info_inner_wrap span.title");
			Elements subject=doc.select("div.info_inner_wrap p.desc");
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
			//Elements link=doc.select("");
			for(int i=0; i<10; i++)
			{
				System.out.println("======================================");
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
				cate[i]=new CategoryVO();
				cate[i].setCno(i+1);
				cate[i].setTitle(title.get(i).text());
				cate[i].setSubject(subject.get(i).text());
				cate[i].setPoster(poster.get(i).attr("data-lazy"));
			}
		}catch(Exception ex)
		{
			ex.printStackTrace(); // 에러시에 어디서 오류났는지 확인
		}
		return cate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// URL ==> https://www.mangoplate.com/ ==> CheckException
		/*try
		{
			Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
			System.out.println(doc);
			Elements title=doc.select("div.info_inner_wrap span.title");
			Elements subject=doc.select("div.info_inner_wrap p.desc");
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping");
			//Elements link=doc.select("");
			for(int i=0; i<10; i++)
			{
				System.out.println("======================================");
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
				
				  try
				{
					String temp=(i+1)+"|"+title.get(i).text()+"|"+subject.get(i).text()+"|"+poster.get(i).attr("data-lazy")+"\r\n";
					FileWriter fw=new FileWriter("c:\\javaDev\\category.txt",true);
					fw.write(temp);
					fw.close();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
				
			}
		}catch(Exception ex)
		{
			ex.printStackTrace(); // 에러시에 어디서 오류났는지 확인
		}
		*/
		categoryFoodData();
	}

}
