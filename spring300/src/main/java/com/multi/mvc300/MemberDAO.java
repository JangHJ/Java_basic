package com.multi.mvc300;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import 화면DB연결.MemberVO;
//스프링에 dao는 싱글톤으로 하나만 만들어서 사용할게!라고 설정해야함.
//2가지방법을 할 수 있음.
//어노테이션(표시)방법, XML방법
@Component
public class MemberDAO { // CRUD
	
	//mybatis 싱글톤 객체 찾아서 주소넣어주기
	@Autowired
	SqlSessionTemplate my;
	
	
//특정한 방법으로 실행하는 클래스(model, 방법) 
//	public int login(MemberVO bag) {
//		
//		return result;
//	}
//
//	public ArrayList<MemberVO> list() {
//		
//		return list;
//	}
//
//	public MemberVO one(String id) {
//		
//		return bag;
//	}
//
	public int delete(String id) {
		int result = my.insert("member.del", id);
		return result;
	}

	// 1. 가방을 받아서 저장해두자.
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
	public int update(MemberVO bag) {
		int result = my.insert("member.up", bag);
		return result;
	}

	// public void add2() {
	public int insert(MemberVO bag) {
		int result = my.insert("member.create", bag);
		//namespace.id
		return result;
	}
}
