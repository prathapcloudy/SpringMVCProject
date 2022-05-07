<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Homepage</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<form:form action="process" method="get" modelAttribute="userInfoDTO">
		<div align="center">
			<p>
				<label for="yn"> Your Name : </label>
				<form:input id="yn" path="userName" ></form:input>
			</p>
			<p>
				<label for="cn"> Crush Name : </label>
				<form:input id="cn" path="crushName" ></form:input>
			</p>
			<input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html> --%>