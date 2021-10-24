<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>eCommerce test web|Login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/Assignment.css">
</head>
<body class="login">
	<div class="loginpage">
		<div class="loginpageleft">
			<h2>Sign in</h2>
			<form class="loginform" name ="loginform" action="LoginController" onsubmit="return validate()" method="post">
			  	<% 
				  	Cookie[] cookies = request.getCookies(); 
				  	String value="";
				  	if (cookies != null) { 
						for (Cookie retrievedCookies: cookies){
							if (retrievedCookies.getName().equals("username")){
								value = retrievedCookies.getValue();
							}
						}
				  	}
					if (value ==""){
				%>
				<input type="text" id="username" name="username" placeholder="username"><br><br>
				<%} else {%>
				<input type="text" id="username" name="username" value=<%=value%>><br><br>
				<%} %>
				<input type="password" id="password" name="password" placeholder="password"><br><br>
				<a class="forgotpassword" href="/PRJ321x_-_Assignment_2/URLController?action=forgotpassword">Forgot password?</a>
				<div class="bottomlogin">
					<input type="checkbox" id="remember" name="remember" value="on">
					<label for="remember"> Remember me</label>
				</div>
				<input class="greenbutton" type="submit" value="LOGIN">
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
		<div class="loginpageright">
			<div class="loginrighttext">
				<h2>Welcome Back!</h2>
				<p>To keep connected with us please login with your personal info</p>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/validator.js"></script>
</body>
</html>