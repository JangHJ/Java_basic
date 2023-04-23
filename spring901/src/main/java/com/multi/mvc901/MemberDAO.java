package com.multi.mvc901;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MemberVO bag) {
		my.insert("member.create", bag);
	}
	
	public void delete(String id) {
		int result = my.delete("member.del", id); //int
		System.out.println(result);
	}

	public void update(MemberVO bag) {
		my.update("member.up", bag);
	}
	
	public MemberVO one(String id) {
		MemberVO vo = my.selectOne("member.one", id);
		System.out.println(vo);
		return vo;
	}
	
	public List<MemberVO> list() {
		List<MemberVO> list = my.selectList("member.all");
		System.out.println(list);
		return list;
	}
}