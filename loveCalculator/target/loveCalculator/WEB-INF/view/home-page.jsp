<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Homepage</title>

<style type="text/css">
  .error{
      color: red;  
      position:fixed; 
      text-align: left;
      margin-left: 30px;
  }

</style>

<script type="text/javascript">
function validateUserName(){
    var userName = document.getElementById('yn').value;
    if (userName.length < 1){
    	
    	alert("Your name should have atleast one charecter");
    	return false;
    }else {
    	
    	return true;
    }
}
</script>

</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr>
	<form:form action="emailProcess" method="GET" modelAttribute="userInfo" onsubmit="return validateUserName()">
		<div align="center">
		<p>
				<label for="yn"> Your Name : </label>
				<form:input id="yn" path="userName" ></form:input>
				<form:errors path="userName" cssClass="error"></form:errors>
				</p>
				<p>
				<label for="cn"> Crush Name : </label>
				<form:input id="cn" path="crushName" ></form:input>
				<form:errors path="crushName" cssClass="error"></form:errors>
				</p>
			    <form:checkbox path="termAndCondition" id="check" ></form:checkbox>
			    <label>I am agreeing that this is for fun </label>
			    <form:errors path="termAndCondition" cssClass="error"></form:errors>
			     <br/>
			    <input type="submit" value="calculate" />
		</div>
	</form:form>
</body>
</html>