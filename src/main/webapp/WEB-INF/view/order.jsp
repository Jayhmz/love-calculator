<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		You have made a purhase with card number : ${cardNumber.cardDetail} for an amount ${amount} on ${date}
	</div>
</body>
</html>