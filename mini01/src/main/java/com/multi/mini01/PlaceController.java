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
public class PlaceController {
	
	@Autowired
	PlaceDAO dao; 
	
	@Autowired
	PlaceDetailDAO dao2; 
	
	@RequestMapping("test_tmp2")
	public void test() {
		test_main();
	}	
	public void test_main2(String id) {
		String key = "55f2e69c1e6146dab5fe824a31328f70"; // api key값
		try {
			String url = "https://www.kopis.or.kr/openApi/restful/prfplc/" + id +  "?service=" + key;

			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);

			// root tag
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("db");
			// System.out.println("파싱할 리스트 수 : "+ nList.getLength());

			//List<placeVO> list = new ArrayList<placeVO>();
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$");
					String id2 = getTagValue("mt10id", eElement);
					String name2 = getTagValue("fcltynm", eElement);
					String cnt2 = getTagValue("mt13cnt", eElement);
					String chartr2 = getTagValue("fcltychartr", eElement);
					String opende2 = getTagValue("opende", eElement);
					String seatscale = getTagValue("seatscale", eElement);
					String telno = getTagValue("telno", eElement);
					String relateurl = getTagValue("relateurl", eElement);
					String adres = getTagValue("adres", eElement);
					String la = getTagValue("la", eElement);
					String lo = getTagValue("lo", eElement);
					
					PlaceDetailVO bag = new PlaceDetailVO();
					//placeDAO dao = new placeDAO(); // placeDAO 객체 생성
					
					bag.setId(id2);
					bag.setName(name2);
					bag.setCnt(cnt2);
					bag.setChartr(chartr2);
					bag.setOpende(opende2);
					bag.setSeatscale(seatscale);
					bag.setTelno(telno);
					bag.setRelateurl(relateurl);
					bag.setAdres(adres);
					bag.setLa(la);
					bag.setLo(lo);
					
					dao2.insert(bag);			
				} // for end
			} // if end

		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch end
	} // main end
	
	public void test_main() {
		String key = "55f2e69c1e6146dab5fe824a31328f70"; // api key값
		try {
			String url = "https://www.kopis.or.kr/openApi/restful/prfplc?service=" + key + "&cpage=1&rows=2528";

			DocumentBuilderFactory dbFactoty = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
			Document doc = dBuilder.parse(url);

			// root tag
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			// 파싱할 tag
			NodeList nList = doc.getElementsByTagName("db");
			// System.out.println("파싱할 리스트 수 : "+ nList.getLength());

			//List<placeVO> list = new ArrayList<placeVO>();
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					System.out.println("######################");
					String id = getTagValue("mt10id", eElement);
					String name = getTagValue("fcltynm", eElement);
					String cnt = getTagValue("mt13cnt", eElement);
					String chartr = getTagValue("fcltychartr", eElement);
					String sido = getTagValue("sidonm", eElement);
					String gugun = getTagValue("gugunnm", eElement);
					String opende = getTagValue("opende", eElement);
					
					PlaceVO bag = new PlaceVO();
					//placeDAO dao = new placeDAO(); // placeDAO 객체 생성
					
					bag.setId(id);
					bag.setName(name);
					bag.setCnt(cnt);
					bag.setChartr(chartr);
					bag.setSido(sido);
					bag.setGugun(gugun);
					bag.setOpende(opende);
					
					dao.insert(bag);
					
					test_main2(id);
					
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
	
	@RequestMapping("insert2")
	public void insert(PlaceVO bag) {
		System.out.println(bag);
		dao.insert(bag);
	}	

	@RequestMapping("delete2")
	public void delete() {
		dao.delete();
	}
	
	@RequestMapping("update2")
	public void update(PlaceVO bag) {
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("one2")
	public void one(String id, Model model) {
		System.out.println(id);
		PlaceVO vo = dao.one(id); //vo
		//view아래까지 전달할 데이터를 model객체를 이용해 속성으로 지정
		model.addAttribute("vo", vo); //속성으로 지정
	}
	
	@RequestMapping("list2")
	public void list(Model model) {
		List<PlaceVO> list = dao.list();
		//view아래까지 전달할 데이터를 model객체를 이용해 속성으로 지정
		model.addAttribute("list", list); //속성으로 지정
	}
}