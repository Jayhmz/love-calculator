<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		
		<h1>Hi ${dto.yourname}</h1>
		<h2>Send result to the Email</h2>
		
		<form:form action="process-email" method="post" modelAttribute="email">
		
			<label>Enter your Email</label> <br>
			<form:input path="email"/>
			<form:errors path="email" />
			
			<input type="submit" value="Send">
		</form:form>
	
	</div>
</body>
</html>