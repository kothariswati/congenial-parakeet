<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<title>Query</title>
<body>

	<sql:setDataSource var="myDS" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/test" user="root" password="Alpha123" />

	<sql:query var="result" dataSource="${myDS}">
select * from customer_personal_details a,customer_contact_details b,customer_bank_details c
where a.phone=b.phone and b.phone=c.phone;</sql:query>

	<table border="1" width="100%">
		<tr>
			<th>First Name</th>
			<th>Middle Name</th>
			<th>Last Name</th>
			<th>Gender</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
			<th>Phone</th>
			<th>Bank Name</th>
			<th>Account Number</th>
			<th>SSN</th>
		</tr>

		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.firstname}" /></td>
				<td><c:out value="${row.middlename}" /></td>
				<td><c:out value="${row.lastname}" /></td>
				<td><c:out value="${row.gender}" /></td>
				<td><c:out value="${row.address}" /></td>
				<td><c:out value="${row.city}" /></td>
				<td><c:out value="${row.state}" /></td>
				<td><c:out value="${row.country}" /></td>
				<td><c:out value="${row.phone}" /></td>
				<td><c:out value="${row.bankname}" /></td>
				<td><c:out value="${row.accountnum}" /></td>
				<td><c:out value="${row.ssn}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</head>
</html>