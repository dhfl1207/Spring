<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/empForm.jsp</title>
</head>
<body>
<h3>사원등록</h3>
<form:form modelAttribute="empVo"> 
	EMPLOYEE_ID<form:input path="employee_id" /> <br>
	FIRST_NAME<form:input path="first_name" /> <br>
	LAST_NAME<form:input path="last_name" /> <br>
	HIRE_DATE<form:input path="hire_date" /> <br>
	EMAIL<form:input path="email" /> <br>
	JOB_ID<form:radiobuttons path="job_id" 
		items = "${jobList}" 
		itmeLabel="job_title" 
		itemValue="job_id"/> <br>
	DEPARTMENT_ID<form:select path="department_id" 
		items="${deptList}" 
		itemLabel="department_name"
		itemValue="department_id"/> <br>
	
	<form:button>등록</form:button>

</form:form>
</body>
</html>