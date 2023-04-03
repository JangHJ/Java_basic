<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body{
	background: lightblue;
}
h3 {
	border-left: 6px solid blue;
	background-color: white;
}
hr{
	color: black;
	background-color: black;
	border-top: 1px dashed #bbb
}
</style>
<body>
현재 게시물 조회수 : ${count}
<% if(session.getAttribute("id") != null){ %>
<h3>게시글 등록</h3>
<form action="insert2.multi" method="get">
	no : <input name="no" value=6><br>
	title : <input name="title" value="good"><br>
	content : <input name="content" value="good day"><br>
	writer : <input name="writer" value=${id}><br>
	<button onclick="alert('insert2가 요청됨!');" type="submit">등록하기</button>
</form>
<hr>

<h3>게시글 수정</h3>
<form action="update2.multi" method="get">
	no : <input name="no" value=6><br>
	content : <input name="content" value="good day6666"><br>
	<button onclick="alert('update2가 요청됨!');" type="submit">수정하기</button>
</form>
<hr>

<h3>게시글 삭제</h3>
<form action="delete2.multi" method="get">
	no : <input name="no" value=6><br>
	<button onclick="alert('delete2가 요청됨!');" type="submit">삭제하기</button>
</form>
<hr>
<%}else { %>
<a href="login.jsp">
	<button style="background: pink" >로그인 화면으로 go</button>
</a><br>
<%} %>
<h3>게시글 검색</h3>
<form action="one2.multi" method="get">
	no : <input name="no" value=6><br>
	<button onclick="alert('one2가 요청됨!');" type="submit">검색</button>
</form>
<hr>

<h3>게시글 전체검색</h3>
<form action="list2.multi" method="get">
	<button onclick="alert('list2가 요청됨!');" type="submit">전체 검색</button>
</form>
<hr>
</body>
</html>