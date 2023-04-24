package com.multi.mini01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class FairController {
	
	@Autowired
	FairDAO dao; 
	
	@RequestMapping("insert")
	public void insert(FairVO bag) {
		System.out.println(bag);
		dao.insert(bag);
	}	

	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println(id);
		dao.delete(id);
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
		model.addAttribute("list", list); //속성으로 지정
	}
}