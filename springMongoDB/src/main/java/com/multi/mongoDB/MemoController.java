package com.multi.mongoDB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //싱글톤 + 컨트롤러 등록
public class MemoController {
	
	@Autowired
	MemoDAO dao;
	
	@RequestMapping("list.memo")
	public void list(Model model) {
		List<MemoVO2> list = dao.list();
		System.out.println(list);
		model.addAttribute("list", list);
	}
	@RequestMapping("insert.memo")
	public void insert(MemoVO2 vo) {
		dao.insert(vo);
	}
	@RequestMapping("one.memo")
    public void one(String _id, Model model) {
        System.out.println("one.memo컨트롤러 >> " + _id);
        MemoVO2 vo = dao.one(_id);
        model.addAttribute("vo", vo);
    }
	
	@RequestMapping("delete.memo")
    public String delete(String _id) {
        dao.delete(_id);
        return "redirect:/mongo_memo.jsp";
    }
	
	@RequestMapping("update.memo")
    public String update(String _id, String content, Model model) {
        //400 error --> bad request error
        MemoVO2 vo = new MemoVO2();
        vo.set_id(_id);
        vo.setContent(content);
        dao.update(vo);
        System.out.println("update.memo 컨트롤러>> " + vo);
        return "redirect:/mongo_memo.jsp";
    }
}
