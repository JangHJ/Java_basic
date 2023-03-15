<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
	String no = request.getParameter("no"); 
	String title = request.getParameter("title"); 
	String content = request.getParameter("content"); 
	String writer = request.getParameter("writer"); 
	
	
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
no : <%= no %><br>
title : <%= title %><br>
content : <%= content %><br>
writer : <%= writer %><br>
</body>
</html>