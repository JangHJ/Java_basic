package com.multi.mvc300;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BookController {

	@Autowired
	BookDAO dao;
	
//	@Autowired
//	ReplyDAO dao2;
	
	@RequestMapping("insert3")
	public void insert(BookVO bag) {
		System.out.println("insert3요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		
		dao.insert(bag);
	}
	
	@RequestMapping("update3")
	public void update(BookVO bag) {
		System.out.println("update3요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete3")
	public void delete(int id) {
		System.out.println("delete3요청됨.");
		System.out.println(id);
		dao.delete(id);
	}	
	
	@RequestMapping("one3")
	public void one(int id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		BookVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("all3")
	public void all(Model model) {
		System.out.println("one요청됨.");
		List<BookVO> list = dao.all();
		model.addAttribute("list", list);
	}
}