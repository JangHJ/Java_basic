<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
공연시설 상세 목록!!
<!-- 속성으로 지정한 값은 EL로 프린트 -->
<hr color="red">
${vo.name};
${vo.cnt};
${vo.chartr};
${vo.opende};
${vo.seatscale};
${vo.telno};
${vo.relateurl};
${vo.adres};
${vo.la};
${vo.lo};
</body>
</html>