<%@page import="multi.MovieDAO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.MovieVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <%
    /*
	String id = request.getParameter("id"); 
	String name = request.getParameter("name"); 
	String content = request.getParameter("content"); 
	String price = request.getParameter("price"); 
	String company = request.getParameter("company"); 
	String img = request.getParameter("img"); 
	
	//ProductVO bag = new ProductVO();
	bag.setId(id);
	bag.setName(name);
	bag.setContent(content);
	bag.setPrice(Integer.parseInt(price));
	bag.setCompany(company);
	bag.setImg(img);
	*/
	
	//dao에게 가방 전달하기
	MovieDAO dao = new MovieDAO();
	dao.insert(bag);
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음. -->
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
<a href="insert4.html">
	<button id="b1">전 페이지로</button>
</a>
영화 등록되었음.
<hr color="red">
<!-- img src=img/shoes1.jpg -->
영화가 정상적으로 등록 되었습니다!<br>
id : <%= bag.getId() %><br>
title : <%= bag.getTitle() %><br>
content : <%= bag.getContent() %><br>
location : <%= bag.getLocation() %><br>
director : <%= bag.getDirector() %><br>
</body>
</html>