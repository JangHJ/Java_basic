package 주식정보시스템;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링4 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public void naver(String code2) {
		//https://finance.naver.com/item/main.naver?code=005930 삼전
		//https://finance.naver.com/item/main.naver?code=035720 카카오
		//https://finance.naver.com/item/main.naver?code=041510 sm
		//https://finance.naver.com/item/main.naver?code=035420 네이버
		//https://finance.naver.com/item/main.naver?code=096770 sk이노베이션
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code2);
		
		Document doc = null; //로컬변수 초기화! 수동으로!

		try {
			//<a href:"~"> -> 속성값만 추출하고 싶을 경우 attr
			doc = con.get();
			Elements list1 = doc.select(".wrap_company h2");
			//System.out.println(list1.get(0));
			
			Elements list2 = doc.select(".today span.blind");
//			System.out.println(list2.size());
//			System.out.println(list2);
			
			Elements list3 = doc.select(".rate_info .blind");
//			System.out.println("--------------");
//			System.out.println(list3.size());
			//System.out.println(list3);
			
			Element com = list1.get(0);
			String name = com.text();
			System.out.println(name);
			System.out.println("----------------------------");
			
			Element t1 = list2.get(0);
			String today = t1.text();
			System.out.println("현재가 : " + today);
			System.out.println("----------------------------");
			
			Element t2 = list3.get(4);
			String yesterday = t2.text();
			System.out.print("전일 : " + yesterday);
			
			Element t3 = list3.get(8);
			String siga = t3.text();
			System.out.println("\t시가 : " + siga);
			System.out.println("----------------------------");
			
			Element t4 = list3.get(5);
			String high = t4.text();
			System.out.print("고가 : " + high);
			
			Element t5 = list3.get(9);
			String low = t5.text();
			System.out.println("\t저가 : " + low);
			System.out.println("----------------------------");
			
			
			Element t6 = list3.get(7);
			String amount = t6.text();	//거래량
			System.out.print("거래량 : " + amount);
			
			Element t7 = list3.get(10);
			String money = t7.text();	//거래대금
			System.out.println("\t거래대금 : " + money);
		
			FileWriter file = new FileWriter(name +".txt");
			file.write("현재가 : " + today + "\n");
			file.write("전일 : " + yesterday + "\n");
			file.write("시가 : " + siga + "\n");
			file.write("고가 : " + high + "\n");
			file.write("저가 : " + low + "\n");
			file.write("거래량 : " + amount + "\n");
			file.write("거래대금 : " + money + "\n");
			file.close();
			
//			Element tag2 = list2.get(0);
//			String str2 = tag2.text();
//			System.out.println("현재 시세 " + str2);
//			
//			Elements list = doc.select("span.blind");
//			System.out.println(list.size());
//			System.out.println(list);
//			System.out.println();
//
//			Element tag2 = list.get(12);
//			String today = tag2.text();
//			System.out.println("현재가 : " + today);
//			
//			Element tag3 = list.get(20);
//			String low = tag3.text();
//			System.out.println("최저가 : " + low);
//			
//			Element tag4 = list.get(16);
//			String high = tag4.text();
//			System.out.println("최고가 : " + high);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}