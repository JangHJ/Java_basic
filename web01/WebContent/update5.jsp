<%@page import="multi.GradeVO"%>
<%@page import="multi.GradeDAO"%>
<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String id = request.getParameter("id");
	String subject = request.getParameter("subject");
	
	GradeVO bag = new GradeVO();
	bag.setId(Integer.parseInt(id));
	bag.setSubject(subject);
	
	GradeDAO dao = new GradeDAO();
    dao.update(bag);
    %>
    <!-- 3. 브라우저에게 결과를 알려주기 위한 html코드가 미리 들어가 있음. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
	background: pink;
}
</style>
</head>
<body>
<a href="update5.html">
	<button id="b1">전 페이지로</button>
</a>
게시글 수정되었음.
<hr color="red">
당신이 수정을 원하는 아이디는 <%= id %><br>
당신이 수정을 원하는 과목이름은 <%= subject %><br>
</body>
</html>