<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인</h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원가입</h3>
<hr color="red">
<form action="insert" method="get">
	id : <input name="id" value="apple"><br>
	pw : <input name="pw" value="1234"><br>
	name : <input name="name" value="park"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원수정</h3>
<hr color="blue">
<form action="update" method="get">
	id : <input name="id" value="apple"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="blue">

<h3>회원삭제</h3>
<hr color="lime">
<form action="delete" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="limb">

<h3>회원 검색</h3>
<hr color="pink">
<a href="one.multi?id=apple">아이디 apple</a><br>
<a href="one.multi?id=apple22">아이디 apple22</a><br>
<form action="one" method="get">
	id : <input name="id" value="apple"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="pink">

<h3>회원 전체 검색</h3>
<hr color="magenta">
<form action="list.multi" method="get">
<button type="submit">전체 검색</button>
</form>
<hr color="magenta">

</body>
</html>