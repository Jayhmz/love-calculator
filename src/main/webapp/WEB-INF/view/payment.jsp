<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
	<div align="center">
		<h2>Payment Details</h2>
		<br><br>
		<form:form action="order" method="post" modelAttribute="cardNumber">
			<label>Card Number : </label> 
			<form:input path="cardDetail"/><br><br>
			
			
			<input type="submit" value="PAY">
		</form:form>
	</div>
</body>
</html>