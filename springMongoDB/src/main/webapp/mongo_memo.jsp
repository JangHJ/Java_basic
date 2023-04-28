<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<script>
    $(function() {
        //사이트 시작하자마자 목록을 가지고 와서, #result에 넣어줌.
        $.ajax({
            url : "list.memo",
            success : function(result) { 
                $("#result").html(result);
            }
        });//list
        
        $('#push').click(function() {
            $.ajax({
                url : "insert.memo",
                data : {
                    name : $('#name').val(),
                    content : $('#content').val(),
                    weather: $('#weather').val()
                },
                success : function() { 
                    // insert성공하면, 아래쪽에 list요청한 결과를 
                    //가지고 와서 result에 넣자.
                    $.ajax({
                        url : "list.memo",
                        success : function(result) { 
                            $("#result").html(result);
                        }
                    });//list
                    $('#name').val('')
                    $('#content').val('')
                    $('#weather').val('')
                }//success
            });//insert
        })
        
    }); //$
</script>
</head>
<body>
    <h2 style="background: orange; color: red; width: 800px; height: 50px;">멀티 메모장!! 자유롭게 아무말이나~~!!</h2>
    이름 : <input id="name" value="win"> 
    메모 : <input id="content" size="30" value="win">
    날씨 : <input id="weather" value="win"> 
    <button id="push">등록</button>
    
    <div id="result" style="background: yellow; width:800px; height: 300px;"></div>
</body>
</html>