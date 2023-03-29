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
	background: lightgray;
}
</style>
<body>
<h3>게시글 등록 화면입니다. </h3>
<hr color="orange">
<form action="insert2.multi" method="get">
	no : <input name="no" value="1"><br>
	title : <input name="title" value="good"><br>
	content : <input name="content" value="good day"><br>
	writer : <input name="writer" value="apple"><br>
	<button onclick="alert('insert2가 요청됨!');" type="submit">서버로 전송</button>
</form>
<hr color="orange">

<h3>게시글 내용수정 화면입니다. </h3>
<hr color="blue">
<form action="update2.multi" method="get">
	no : <input name="no" value=111><br>
	content : <input name="content" value="good day"><br>
	<button onclick="alert('update2가 요청됨!');" type="submit">서버로 전송</button>
</form>
<hr color="blue">

<h3>게시글 삭제 화면입니다. </h3>
<hr color="lime">
<form action="delete2.multi" method="get">
	no : <input name="no" value=111><br>
	<button onclick="alert('delete2가 요청됨!');" type="submit">서버로 전송</button>
</form>
<hr color="lime">

<h3>게시글 검색(한개) 화면입니다. </h3>
<hr color="pink">
<form action="one2.multi" method="get">
	no : <input name="no" value=111><br>
	<button onclick="alert('one2가 요청됨!');" type="submit">서버로 전송</button>
</form>
<hr color="pink">

</body>
</html>