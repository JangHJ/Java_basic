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
		$('#b1').click(function() { //축제정보
			$('#result').empty()
			//var today = new Date();
			//var year = today.getFullYear();
			//var month = today.getMonth() + 1;
			//var date = today.getDate();
			//console.log(year + '-' + month + '-' + date);
			$.ajax({
				  url: 'https://www.kopis.or.kr/openApi/restful/prfawad?service=55f2e69c1e6146dab5fe824a31328f70',
				  type: 'GET',
				  dataType: 'json',
				  success: function(data) {
				    // API 호출이 성공한 경우 실행되는 함수
				    console.log(data); // 가져온 데이터를 콘솔에 출력해봅니다.
				    // 가져온 데이터를 화면에 출력하거나 다른 처리를 할 수 있습니다.
				  },
				  error: function(xhr, status, error) {
				    // API 호출이 실패한 경우 실행되는 함수
				    console.error(error); // 에러 메시지를 콘솔에 출력합니다.
				  }
				});
		})//b1
	})//fun
</script>
</head>
<body>
	hello
	<button id="b1">축제목록 db에 넣어주기</button><br>
	<div id="result"></div>
</body>
</html>