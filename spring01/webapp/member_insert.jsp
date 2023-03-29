<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
$(function() {
	//document.write("body를 다~~ 읽었다..")
	alert("body를 다~~ 읽었다..")
})
</script>
</head>
<body>
회원가입 화면입니다.
<hr color="red">
<form action="insert" method="get"> <!-- post인 경우만 씀 default:get -->
아이디 : <input name="id" value="apple"><br>
패스워드 : <input name="pw" value="1234"><br>
이름 : <input name="name" value="park"><br>
전화번호 : <input name="tel" value="011"><br>
<button type="submit">서버로 전송</button>
</form>
<button type="button">먹통버튼(기능이 없음)</button>

</body>
</html>