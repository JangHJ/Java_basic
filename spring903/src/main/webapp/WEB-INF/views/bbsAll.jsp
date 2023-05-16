<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h3>전체 bbs 글 count: ${count}</h3>
<hr color="red">
<%
	int pages = (int)request.getAttribute("pages");
	for(int p = 1; p <= pages; p++){
%>
	<a href=bbsAll?page=<%= p %>>
		<button style="background: lime; color: red; width: 50px;"><%= p %></button>
	</a>  
<%		
	}
%>
<hr color="red">
 <table>
   <tr>
      <td class="left">bbs_no</td>
      <td class="left">번호</td>
      <td class="left">제목</td>
      <td class="left">내용</td>
      <td class="left">작성자</td>
   </tr>
   <c:forEach items="${list}" var="one">
   <tr>
      <td class="right">${one.bbs_no}</td> 
      <td class="right">${one.id}</td> <!-- one.getId() -->
      <td class="right"><a href="bbsOne?id=${one.id}">${one.title}</a></td>
      <td class="right">${one.content}</td>     
      <td class="right">${one.writer}</td>
   </tr>
   </c:forEach>
</table>