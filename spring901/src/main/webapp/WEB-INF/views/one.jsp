<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
회원검색이 요청됨!!
<!-- 속성으로 지정한 값은 EL로 프린트 -->
<hr color="red">
${vo.id};
${vo.pw};
${vo.name};
${vo.tel};
</body>
</html>