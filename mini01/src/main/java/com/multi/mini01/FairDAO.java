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
		System.out.println("FairVO : " + bag);
		my.insert("fair.create", bag);

		
	}
	
	public void delete() {
		my.delete("fair.del");
		//System.out.println(result);
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