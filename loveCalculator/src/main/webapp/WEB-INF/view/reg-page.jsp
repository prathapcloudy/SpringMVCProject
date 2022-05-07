<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<h1 align="center">Please Register here</h1>
	<form:form action="regProcess" method="GET" modelAttribute="userReg">
		<div align="center">
			<label> Name : </label>
			<form:input path="name"></form:input>
			<form:errors path="name" cssClass="error"></form:errors>

			<br> <label>UserName : </label>
			<form:input path="userName"></form:input>
			<form:errors path= "userName" cssClass="error"></form:errors>
			<br /> <label> Password : </label>
			<form:password path="password"></form:password>
			<br /> <label>Country : </label>
			<form:select path="countryName">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="Pak" label="Pakistan"></form:option>

			</form:select>
			<br /> <label>Hobbies : </label> Cricket
			<form:checkbox path="hobbies" value="cricket"></form:checkbox>
			Reading
			<form:checkbox path="hobbies" value="reading"></form:checkbox>
			Travel
			<form:checkbox path="hobbies" value="travel"></form:checkbox>
			Programming
			<form:checkbox path="hobbies" value="programming"></form:checkbox>
			<br> <label>Gender : </label> Male
			<form:radiobutton path="gender" value="male"></form:radiobutton>
			Female
			<form:radiobutton path="gender" value="female"></form:radiobutton>
			<br>
			<p>
			<label>Age</label>
			<form:input path="age"/>
			<form:errors path="age" cssClass="error"></form:errors>
			</p>
		</div>
		<div align="center">
			<h3>communication</h3>
			<label>Email</label>
			<form:input path="communicationDTO.email" />
			<form:errors path ="communicationDTO.email" cssClass="error"></form:errors>
           <br>
           <br>
			<label>Phone</label>
			<form:input path="communicationDTO.phone" />
		</div>
		<br/>
		<div align="center">
			<input type="submit" value="register">
		</div>

	</form:form>
</body>
</html>