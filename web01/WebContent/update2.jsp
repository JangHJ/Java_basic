<%@page import="multi.BbsVO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="javax.net.ssl.HttpsURLConnection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String no = request.getParameter("no");
	String content = request.getParameter("content");
	
	BbsVO bag = new BbsVO();
	bag.setNo(Integer.parseInt(no));
	bag.setContent(content);
	
	BbsDAO dao = new BbsDAO();
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
<a href="update2.html">
	<button id="b1">전 페이지로</button>
</a>
게시글 수정되었음.
<hr color="red">
당신이 수정을 원하는 번호는 <%= no %><br>
당신이 수정을 원하는 내용은 <%= content %><br>
</body>
</html>