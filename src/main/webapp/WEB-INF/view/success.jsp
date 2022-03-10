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
		<h2>Registration Details</h2>
		<br><br>
		<a href="payment">Pay bills</a><br><br>
		Name : ${user.name}<br>
		Username : ${user.username}<br>
		Country : ${user.country}<br>
		Password : ${user.password}<br>
		Hobbies :
		
		<c:forEach items="${user.hobbies}" var="hobby"> 
			${hobby}
		 </c:forEach><br>
		Gender : ${user.gender}<br>
		<br>
		Email : ${user.communicationDTO.email}
		<br>
		Phone : ${user.communicationDTO.phone}
	</div>
</body>
</html>