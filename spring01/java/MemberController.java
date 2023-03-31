package com.multi.mvc01;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //스프링에서 제어하는 역할로 등록! 
public class MemberController {

	@Autowired
	MemberDAO dao;
	//컨트롤 하는 기능(CRUD)
	//회원가입, 수정, 탈퇴, 정보검색
	
	@RequestMapping("login")
	public String login(MemberVO bag, HttpSession session){
		System.out.println(bag);
		//dao를 이용해서 db처리할 예정.
		//views아래로 넘어가게 되어있음.
		//views아래 login.jsp를 호출.
		int result = dao.login(bag);
		if(result == 1) {
			//로그인 성공하면, 세션을 잡아두자
			session.setAttribute("id", bag.getId());
			return "ok"; //views아래 파일이름.jsp
		}else {
			return "redirect:member.jsp";
			//다음 결과를 담을 jsp파일명을 스프링프로그램에 알려주기.
		}
	}
	
	//클래스 내에서 기능처리 담당
	//멤버변수 + 멤버메서드(기능처리 담당)
	//하나의 요청당 하나의 메서드
	//하나의 버튼호출당 하나의 함수 연결!
	//요청된 주소가 어떻게 될 때
	//바로 아래에 있는 메서드가 호출이 될지를
	//써주어야 한다. 
	@RequestMapping("insert")
	public void insert(MemberVO bag) {
		//메서드의 입력변수(파라메터)로 변수를
		//선언해두면, 컨트롤러내의 메서드내에서는
		//1)bag을 만들어서 
		//2)클라이언트로 부터 전달된 데이터도 받아줌.
		//3)bag에 데이터 다 넣어줌.
		System.out.println("insert요청됨.");
		System.out.println(bag);
		System.out.println("---------------");
		System.out.println(dao);
		
		//dao에게 insert요청!!
		dao.insert(bag);
		System.out.println("--------------------------------");
	}
	@RequestMapping("update")
	public void update(MemberVO bag) {
		System.out.println("update요청됨.");
		System.out.println(bag);
		System.out.println("---------------");
		System.out.println(dao);
		dao.update(bag);
		System.out.println("--------------------------------");
	}
	
	@RequestMapping("delete")
	public void delete(String id) {
		System.out.println("delete요청됨.");
		System.out.println(id);
		System.out.println("---------------");
		System.out.println(dao);
		dao.delete(id);
		System.out.println("--------------------------------");
	}
	
	@RequestMapping("one")
	public void one(String id, Model model) {
		System.out.println("one요청됨.");
		System.out.println(id);
		MemberVO bag = dao.one(id);
		model.addAttribute("bag", bag);
		//bag에 검색결과 다 들어있음.
	}
	
	@RequestMapping("list.multi")
	public void list(Model model) {
		System.out.println("list요청됨.");
		ArrayList<MemberVO> list = dao.list();
		model.addAttribute("list", list);
	}
	//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%8F%99%EC%B0%A8
}
