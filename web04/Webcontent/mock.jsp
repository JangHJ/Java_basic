<%@page import="multi.MockDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.MockVO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
	MockDAO dao = new MockDAO();
	dao.insert(bag);
%>