<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>영화 장르 선택화면입니다.  </h3>
<hr color="red">
<form action="movie" method="get">
	영화 장르 : <input name="movie" value="코미디"><br>
	<button type="submit">서버로 전송</button>
</form>
</body>
</html>