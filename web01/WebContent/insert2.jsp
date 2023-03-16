<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVO"%>
<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.BbsVO"></jsp:useBean>
    <%
    /*
	String title = request.getParameter("title"); 
	String content = request.getParameter("content"); 
	String writer = request.getParameter("writer"); 
	
	BbsVO bag = new BbsVO();
	bag.setTitle(title);
	bag.setContent(content);
	bag.setWriter(writer);
	*/
	
	//dao에게 가방 전달하기
	BbsDAO dao = new BbsDAO();
	dao.insert2(bag);
	
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
<a href="insert2.html">
	<button id="b1">전 페이지로</button>
</a>
게시글 작성되었음.
<hr color="red">
title : <%= bag.getTitle() %><br>
content : <%= bag.getContent() %><br>
writer : <%= bag.getWriter() %><br>
</body>
</html>