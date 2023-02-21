package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링3 {
//크롤링은 인터넷 문서(html)를 다 받아와서,
//html문서를 분석(parser, 파싱!)을 해서 내가 원하는 정보를 추출하는 것.
	public static void main(String[] args) {
		//https://finance.naver.com/item/main.naver?code=035720 카카오
		//https://finance.naver.com/item/main.naver?code=041510 sm
		//https://finance.naver.com/item/main.naver?code=035420 네이버
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=041510");
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements list1 = doc.select(".today"); 
			System.out.println(list1.size());
			Element tag = list1.get(0);
			String str1 = tag.text();
			System.out.println("현재 시세 " + str1);
			
			System.out.println();
			
			Elements list2 = doc.select(".today span.blind");
			System.out.println(list2.size());
			System.out.println(list2);
			
			Elements list3 = doc.select(".rate_info .blind");
			System.out.println("--------------");
			System.out.println(list3.size());
			System.out.println(list3);
			
			Element t1 = list2.get(0);
			String today = t1.text();
			System.out.println("현재가 : " + today);
			
			Element t2 = list3.get(4);
			String yesterday = t2.text();
			System.out.println("전일 : " + yesterday);
			
			Element t3 = list3.get(5);
			String high = t3.text();
			System.out.println("고가 : " + high);
			
			Element t4 = list3.get(9);
			String low = t4.text();
			System.out.println("저가 : " + low);
			
			Element t5 = list3.get(8);
			String siga = t5.text();
			System.out.println("시가 : " + siga);
			
			
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