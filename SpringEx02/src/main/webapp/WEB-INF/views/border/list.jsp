<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>게시판 목록보기</h2>
	<c:forEach var="vo" items="${borderList }" >
	${vo.borderId } ${vo.borderWriter } ${vo.borderTitle }<br/>
	</c:forEach>
</body>
</html>