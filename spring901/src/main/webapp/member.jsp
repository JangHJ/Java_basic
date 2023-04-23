<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>검색 화면입니다. </h3>
<a href="list">모든 회원정보 가지고 오기</a>

<hr color="red">
<!-- one?id=1 -->
<form action="one" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>로그인 화면입니다. </h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원가입 화면입니다. </h3>
<hr color="red">
<form action="insert" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	name : <input name="name" value="park"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원수정 화면입니다. </h3>
<hr color="red">
<form action="update" method="get">
	id : <input name="id" value="apple"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원탈퇴 화면입니다. </h3>
<hr color="red">
<form action="delete" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원검색 화면입니다. </h3>
<hr color="red">
<form action="one" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
<a href="list">모든 회원 정보 가지고 오기</a>
<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>