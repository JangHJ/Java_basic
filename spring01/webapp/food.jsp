<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>음식 선택화면입니다.  </h3>
<hr color="red">
<form action="food" method="get">
	좋아하는 음식 : <input name="like" value="라면"><br>
	싫어하는 음식 : <input name="dislike" value="커피"><br>
	<button type="submit">음식 결과 전송</button>
</form>
</body>
</html>