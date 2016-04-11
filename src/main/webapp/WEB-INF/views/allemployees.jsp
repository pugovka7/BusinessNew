<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!--ISO-8859-1-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University Enrollments</title>

<style>
tr:first-child {
	font-weight: bold;
	background-color: #C6C9C4;
}
</style>

</head>


<body>
	<h2>List of Users</h2>
	<table>
		<tr>
			<td>Email</td>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.userEmail}</td>
			</tr>
		</c:forEach>


		<c:forEach var="customer" items="${customerList}">
			<tr>
				<td>${customer.date}</td>
				<td>${customer.name}</td>
			</tr>			
		</c:forEach>
		
	</table>
	<br />
	<a href="<c:url value='/new' />">Add New User</a>
	<a href="<c:url value='/listMongo' />">All Mongo</a>
</body>
</html>