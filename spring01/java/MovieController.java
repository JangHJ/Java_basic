package com.multi.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	@RequestMapping("movie")
	public String comic(String movie) {
		System.out.println("브라우저로부터 전달받은 값은 " + movie);
		
		if(movie.equals("코미디"))
			//view 아래가 아니고. webapp 이래
			return "comic";
		else if(movie.equals("드라마"))
			return "drama";
		else if(movie.equals("액션"))
			return "action";
		else
			return "redirect:movie.jsp";
	}
}
