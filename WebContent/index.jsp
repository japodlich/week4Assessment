<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Week 4 Assessment</title>
</head>
<body>
	<h1>Adding numbers</h1>
		<form action="addServlet" method="post">
		Enter the numbers as whole numbers:
		<input type="text" name="num1" size="10">
		<input type="text" name="num2" size="10">
		<input type="submit" value="Add" />
		</form>

<a href="sub.jsp">Subtract two numbers</a>
</body>
</html>