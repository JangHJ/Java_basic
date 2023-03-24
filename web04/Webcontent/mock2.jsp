<%@page import="multi.Mock2DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bag" class="multi.Mock2VO"></jsp:useBean>
<jsp:setProperty property="*" name="bag"/>
<%
	Mock2DAO dao2 = new Mock2DAO();
	dao2.insert(bag);
%>