<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="resources/js/sockjs-0.3.4.js"></script>
<script type="text/javascript" src="resources/js/stomp.js"></script>
<script type="text/javascript" src="resources/js/webSocketSendToUserApp.js"></script>
<script type="text/javascript">
	var stompClient = null;
	
	function setConnected(connected) { //연결 여부에 따라 설정 
		//document.getElementById('connect').disabled = connected;
		//document.getElementById('disconnect').disabled = !connected;
		document.getElementById('conversationDiv').style.visibility = connected ? 'visible'
				: 'hidden';
		//$('#response').html('')와 동일한 코드 
		document.getElementById('response').innerHTML = '';
	}
	
	function connect() {
		//1. 소켓객체 생성
		var socket = new SockJS('${pageContext.request.contextPath}/chat2')
		//2. 데이터를 전송하고, 받을 수 있는 stompClent객체 생성
		stompClient = Stomp.over(socket);
		
		//3. 채팅방 지정하여 가입하자.
		stompClient.connect({}, function(frame) {
			setConnected(true) //css설정 
			alert('연결됨. '+ frame)
			stompClient.subscribe('/topic/messages2', function(messageOutput) {
				//서버에서 받은 메시지 출력 
				showMessageOutput(JSON.parse(messageOutput.body));
			})
		})
		//4. 서버에서 보냈을 때 어떻게 처리할지 지정 
	}
	
	//서버로 메세지 보냄 
	function sendMessage() {
		//입력한 정보를 가지고 와서 
		var from = "guest";
		var text = document.getElementById('text').value;
		//url을 /app/cht을 호출하고,data를 json형태의 sring으로 만들어서 보내라. 
		stompClient.send("/app/chat2", {}, JSON.stringify({
			'from' : from,
			'text' : text
		}));
	}
	
	//받은 데이터를 원하는 위치에 넣음. ==> 받은 데이터를 채팅목록으로 쌓는다. 
	function showMessageOutput(messageOutput) {
		//<p id="response">
		//	<p> 홍길동: 잘지내지?(13:00)</p>
		//</p>
		var response = document.getElementById('response');
		var p = document.createElement('p');
		p.style.wordWrap = 'break-word';
		p.appendChild(document.createTextNode(messageOutput.menu));
		response.appendChild(p);
	}
	
	//서버로 연결 끊음. 
	function disconnect() {
		if (stompClient != null) {
			stompClient.disconnect();
		}
		setConnected(false); //연결끊어졌을 때 설정 변경 
		console.log("Disconnected");
	}
	
</script>
</head>
<body onload="connect();">
	<br>
	<br>
	<img src=resources/img/chat1.png width=100 height=100><img src=resources/img/chat3.png width=400 height=100>
	<div class="alert alert-danger" style="width: 500px;">
		<div>챗 봇>> 1)상품소개  2)주문확인</div>
		<br>
		<div id="response">
		
		</div>
		<div class="form-floating mb-3 mt-3" id="conversationDiv">
		<table>
		<tr>
			<td><input type="text" class="form-control" id="text" style="width: 400px; background: yellow"></td>
			<td><button id="sendMessage" onclick="sendMessage();"class="btn btn-primary">Send</button></td>
		</tr>
		</table>
		</div>
	</div>
</body>
</html>