package com.multi.mini01;

import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Controller 
public class FairController {
	
	@Autowired
	FairDAO dao; 
	
	@RequestMapping("test_tmp")
	public void test() {
		test_main();
	}	
	public void test_main() {
		String key = "55f2e69c1e6146dab5fe824a31328f70"; // api key값
		try {
			String url = "https://www.kopis.or.kr/openApi/restful/prffest?service=" + key;

			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);

			// root tag
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("db");
			// System.out.println("파싱할 리스트 수 : "+ nList.getLength());

			//List<FairVO> list = new ArrayList<FairVO>();
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					System.out.println("######################");
					String id = getTagValue("mt20id", eElement);
					String name = getTagValue("prfnm", eElement);
					String fromdate = getTagValue("prfpdfrom", eElement);
					String todate = getTagValue("prfpdto", eElement);
					String place = getTagValue("fcltynm", eElement);
					String poster = getTagValue("poster", eElement);
					String genre = getTagValue("genrenm", eElement);
					String state = getTagValue("prfstate", eElement);
					String festival = getTagValue("festival", eElement);
					
					System.out.println("축제여부 : " + festival);
					
					
					FairVO bag = new FairVO();
					//FairDAO dao = new FairDAO(); // FairDAO 객체 생성
					
					bag.setId(id);
					bag.setName(name);
					bag.setFromdate(fromdate);
					bag.setTodate(todate);
					bag.setPlace(place);
					bag.setPoster(poster);
					bag.setGenre(genre);
					bag.setState(state);
					
					dao.insert(bag);
					
					
//					System.out.println("축제ID  : " + id);
//					System.out.println("축제이름  : " + name);
//					System.out.println("시작일 : " + fromdate);
//					System.out.println("종료일  : " + todate);
//					System.out.println("장소  : " + place);
//					System.out.println("포스터 : " + poster);
//					System.out.println("장르  : " + genre);
//					System.out.println("현재상태  : " + state);
//					
				} // for end
			} // if end

		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch end
	} // main end
	
	
	private String getTagValue(String tag, Element eElement) {
	    NodeList nlList = eElement.getElementsByTagName(tag);
	    if (nlList.getLength() > 0) {
	        NodeList childNodes = nlList.item(0).getChildNodes();
	        if (childNodes.getLength() > 0) {
	            Node node = childNodes.item(0);
	            return node.getNodeValue();
	        }
	    }
	    return "";
	}
	
	@RequestMapping("insert")
	public void insert(FairVO bag) {
		System.out.println(bag);
		dao.insert(bag);
	}	

	@RequestMapping("delete")
	public void delete() {
		dao.delete();
	}
	
	@RequestMapping("update")
	public void update(FairVO bag) {
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println(id);
		FairVO vo = dao.one(id); //vo
		//view아래까지 전달할 데이터를 model객체를 이용해 속성으로 지정
		model.addAttribute("vo", vo); //속성으로 지정
	}
	

	@RequestMapping("list")
	public void list(Model model) {
		List<FairVO> list = dao.list();
		//view아래까지 전달할 데이터를 model객체를 이용해 속성으로 지정
		System.out.println(list.size()); 
		model.addAttribute("list", list); //속성으로 지정
	}
}