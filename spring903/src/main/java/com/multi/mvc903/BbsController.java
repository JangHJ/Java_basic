package com.multi.mvc903;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	//@Autowired
	//ReplyDAO dao2;
	
	@RequestMapping("bbsList")
	public void list(BbsVO vo, Model model) {
		List<BbsVO> list = dao.list();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("bbsList2")
	public void list2(PageVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<BbsVO> list = dao.list2(vo);
		model.addAttribute("list", list);
	}
	
	@RequestMapping("bbsAll")
	public void all(PageVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<BbsVO> list = dao.all(vo);
		int count = dao.count();
		System.out.println("all count>> " + count);
		int pages = count / 10 + 1; //전체 페이지 개수 구하
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
	}
	
	@RequestMapping("bbsAll2")
	public void all2(PageVO vo, Model model) {
		vo.setStartEnd(vo.getPage());
		List<BbsVO> list = dao.all(vo);
		int count = dao.count();
		System.out.println("all count>> " + count);
		int pages = count / 10 + 1; //전체 페이지 개수 구하기 
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		model.addAttribute("pages", pages);
	}
	/*
	@RequestMapping("bbsOne")
	public void one(BbsVO vo, Model model) {
		//게시물 1개짜리 vo2
		//replyList
		BbsVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
		
		List<ReplyVO> list = dao2.list(vo);
		model.addAttribute("list", list);
	}
	*/
	@RequestMapping("bbsIn")
	public void insert(BbsVO vo, Model model) {
		//리뷰<--- movie(oriId, img)
		//insert into review values (null, #{oriId}, #{content}, #{writer})
		//화면만들때는 
		//review + movie(oriId, img)
		
		int result = dao.insert(vo);
		BbsVO vo2 = dao.createdId();
		String text = "게시물 작성 성공";
		if(result != 1) {
			text = "게시물 작성 실패";
		}
		model.addAttribute("result", text);
		model.addAttribute("id", vo2.getId());
	}
	@RequestMapping("bbsDel")
	public void delete(BbsVO vo, Model model) {
		int result = dao.del(vo);
		model.addAttribute("result", result);
	}
	@RequestMapping("bbsUp")
	public void update(BbsVO vo, Model model) {
		//수정하기버튼을 누르면, 기존의 db에 저장된 데이터를
		//가지고 와서, 수정할 수 있는 화면에 넣어주어야 한다. 
		BbsVO vo2 = dao.one(vo);
		model.addAttribute("one", vo2);
	}
	@RequestMapping("bbsUp2")
	public String update2(BbsVO vo, Model model) {
		//수정하고 싶은 것이 있으면 수정처리 요청. 
		int result = dao.up(vo);
		if(result == 1) {
			return "bbsUp2";
		}else {
			return "no";
		}
	}
}
