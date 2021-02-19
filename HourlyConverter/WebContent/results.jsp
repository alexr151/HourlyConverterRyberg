<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Salary Amount</title>
</head>
<body>
	<p>${userSalaryAmt.getHourly() } hourly pay gives you a salary of:
	<br/>
	${userSalaryAmt.getMoSalaryFormat() } per month
	<br/>
	${userSalaryAmt.getySalaryFormat() } per year
	<br/>
	</p>
	
	<a href="index.jsp">Select another hourly</a>
</body>
</html>