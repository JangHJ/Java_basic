package com.multi.mvc01;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class GradeController {

	@Autowired
	GradeDAO dao;
	//컨트롤 하는 기능(CRUD)
	//성적등록, 수정, 삭제, 상세검색, 전체검색
	
	@RequestMapping("insert4.multi")
	public void insert(GradeVO bag, Model model) {
		System.out.println("insert4 요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("update4.multi")
	public void update(GradeVO bag, Model model) {
		System.out.println("update4 요청됨.");
		System.out.println(bag);
		dao.update(bag);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("delete4.multi")
	public void delete(int id) {
		System.out.println("delete4 요청됨.");
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("one4.multi")
	public void one(int id, Model model) {
		System.out.println("one4 요청됨.");
		System.out.println(id);
		GradeVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list4.multi")
	public void list(Model model) {
		System.out.println("list4 요청됨.");
		ArrayList<GradeVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8	
}