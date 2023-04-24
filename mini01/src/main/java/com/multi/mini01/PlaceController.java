package com.multi.mini01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class PlaceController {
	
	@Autowired
	PlaceDAO dao; 
	
	@RequestMapping("insert2")
	public void insert(PlaceVO bag) {
		System.out.println(bag);
		dao.insert(bag);
	}	

	@RequestMapping("delete2")
	public void delete(String id) {
		System.out.println(id);
		dao.delete(id);
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