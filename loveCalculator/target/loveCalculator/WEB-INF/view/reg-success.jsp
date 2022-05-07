<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
   .error{
      color: red;  
      position:fixed; 
      text-align: left;
      margin-left: 30px;
  }
</style>

</head>
<body>
<h1> User details Successfully Registered</h1>
 <h2> The Details entered by you are : </h2>
  Name : ${userReg.name}<br/>
  UserName :  ${userReg.userName}<br/>
  Password : ${userReg.password}<br/>
  CountryName : ${userReg.countryName}<br/>Hobbies :
   <c:forEach items= "${userReg.hobbies}" var="obj">
   
   ${obj}
  
  </c:forEach>
  
  <br/>
  Gender : ${userReg.gender}
  
  <br/>
  Age :  ${userReg.age }
  <br/>
  
  Email : ${userReg.communicationDTO.email}
  <br/>
  Phone : ${userReg.communicationDTO.phone}
  <br/>
</body>
</html>