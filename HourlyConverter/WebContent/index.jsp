<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hourly Converter</title>
</head>
<body>
	<h1>Hourly Pay to Salary Converter</h1>
	
	<form action="getHourlyServlet" method="post">
		Enter your hourly pay:
		<input type="text" name="userHourly" size="10">
		<br/>
		Enter your hours worked per week: 
		<input type="text" name="userHours" size="10">
		<br/>
		Optional: enter your state's tax in decimal form:
		<input type="text" name="userTax" size="10">
		(i.e. MN income tax rate 5.35% = 0.0535)
		<input type="submit" value="Calculate Salary" />
	</form>
</body>
</html>