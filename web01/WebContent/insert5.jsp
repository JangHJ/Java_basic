<%@page import="multi.GradeDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.GradeVO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <%	
	//dao에게 가방 전달하기
	GradeDAO dao = new GradeDAO();
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
<a href="insert5.html">
	<button id="b1">전 페이지로</button>
</a>
성적 등록되었음.
<hr color="red">
<!-- img src=img/shoes1.jpg -->
성적이 정상적으로 등록 되었습니다!<br>
<hr color="red">
 <table class="table table-striped table-hover">
 	<tr>
 		<td>성적 id</td>
 		<td><%= bag.getId() %></td>
 	</tr>
 	<tr>
 		<td>subject</td>
 		<td><%= bag.getSubject() %></td>
 	</tr>
 	<tr>
 		<td>score</td>
 		<td><%= bag.getScore() %></td>
 	</tr>
 	<tr>
 		<td>name</td>
 		<td><%= bag.getName() %></td>
 	</tr>
 	<tr>
 		<td>img</td>
 		<td><img src="subject/<%= bag.getImg() %>" width=100 height=100 	></td>
 	</tr>
 </table>
</body>
</html>