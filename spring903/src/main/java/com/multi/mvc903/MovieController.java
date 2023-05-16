package com.multi.mvc903;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MovieController {

	@Autowired
	MovieDAO dao;
	
	@RequestMapping("insert2")
	public void insert(
					MovieVO movieVO,
					HttpServletRequest request, 
					MultipartFile file, 
					Model model) throws Exception {
		String savedName = file.getOriginalFilename();
		String uploadPath 
			= request.getSession().getServletContext().getRealPath("resources/upload");
		File target = new File(uploadPath + "/" + savedName);
		file.transferTo(target);
		
		model.addAttribute("savedName", savedName);
		System.out.println("img넣기 전>> " + movieVO);
		movieVO.setImg(savedName);
		System.out.println("img넣은 후>> " + movieVO);
		
		dao.insert(movieVO);
		//컨트롤로의 vo변수명을 맨앞글자만 소문자로 바꾸어서 변수를 만들면,
		//자동으로 모델의 속성으로 등록시켜줌.
		//model.addAttribute("movieVO", movieVO);
	}
	
	@RequestMapping("uploadForm")
	public void uploadForm(
					HttpServletRequest request, 
					MultipartFile file, 
					Model model) throws Exception {
		String savedName = file.getOriginalFilename();
		String uploadPath = request.getSession().getServletContext().getRealPath("resources/upload");
		File target = new File(uploadPath + "/" + savedName);
		file.transferTo(target);
		model.addAttribute("savedName", savedName);
	}
	
	
	@RequestMapping("movie")
	public void movie(MovieVO2 vo, Model model) {
		System.out.println("컨트롤러에서 받은 값>> " + vo);
		//db처리!!
		model.addAttribute("vo", vo);
	}
}
