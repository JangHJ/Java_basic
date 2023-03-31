<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h2>'길복순' 전도연이 선보이는 킬러의 세계</h2>
기사입력 2023.03.31 오후 1:46 <a href="https://entertain.naver.com/read?oid=144&aid=0000877141"><button>기사원문</button></a><br>
<img src="resources/img/news.jpg" width=500 align="center")><br>
<% if ( session.getAttribute("id") != null ){%>
<form action="aaa">
	<div id="result"></div>
	댓글 : <input name="reply"><button>댓글달기</button>
<%}else{ %>
	로그인이 필요합니다. <a href="login.jsp"><button>로그인페이지로</button></a>
<%} %>
</form>
</body>
</html>