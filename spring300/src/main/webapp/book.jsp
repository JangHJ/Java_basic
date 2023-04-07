<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>데이터를 입력하세요 </h3>
<form action="insert3" method="get">
	이름 : <input name="name" value="네이버" ><br>
	주소 : <input name="url" value="http://www.naver.com"><br>
	이미지 : <input name="img" value="resources/img/코믹.jpg"><br>
	<button type="submit" >서버로 전송</button>
</form>
<hr color="red">

<h3>수정 화면입니다. </h3>
<form action="update3" method="get">
	id : <input name="id" ><br>
	name : <input name="name" value="오늘은~"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>삭제 화면입니다.</h3>
<form action="delete3" method="get">
	id : <input name="id" ><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>북마크 검색</h3>
<form action="one3" method="get">
	id : <input name="id" value=6><br>
	<button onclick="alert('one3이 요청됨!');" type="submit">검색</button>
</form>
<hr color="red">

<a href="all3"><h3>북마크 전체 목록 가지고 오기</h3></a><br>
</body>
</html>