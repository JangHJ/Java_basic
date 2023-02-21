package 주식정보시스템;

import java.io.IOException;

import javax.swing.text.html.HTML.Tag;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버웹툰크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://comic.naver.com/index");
		
		Document doc = null;
		try {
			doc = con.get(); //html코드를 다 가지고 와서 doc변수에 넣어주기
			Elements list = doc.select(".menu span");
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Element tag = list.get(i);
				String tagString = tag.text();
				System.out.println(tagString);
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
