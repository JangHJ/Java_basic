package com.multi.mini01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class PlaceDetailController {
	
	@Autowired
	PlaceDetailDAO dao; 
	
	@RequestMapping("insert3")
	public void insert(PlaceDetailVO bag) {
		System.out.println(bag);
		dao.insert(bag);
	}	

	@RequestMapping("delete3")
	public void delete() {
		dao.delete();
	}
	
	@RequestMapping("update3")
	public void update(PlaceDetailVO bag) {
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("one3")
	public void one(String id, Model model) {
		System.out.println(id);
		PlaceDetailVO vo = dao.one(id); //vo
		//view아래까지 전달할 데이터를 model객체를 이용해 속성으로 지정
		model.addAttribute("vo", vo); //속성으로 지정
	}
	
	@RequestMapping("list3")
	public void list(Model model) {
		List<PlaceDetailVO> list = dao.list();
		//view아래까지 전달할 데이터를 model객체를 이용해 속성으로 지정
		model.addAttribute("list", list); //속성으로 지정
	}
}