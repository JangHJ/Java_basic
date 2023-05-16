<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.1.js"></script>
<script type="text/javascript">
	$(function() {
		//alert('test...')
		$.ajax({
			url : "bbsList", //views/bbsList.jsp가 결과!
			success : function(result) { //결과가 담겨진 table부분코드
				$('#d1').html(result)
			},
			error : function() {
				alert('실패.@@@')
			}
		})
	})
</script>
<style>
td {
	background: white;
	height: 30px;
}
</style>
</head>
<body>
	<h3>게시물 목록</h3>
	<hr color="red">
	<div id="d1"></div>
</body>
</html>