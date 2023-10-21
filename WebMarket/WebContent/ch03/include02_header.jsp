<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%!
	int pCount = 0;
	void addCount(){
		pCount++;
	}
%>

<%
	addCount();
%>
<p>You Want It Page <%=pCount %>!</p>