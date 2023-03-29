<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
<hr color="blue">
<form action="update" method="get">
	id : <input name="id" value="apple"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="blue">

<h3>회원삭제 화면입니다. </h3>
<hr color="lime">
<form action="delete" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="limb">

<h3>회원 검색 화면입니다. </h3>
<hr color="pink">
<a href="one.multi?id=apple">아이디 apple</a><br>
<a href="one.multi?id=apple22">아이디 apple22</a><br>
<form action="one" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="pink">

<button type="button">먹통버튼(아무 기능이 없음)</button>
</body>
</html>