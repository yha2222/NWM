<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<title></title>
</head>
<body>
	<h4>에러 발생@!!</h4>
	<h5>exception 내장 객체 변수</h5>
	<%
		exception.printStackTrace(new PrintWriter(out));
	%>
</body>
</html>