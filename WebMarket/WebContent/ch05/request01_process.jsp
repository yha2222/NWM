<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Implicit Objects</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("id");
	String password = request.getParameter("passwd");
	
	if(userid.equals("관리자") && password.equals("1234")){
		response.sendRedirect("request01_success.jsp");
	}
%>
</body>
</html>