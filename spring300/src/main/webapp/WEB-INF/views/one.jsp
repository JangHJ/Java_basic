<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	background: yellow;
}
</style>
</head>
<body>
<!-- 표현식(expression) -->
<h3>회원 ${bag.id}을 검색했습니다.</H3>
<!-- bag.getId() -->
검색된 회원 id : ${bag.id}<br> <!-- 출력용 expression language-EL -->
검색된 회원 pw : ${bag.pw}<br>
검색된 회원 name : ${bag.name}<br>
검색된 회원 tel : ${bag.tel}<br>
</body>
</html>