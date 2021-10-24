<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="model.*, java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eCommerce test web|Cart</title>
<link rel="stylesheet" href="css/Assignment.css">
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>

<% 
	Cart c = (Cart) session.getAttribute("cart");
	List<Product> productList = c.getItems();
	int size = productList.size();
	pageContext.setAttribute("productList", productList);
%>
	<c:import url="header.jsp"/>
	<div class="row justify-content-center p-3 md-2">
	<table class="table table-light carttable">
        <tr>
            <th>Products in cart:<%=size%></th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Amount</th>
            <th></th>
        </tr>
		<c:forEach var="product" items="${productList}">
            <tr>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>1</td>
                <td>${product.price}</td>
                <td><a href="/PRJ321x_-_Assignment_3/AddToCartController?id=${product.id}&action=delete">Remove</a></td>
            </tr>
		</c:forEach>
		<tr><td colspan="5"><c:out value = "${sessionScope.cart.amount}"/></td></tr>      
	</table>
	<form class="payform" name ="payform" action="PayController" onsubmit="return validate()" method="post">
				<label class="col-3" for="name">Customer name</label>
				<input class="col-6" type="text" id="name" name="name"><br>
				<label class="col-3" for="address">Customer address</label>
				<input class="col-6" type="text" id="address" name="address"><br>
				<label class="col-3" for="discount">Discount code(if any):</label>
				<input class="col-6" type="text" id="discount" name="discount"><br>
				<input class="greenbutton" type="submit" value="Submit">
				<div class="error">
				<% 
					String error = (String) session.getAttribute("error");
				    if(error != null)
				    {
				        out.println(error);
				    }
				%>
				</div>

			</form>
	</div>
	<c:import url="footer.jsp"/>
</body>
</html>