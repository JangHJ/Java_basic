<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() { //body부분이 dom tree로 메모리에 준비가 되었을 때
		//입력값으로 넣은 함수를 실행해주세요.
		$('#b1').click(function(){
			//datas = $('form').serialize();
			$.ajax({
				url: "computer",
				data: {
					com: $('#com').val(),
					price: $('#price').val(),
					mouse: $('#mouse').val(),
					price2: $('#price2').val() 
				},
				success: function(x) {
					alert('computer요청 성공!')
					alert(x)
					$('#result').append(x + "<br>")
				},
				error: function() {
					alert('computer요청 실패!')
				}
			})//ajax
		})//b1
	})//fun
</script>
</head>
<body>
<form>
컴퓨터 종류  : <input id="com" value="맥"><br>
컴퓨터 가격  : <input id="price" value=2000000><br>
마우스 종류  : <input id="mouse" value="로지텍"><br>
마우스 종류  : <input id="price2" value=15000><br>
<input id="b1" type="button" value="컴퓨터 구매 항목 확인"><br>
</form>
<hr color="red">
<div id="result"></div>
</body>
</html>