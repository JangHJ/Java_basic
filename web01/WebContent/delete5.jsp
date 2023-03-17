<%@page import="multi.GradeDAO"%>
<%@page import="multi.GradeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	//클라이언트가 입력한 No를 서버에서 받아주기(자바로!)
    	// Car car = new Car();
    	//HttpServletRequest request = new HttpServletRequest(); 
    	//car.run();
    	String id = request.getParameter("id"); //String, "100" 
    	//JSP안에 만들어진 변수는 서버의 RAM에 저장되는 지역변수!
    	GradeDAO dao = new GradeDAO();
    	dao.delete(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: pink;
}
</style>
</head>
<body>
<a href="delete5.html">
	<button id="b1">전 페이지로</button>
</a>
당신이 삭제를 원하는 id는 <%= id %>
</body>
</html>