package com.multi.mini01;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlaceDetailDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(PlaceDetailVO bag) {
		my.insert("placedt.create", bag);
	}
	
	public void delete() {
		my.delete("placedt.del");
	}

	public void update(PlaceDetailVO bag) {
		my.update("placedt.up", bag);
	}
	
	public PlaceDetailVO one(String id) {
		PlaceDetailVO vo = my.selectOne("placedt.one", id);
		System.out.println(vo);
		return vo;
	}
	
	public List<PlaceDetailVO> list() {
		List<PlaceDetailVO> list = my.selectList("placedt.all");
		System.out.println(list);
		return list;
	}
}