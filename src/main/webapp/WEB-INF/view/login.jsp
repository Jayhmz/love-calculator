<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
<style>
.error {
	color: red;
	margin-left: 20px;
	margin-bottom: 3px;
}
</style>
<script type="text/javascript">
	function validateUser() {
		var userName = document.getElementById('yn').value;
		if (userName.length < 3) {
			alert('sorry');
			return false;
		} else {
			return true;
		}
	}
</script>

</head>
<body>

	<div align="center">
		<h2>Love Calculator</h2>

		<form:form action="process-login" method="POST"
			modelAttribute="lovers">
			<label>Your Name :</label>
			<form:input path="yourname" id="yn" />
			<form:errors path="yourname" cssClass="error" />
			<br>
			<br>

			<label>Crush Name :</label>
			<form:input path="crushname" id="crush" />
			<form:errors path="crushname" cssClass="error" />
			<br>
			<br>
			
			<form:checkbox path="termsAndCondition" />
			<label>Terms and Condition</label>
			<form:errors path="termsAndCondition" cssClass="error" />

			<br>
			<br>
			
			<input type="submit" value="SUBMIT">
		</form:form>

	</div>
</body>
</html>