<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
body {
	background: lightblue;
}

h2 {
	border-left: 6px solid black;
	background-color: white;
}
button {
	border: none;
	margin: 5px 5px;
	background-color: #008CBA;
	color: white;
	font-size: 15px;
	border-radius: 6px;
	text-align: center;
} /* Blue */
a:link {
  text-decoration: none;
}
</style>
<body>
	<hr color="orange">
	<h2>북마크 등록</h2>
	<form action="insert3.multi" method="get">
		<table>
			<tr>
				<td>name</td>
				<td><input name="name" value="kg"></td>
			</tr>
			<tr>
				<td>url</td>
				<td><input name="url" value="http://www.kgitbank.com"></td>
			</tr>
			<tr>
				<td>img</td>
				<td><input name="img" value="kg.png"></td>
			</tr>
		</table>
		<button onclick="alert('insert3이 요청됨!');" type="submit">서버로
			전송</button>
	</form>
	<hr color="orange">
	<hr color="blue">
	<h2>북마크 검색</h2>
	<a href="one3.multi?id=1">1번 북마크</a>
	<a href="one3.multi?id=2">2번 북마크</a>
	<a href="one3.multi?id=3">3번 북마크</a>
	<br>
	<form action="one3.multi" method="get">
		id : <input name="id" value="4"><br>
		<button onclick="alert('one3이 요청됨!');" type="submit">북마크 검색</button>
	</form>
	<hr color="blue">
	<hr color="red">
	<h2>북마크 전체검색</h2>
	<form action="list3.multi" method="get">
		<button onclick="alert('one3이 요청됨!');" type="submit">북마크 전체검색</button>
	</form>
	<hr color="red">
</body>
</html>