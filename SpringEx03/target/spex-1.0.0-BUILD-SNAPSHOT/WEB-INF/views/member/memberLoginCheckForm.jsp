<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>
</head>
<body>
	<div align="center">
		<h2>로그인 화면</h2>
	</div>
	<div align="center">
		<form id="frm" name="frm" action="memberLoginCheck.do" method="post">
		<div>
			<table border="1">
				<tr>
					<th width="100">아 이 디</th>
					<td width="200">
						<input type="text" id="memberId" name="memberId">
					</td>
				</tr>
				<tr>
					<th width="100">패스워드</th>
					<td width="200">
						<input type="password" id="password" name="password">
					</td>
				</tr>
			</table>
			<br/>
			<input type="submit" value="로그인">
		</div>
		</form>
	</div>

</body>
</html>