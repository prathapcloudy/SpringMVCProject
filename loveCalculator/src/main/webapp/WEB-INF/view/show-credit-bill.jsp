<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<h3>BILL AGAINST THE CREDIT CARD NUMBER ${bill.creditCard } for an amount of ${bill.amount}${bill.currency}
has been generated on ${bill.date}</h3>
</div>


</body>
</html>