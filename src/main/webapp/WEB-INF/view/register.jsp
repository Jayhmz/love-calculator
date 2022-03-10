<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
<style>
	
	.error{
		color: red;
		margin-left: 20px;
		margin-bottom: 3px;
	}

</style>
</head>
<body>

	<div align="center">
		<h2 align="center">Love Calculator</h2>

		<form:form action="process-registration" method="POST" modelAttribute="user">
			<label>Name : </label>
			<form:input path="name" cssClass=""/>
			<form:errors path="name" /><br> <br>
			
			<label>Username : </label>
			<form:input path="username" cssClass=""/>
			<form:errors path="username" cssClass="error"/>
			<br> <br>
			
			<label>Age : </label>
			<form:input path="age" cssClass=""/>
			<form:errors path="age" cssClass="error"/>
			<br> <br>
			
			<label>Password : </label>
			<form:password path="password" cssClass=""/>
			<form:errors path="password" cssClass="error"/>
			<br> <br>

			<label>Country : </label>
			<form:select path="country" cssClass="">
				<form:option value="India" label="India"></form:option>
				<form:option value="Nigeria" label="Nigeria"></form:option>
				<form:option value="UK" label="United Kingdom"></form:option>
			</form:select>
			<form:errors path="country" cssClass=""/>
			<br> <br>
			
			<label>Hobbies : </label>
			Cricket <form:checkbox path="hobbies" value="cricket" />
			Football <form:checkbox path="hobbies" value="football" />
			Music <form:checkbox path="hobbies" value="music" />
			Dance <form:checkbox path="hobbies" value="dance" />
			none <form:checkbox path="hobbies" value="none" />
			<form:errors path="hobbies" cssClass=""/>
			<br> <br>
			
			<label>Gender :</label>
			 <form:radiobutton path="gender" value="Male"/>Male
			 <form:radiobutton path="gender" value="Female"/>Female
			<br><br>
			
			<div align="center">
			<h3 align="center">Communication</h3>
				<label>Email : </label>
				<form:input path="communicationDTO.email"/>
				<label>Phone : </label>
				<form:input path="communicationDTO.phone"/>
				<form:errors path="communicationDTO.phone" />
			</div><br><br>
			
			<input type="submit" value="SUBMIT"/>
		</form:form>
	</div>
</body>
</html>