<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="/css/bootstrap.min.css" />
<!DOCTYPE html>
<html>
<head>
<title>상품 목록</title>
</head>
<body>
<%
	ProductRepository productDAO = ProductRepository.getInstance();
%>
<c:set var="listOfProducts" value="<%=productDAO.getAllProducts() %>" />
	<%@ include file="menu.jsp" %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<c:forEach var="productVO" items="${listOfProducts}"
				 varStatus="stat">
				 <div class="col-md-4">
				 	<h3>${productVO.pname}</h3>
				 	<p>${productVO.description}</p>
				 	<p>${productVO.unitPrice}원</p>
				 </div>
			</c:forEach>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>