<%@page import="com.multi.mvc200.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table>
	<tr>
		<td class="top">no</td>
		<td class="top">title</td>
		<td class="top">content</td>
		<td class="top">writer</td>
	</tr>
	<tr>
		<td class="down">${bag.no}</td>
		<td class="down">${bag.title}</td>
		<td class="down">${bag.content}</td>
		<td class="down">${bag.writer}</td>
	</tr>
	<tr>
		<td colspan="4">댓글목록</td>
	</tr>
	<c:forEach items="${list}" var="list">
		<tr>
			<td class="down">${list.no}</td>
			<td class="down">${list.bbsno}</td>
			<td class="down">${list.content}</td>
			<td class="down">${list.writer}</td>
		</tr>
	</c:forEach>
</table>