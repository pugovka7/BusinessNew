<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>User Registration Form</title>

<style>

	.error {
		color: #ff0000;
	}
</style>

</head>

<body>

	<h2>Registration Form</h2>
 
	<form:form method="POST" modelAttribute="employee">
		<form:input type="hidden" path="userId" id="userId"/>
		<table>
			<tr>
				<td><label for="userEmail">Email: </label> </td>
				<td><form:input path="userEmail" id="userEmail"/></td>
				<td><form:errors path="userEmail" cssClass="error"/></td>
		    </tr>
	    
			<tr>
				<td><label for="userPassword">Password: </label> </td>
				<td><form:input path="userPassword" id="userPassword"/></td>
				<td><form:errors path="userPassword" cssClass="error"/></td>
		    </tr>
	
			<tr>
				<td colspan="3">
					
							<input type="submit" value="Register"/>
						
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/list' />">List of All Employees</a>
</body>
</html>