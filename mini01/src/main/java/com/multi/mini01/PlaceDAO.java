package com.multi.mini01;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaceDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(PlaceVO bag) {
		my.insert("place.create", bag);
	}
	
	public void delete(String id) {
		int result = my.delete("place.del", id); //int
		System.out.println(result);
	}

	public void update(PlaceVO bag) {
		my.update("place.up", bag);
	}
	
	public PlaceVO one(String id) {
		PlaceVO vo = my.selectOne("place.one", id);
		System.out.println(vo);
		return vo;
	}
	
	public List<PlaceVO> list() {
		List<PlaceVO> list = my.selectList("place.all");
		System.out.println(list);
		return list;
	}
}