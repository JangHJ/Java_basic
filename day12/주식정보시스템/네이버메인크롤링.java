package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("http://www.naver.com");
		System.out.println("1. 네트워크 연결 성공." + con);
		
		Document doc = null;
		try {
			doc = con.get(); //html코드를 다 가지고 와서 doc변수에 넣어주기
			org.jsoup.select.Elements list = doc.select(".nav");
			System.out.println(list.size());
			System.out.println(list);
			
			for (int i = 0; i < list.size(); i++) {
				Element tag1 = list.get(i);
				//System.out.println(tag1);
				String text1 = tag1.text(); 
				//<a class="nav">메일</a> ==> 태그 사이의 텍스트 추출
				System.out.println(text1);
				//.클래스		#id
				//클래스가 nav인 태그를 불러와서 ArrayList를 상속받은 Elements에 자동으로 넣어줌
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//System.out.println(doc);
		//메타데이터(부가적인 데이터) : <> => tag(태그)
		//웹페이지는 tag가 주요 구성요소(element)
		//<span class="date">20200609</span>
		
		
	}

}
