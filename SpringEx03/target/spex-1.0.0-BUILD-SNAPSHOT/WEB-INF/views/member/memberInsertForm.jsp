<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Member</title>
</head>
<body>
	<div align="center">
		<div><h2>회원 등록 화면</h2></div>
	</div>
	<div align="center">
		<form id="frm" name="frm" action="memberInsert.do" method="post">
		<div>
			<table border="1">
				<tr>
					<th width="100">회원 아이디</th>
					<td width="200">
						<input type="text" id="memberId" name="memberId">
					</td>
				</tr>
				<tr>
					<th width="100">회원 이름</th>
					<td width="200">
						<input type="text" id="memberName" name="memberName">
					</td>
				</tr>
				<tr>
					<th width="100">비밀번호</th>
					<td width="200">
						<input type="password" id="password" name="password">
					</td>
				</tr>
				<tr>
					<th width="100">회원 권한</th>
					<td width="200">
						<input type="text" id="memberAuth" name="memberAuth">
					</td>
				</tr>
			</table>
			<br/>
			<input type="submit" value="회원가입"> &nbsp;&nbsp;&nbsp;
			<input type="reset" value="취 소">
		</div>
		</form>
	</div>

</body>
</html>