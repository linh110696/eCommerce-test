<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/Assignment.css">
</head>
<body class="loggedinpage">
	<div class="welcome" id="disappear">
		<p>Welcome <%= session.getAttribute("user") %></p>
	</div>
	<div class = info>
		<form name ="logoutform" action="../LogoutController" method="post">
			<span><%= session.getAttribute("user") %></span>
			<input class="greenbutton" type="submit" value="Logout">
		</form>
	</div>
	<div class="loggedinleft">
		<h2>1849 Team</h2>
		<p>Dashboard</p>
		<p>Staff Manager</p>
	</div>
	<div class="loggedinright">
		<div class="fakeimg" style="height:200px;">Image</div>
		<table>
			<caption>Member of the team</caption>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>StudentID</th>
				<th>Class</th>
			</tr>
			<tr>
				<td>1</td>
				<td>Member 1</td>
				<td>Member Code 1</td>
				<td>Class 1</td>
			</tr>
			<tr>
				<td>2</td>
				<td>Member 2</td>
				<td>Member Code 2</td>
				<td>Class 2</td>
			</tr>
		</table>
	</div>
<script>
	window.onload = function(){
		var hide = document.getElementById('disappear');
		document.onclick = function(e){
			if(e.target.id !== 'disappear'){
				hide.style.display = 'none';
			};
		};
	};
</script>
</body>
</html>