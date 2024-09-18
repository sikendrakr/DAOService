<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration</title>
</head>
<body>
<h2>Create Registration</h2>
<form action="register" method="post">
Name : <input type="text" name="FullName"/> <br><br>
Email : <input type="email" name="Email_ID"/><br><br>
Phone : <input type="number" name="Phone"/> <br><br>
<input type="submit" value="Register"/> <br><br>
</form>
</body>
</html>