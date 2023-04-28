<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="../../header.jsp" %>
 <table border="1" width="800px">
  <tr>
    <th>번호</th>
    <th>작성자</th>
    <th>내용</th>
    <th>날씨</th>
    <th>날짜</th>
  </tr>
<c:forEach var="vo" items="${list}" varStatus="status"> 
  <tr background="lime">
    <td>${status.count}</td> 
     
    <td>${vo.name}</td>
     
    <td width=150>
      <a href="one.memo?_id=${vo._id}">${vo.content}</a>
    </td>
    <td>
      ${vo.weather}
    </td>
    <td>
    <fmt:formatDate value="${vo.date}" 
        pattern="yyyy-MM-dd HH:mm:ss" /></td>
  </tr>
</c:forEach>   
</table>