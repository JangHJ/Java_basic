package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Monday
 */
//@WebServlet("/monday2.do")
public class Monday extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		String temp = config.getInitParameter("temp");
		System.out.println(temp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		out.print("오늘은 월요일이야");
//		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter out = response.getWriter();
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		out.print("post요청을 받음>> " + id + ", " + pw);
	}

}
