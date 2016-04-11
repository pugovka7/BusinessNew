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
<!--<jsp:useBean id="DownTable" class="java.util.ArrayList" scope="session"/>-->
	<h2>List of Users</h2>
	<table>
		<!--  <tr>
			<td>Email</td>
		</tr>
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.userEmail}</td>
			</tr>
		</c:forEach>
-->

		<c:forEach var="customer" items="${customerList}">
			<tr>
				<td>${customer.date}</td>
				<td>${customer.number}</td>
				<td>${customer.name}</td>
				<td>${customer.inn}</td>
				<td>${customer.adress}</td>
				<td>${customer.telephone}</td>
				<td>${customer.kindOfAgreement}</td>
				<td>${customer.kindOfPayment}</td>
				<td><c:forEach var="customer" items="${customerList}">
				<td>${customer.downTbl}</td>
				</c:forEach></td>
			</tr>
			<!--  <tr><c:forEach var="customer" items="${customerList}">
				<td>${customer.downTbl}</td>
				</c:forEach></tr>-->			
		</c:forEach>
		
	</table>
	<br />
	<a href="<c:url value='/list' />">Users</a>
</body>
</html>