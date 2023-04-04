package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.mvc200.ReplyVO;
import com.multi.mvc200.MemberVO;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyDAO dao; //100번 주소

	@Autowired
	MemberDAO dao2; //100번 주소
	
	@RequestMapping("insert4")
	public void insert(ReplyVO vo, Model model) {
		System.out.println("insert4요청됨.");
		System.out.println(vo);
		
		dao.insert(vo);
		
		ArrayList<ReplyVO> list = dao.list(vo.getBbsno());
		model.addAttribute("list", list);
	}
	
	@RequestMapping("list6")
	public void list6(int bbsno, Model model) {
		ArrayList<ReplyVO> list = dao.list(bbsno);
		model.addAttribute("list", list);
	}

	@RequestMapping("list7")
	public void list7(String writer, Model model) {
		ArrayList<ReplyVO> list2 = dao.list2(writer);
		model.addAttribute("list", list2);
	}
	
	@RequestMapping("one5")
	public void one5(String id, Model model) {
		MemberVO bag = dao2.one(id);
		model.addAttribute("bag", bag);
	}
}
