package com.multi.mvc300;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BbsDAO { // CRUD

	//mybatis 싱글톤 객체 찾아서 주소넣어주기
	@Autowired
	SqlSessionTemplate my;
	
//	public ArrayList<BbsVO> list() {
//		
//		return list;
//	}
//
//	// 메서드를 만드는 것 ==> 메서드 정의(define)!
//	// 메서드를 정의했다고 실행되는 것은 아니다.!
//	// 메서드를 쓰는 것 ==> 메서드 호출(call)!
//	public BbsVO one(int no) {
//		
//		return bag;
//	}

	public int delete(int no) {
		int result = my.insert("bbs.del", no);
		return result;
	}

	// 1. 가방을 받아서 저장해두자.
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
	public int update(BbsVO bag) {
		int result = my.insert("bbs.up", bag);
		return result;
	}

	// public void add2() {
	public int insert(BbsVO bag) {
		int result = my.insert("bbs.create", bag);
		return result;
	}
}
