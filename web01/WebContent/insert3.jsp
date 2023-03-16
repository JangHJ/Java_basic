<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="multi.ProductVO"></jsp:useBean>
    <!--<jsp:setProperty property="*" name="bag"/> -->
    <%
    /*
	String id = request.getParameter("id"); 
	String name = request.getParameter("name"); 
	String content = request.getParameter("content"); 
	String price = request.getParameter("price"); 
	String company = request.getParameter("company"); 
	String img = request.getParameter("img"); 
	
	//ProductVO bag = new ProductVO();
	bag.setId(id);
	bag.setName(name);
	bag.setContent(content);
	bag.setPrice(Integer.parseInt(price));
	bag.setCompany(company);
	bag.setImg(img);
	*/
	
	//dao에게 가방 전달하기
	ProductDAO dao = new ProductDAO();
	dao.insert(bag);
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
<a href="insert3.html">
	<button id="b1">전 페이지로</button>
</a>
상품 등록되었음.
<hr color="red">
<!-- img src=img/shoes1.jpg -->
<img src="img/<%= bag.getImg() %>" width=200 height=200><br>
상품이 정상적으로 등록 되었습니다!
id : <%= bag.getId() %><br>
name : <%= bag.getName() %><br>
content : <%= bag.getContent() %><br>
price : <%= bag.getPrice() %><br>
company : <%= bag.getCompany() %><br>
img : <%= bag.getImg() %><br>
</body>
</html>