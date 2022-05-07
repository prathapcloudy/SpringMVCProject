<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Bill</h1>
		<hr>

		<form:form action="showBill" modelAttribute="bill">
			<p>
				<label>Card Number :</label>
				<form:input path="creditCard" />
			</p>
			<p>
				<label>Amount : </label>
				<form:input path="amount" />
			</p>
			
			<p>
				<label>Currency : </label>
				<form:input path="currency" />
			</p>
			<p>
				<label>Date : </label>
				<form:input path="date" />
			</p>
			
			<p>
			<input type="submit" value="Bill"/>
			</p>
		</form:form>

	</div>
</body>
</html>