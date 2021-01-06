<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<div><h2>글 쓰 기</h2></div>
	<div>
		<form id="frm" name="frm" action="borderinput" method="post">
			<table border="1">
				<tr>
					<th width="50">순번</th>
					<td width="200">
						<input type="text" id="borderId" name="borderId">
					</td>
				</tr>
				<tr>
					<th width="50">작성자</th>
					<td width="200">
						<input type="text" id="borderWriter" name="borderWriter">
					</td>
				</tr>
				<tr>
					<th width="50">제목</th>
					<td width="200">
						<input type="text" id="borderTitle" name="borderTitle">
					</td>
				</tr>
				<tr>
					<th width="50">내용</th>
					<td width="200">
						<textarea id="borderContent" name="borderContent" rows="5" cols="20"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="저장">
				</tr>
			</table>
		</form>
	</div>
</div>
</body>
</html>