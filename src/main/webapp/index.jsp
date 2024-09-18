<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<h2>Login Here!</h2>
	<form action="verifyLogin" method="post">
		Enter Email: <input type="email" name="email" /> 
		Enter Password: <input type="password" name="password" /> <br><br>
		
			<input type="submit" value="login">
	</form>
	<br>
	<%
	if(request.getAttribute("error") != null){
		out.println(request.getAttribute("error"));
	}
	%>
</body>
</html>