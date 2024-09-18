<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@include file= "menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registrations</title>
</head>
<body>
	<h2>All Student Registration</h2>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<%
			ResultSet result = (ResultSet) request.getAttribute("result");
			while(result.next()) { %> <!-- ResultSet loop -->
				<tr>
					<td><%= result.getString(1) %></td> <!-- Display Name -->
					<td><%= result.getString(2) %></td> <!-- Display Email -->
					<td><%= result.getString(3) %></td>   <!-- Display Phone -->
					<td><a href="emailReg?Email_ID=<%=result.getString(2) %>">Delete</a></td>
					<td><a href="updateReg?Email_ID=<%= result.getString(2) %>">Update</a></td> <!-- New Update link -->
				</tr>
		<% } %>
	</table>
</body>
</html>
