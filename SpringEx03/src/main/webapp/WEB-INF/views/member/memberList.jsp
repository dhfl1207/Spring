<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member List</title>
</head>
<body>
	<div align="center">
		<h2>회원목록</h2>
		<c:forEach var = "member" items="${members }">
			${member.memberId } &nbsp;&nbsp;&nbsp;
			${member.memberName } &nbsp;&nbsp;&nbsp;
			${member.password } &nbsp;&nbsp;&nbsp;
			${member.memberAuth } &nbsp;&nbsp;&nbsp;
			${member.memberPoint } &nbsp;&nbsp;&nbsp; 
			<input type="button" value="수정" onclick="location.href='memberUpdateForm.do?memberId=${member.memberId}'">
			<input type="button" value="삭제" onclick="location.href='memberDelete.do?memberId=${member.memberId}'">
			<br/>
		</c:forEach>
		<br/>
		<h3><a href="memberInsertForm.do">회원가입</a></h3>
	</div>

</body>
</html>