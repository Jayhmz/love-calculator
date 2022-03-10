<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
</head>
<body>
	<div align="center">
		
		<h2>Love Calculator Result</h2>
		
		<br><br>
		${dto.yourname}  :
		
		<br><br>The result is ${relationship}
		<br><br>
		
		<a href="/love-calculator/send-mail" >Send result as an email</a>
	
	</div>
</body>
</html>