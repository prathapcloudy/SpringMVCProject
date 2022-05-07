<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<h1 align="center">Love Calculator</h1>
	<br>
	<h2>The Love calculator predicts :</h2>
	${userInfo.userName} and ${userInfo.crushName} are
	<br> 
	${userInfo.result}
	<br>
	<a href="sendEmail">send result to email</a>
	<br>
	<a href="#">try with somebody else</a>
	<br>
	<a href="#">check user history</a>
</body>
</html>