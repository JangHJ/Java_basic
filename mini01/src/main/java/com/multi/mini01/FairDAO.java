package com.multi.mini01;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FairDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(FairVO bag) {
		my.insert("fair.create", bag);
	}
	
	public void delete(String id) {
		int result = my.delete("fair.del", id); //int
		System.out.println(result);
	}

	public void update(FairVO bag) {
		my.update("fair.up", bag);
	}
	
	public FairVO one(String id) {
		FairVO vo = my.selectOne("fair.one", id);
		System.out.println(vo);
		return vo;
	}
	
	public List<FairVO> list() {
		List<FairVO> list = my.selectList("fair.all");
		System.out.println(list);
		return list;
	}
}