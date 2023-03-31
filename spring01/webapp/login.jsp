<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("id") == null){ %>
<h3>로그인 화면입니다. </h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>

<%} else {%> <!-- 세션이 있다면 -->
<hr color="red">
${id}님이 로그인 중입니다.<br>
<a href="bbs.jsp">
	<button style="background: pink" >게시판 화면으로 go</button>
</a><br>
<a href="news.jsp">
	<button style="background: lime" >뉴스 사이트로</button>
</a><br>
<a href="cafe.jsp">
	<button style="background: lightblue" >카페 사이트로</button>
</a><br>
<%} %>
</body>
</html>