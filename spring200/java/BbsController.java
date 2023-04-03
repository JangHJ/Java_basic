package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("insert2.multi")
	public void insert(BbsVO bag) {
		System.out.println("insert2요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		
		dao.insert(bag);
	}
	
	@RequestMapping("update2.multi")
	public void update(BbsVO bag) {
		System.out.println("update2요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete2.multi")
	public void delete(int no) {
		System.out.println("delete2요청됨.");
		System.out.println(no);
		dao.delete(no);
	}
	
	@RequestMapping("one2.multi")
	public void one(int no, Model model) {
		System.out.println("one2요청됨.");
		System.out.println(no);
		BbsVO bag = dao.one(no);
		//bbs상세페이지 만들 때, reply list도 함께 가지고 와야함.
		ArrayList<ReplyVO> list = dao2.list(no);		
		model.addAttribute("list", list);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("list2.multi")
	public void list(Model model) {
		System.out.println("list2요청됨.");
		ArrayList<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8	
}