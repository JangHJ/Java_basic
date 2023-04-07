package com.multi.mvc300;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! dependency
public class MemberController {

	//MemberDAO의 싱글톤 객체 ram의 어디에 있는지 찾아서 
	//그 주소를 아래 변수에 넣어주세요.
	@Autowired
	MemberDAO dao; //전역변수(글로벌 변수) 
	
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println(dao);
		dao.insert(bag);
	}
	
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		dao.update(bag);
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		dao.delete(id);
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		model.addAttribute("bag", bag);
	}
	
	@RequestMapping("all")
	public void all(Model model) {
		System.out.println("all요청됨.");
		List<MemberVO> list = dao.all();
		model.addAttribute("list", list);
	}
	
//	@RequestMapping("list")
//	public void list(Model model) {
//		System.out.println("list요청됨.");
//		ArrayList<MemberVO> list = dao.list();
//		model.addAttribute("list", list);
//	}

	//	
//	
//	@RequestMapping("one33")
//	@ResponseBody
//	public MemberVO one33(String id) {
//		System.out.println("one33요청됨.");
//		System.out.println(id);
//		MemberVO bag = dao.one(id);
//		//검색결과 있는지 프린트
//		System.out.println(bag);
//		return bag;
//	}

//	
//	@RequestMapping("list66")
//	@ResponseBody
//	public ArrayList<MemberVO> list66() {
//		ArrayList<MemberVO> list = dao.list();
//		System.out.println(list.size()); 
//		return list;
//	}

}
