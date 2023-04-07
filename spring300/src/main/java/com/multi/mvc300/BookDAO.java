package com.multi.mvc300;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDAO { // CRUD
	
	// mybatis 싱글톤 객체 찾아서 주소넣어주기
	@Autowired
	SqlSessionTemplate my;

	

	// 메서드를 만드는 것 ==> 메서드 정의(define)!
	// 메서드를 정의했다고 실행되는 것은 아니다.!
	// 메서드를 쓰는 것 ==> 메서드 호출(call)!
//	public BookVO one(int id) {
//
//		return bag;
//	}

	public int delete(int id) {
		int result = my.insert("book.del", id);
		return result;
	}

	// 1. 가방을 받아서 저장해두자.
	// 2. 필요할 때 가방에서 값들을 하나씩 꺼내자.
	public int update(BookVO bag) {
		int result = my.insert("book.up", bag);
		return result;
	}

	// public void add2() {
	public int insert(BookVO bag) {
		int result = my.insert("book.create", bag);
		return result;
	}
	
	public BookVO one(int id) {
		BookVO bag = my.selectOne("book.one", id);
		return bag;
	}
	
	public List<BookVO> all() {
		List<BookVO> list = my.selectList("book.all");
		return list;
	}
}
