<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eCommerce test web|Search result</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Assignment.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
</head>
<body>
	<c:import url="header.jsp"/>
 	<div class="row">
        <c:forEach var="product" items="${result}">
        	<div class="col-xl-3 col-lg-4 col-md-6 col-12" onclick="location.href='/PRJ321x_-_Assignment_3/InfomationProductController?id=${product.id}';">
	        	<img class="img-fluid" src="${product.src}" alt="${product.name}">
	        	<p class="p-3 mb-2 text-uppercase text-center">${product.type}</p>
	        	<p class="fw-bold text-center">${product.name}</p>
	        	<p class="fw-bold text-danger text-center">$ ${product.price}</p>
        	</div>
        
        </c:forEach>
	</div>
	<c:import url="footer.jsp"/>
</body>
</html>