<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Registration</title>
</head>
<body>
	<h2>Update Registration</h2>
	<form action="updateReg" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="Email_ID"></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><input type="tel" name="Phone"></td>
			</tr>

			<tr>
				<td><input type="submit"></td>
			</tr>

		</table>
	</form>
</body>
</html>