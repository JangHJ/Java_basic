package com.multi.mvc200;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	@RequestMapping("json1")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public MemberVO json1() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		return bag; // {"id" : "root", "pw" : "1234", "name" : "hong", "tel" : "011" }
	}

	@RequestMapping("json2")
	@ResponseBody 
	public ArrayList<MemberVO> json2() {
		MemberVO bag = new MemberVO();
		bag.setId("root");
		bag.setPw("1234");
		bag.setName("hong");
		bag.setTel("011");
		
		MemberVO bag2 = new MemberVO();
		bag2.setId("root2");
		bag2.setPw("12342");
		bag2.setName("hong2");
		bag2.setTel("0112");
		
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		list.add(bag);
		list.add(bag2);
		
		return list;  //{"id" : "root", "pw" : "1234", "name" : "hong", "tel":"011"}
	}
	
	@RequestMapping("json3")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public BbsVO json3() {
		BbsVO bag = new BbsVO();
		bag.setNo(1);
		bag.setTitle("today");
		bag.setContent("is wednesday");
		bag.setWriter("apple");
		return bag;
	}
	
	@RequestMapping("json4")
	@ResponseBody 
	public ArrayList<BbsVO> json4() {
		BbsVO bag = new BbsVO();
		bag.setNo(2);
		bag.setTitle("hello world!");
		bag.setContent("my name is hello");
		bag.setWriter("apple");
		
		BbsVO bag2 = new BbsVO();
		bag2.setNo(3);
		bag2.setTitle("HiHi!");
		bag2.setContent("byebyebyebye!");
		bag2.setWriter("apple");
		
		ArrayList<BbsVO> list = new ArrayList<BbsVO>();
		list.add(bag);
		list.add(bag2);
		
		return list; 
	}
	
	@RequestMapping("jsonResponse5")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public MapVO json5() {
		MapVO bag = new MapVO();
		bag.setLat(37.563118);
		bag.setLon(127.192932);
		
		return bag;
	}

	@RequestMapping("jsonResponse6")
	@ResponseBody //요청을 받으면 return되는 데이터를 json으로 만들어서 요청하는 곳으로 다시 보냄.
	public ArrayList<ChartVO> json6() {
		ArrayList<ChartVO> list = new ArrayList<ChartVO>();
		
		ChartVO vo = new ChartVO();
		vo.setWork("study!");
		vo.setTime(10);
		list.add(vo);
		
		ChartVO vo2 = new ChartVO();
		vo2.setWork("run!");
		vo2.setTime(5);
		list.add(vo2);
		
		ChartVO vo3 = new ChartVO();
		vo3.setWork("eat!");
		vo3.setTime(7);
		list.add(vo3);
		
		return list;
	}
}
