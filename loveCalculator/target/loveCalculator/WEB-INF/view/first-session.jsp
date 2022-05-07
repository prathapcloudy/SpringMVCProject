<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Session Attributes Examples </h1>
FirstName : ${firstName}
<br>
LastName : ${lastName}
<br>
Address : ${address}
<br>
<a href="${next}" > next ${next}</a>
<br>
Value is fetching from request scope : ${requestScope.lastName}
<br>
Value is fetching from session scope : ${sessionScope.lastName}


</body>
</html>