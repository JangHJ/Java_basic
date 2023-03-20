package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String today = request.getParameter("today");

		out.println("오늘 날씨는 " + today);
		
		String result = "그냥 있자";
		if (today.equals("맑음")) {
			result = "나가자";
		} else if (today.equals("흐림")) {
			result = "코딩";
		} else if (today.equals("비옴")) {
			result = "쇼핑";
		}
		out.print(result);
		out.close();
//		switch(today)
//		{
//		case "맑음":
//			out.print("나가자");
//			break;
//		case "흐림":
//			out.print("코딩");
//			break;
//		case "비옴":
//			out.print("쇼핑");
//			break;
//		default:
//			out.print("그냥 있자");
//			break;
//		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String pass = request.getParameter("pass");
		if(pass.equals("나는 왕이다"))
			out.print("들어오세요<img src='yes.png' width=200 height=200>");
			
		else 
			out.print("들어올 수 없습니다.<img src='no.png' width=200 height=200>");
	}

}
