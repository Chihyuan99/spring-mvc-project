<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="ecomm.customers.login.page.title" /></title>
<style>
span {
	color: red;
}
</style>
</head>
<body>
	<form:form method="post" action="userLogin" modelAttribute="loginForm">
		<table>
			<tr>
				<td><spring:message
						code="ecomm.customers.login.page.uname.label" /></td>
				<td><form:input path="username" /></td>
				<td><span><form:errors path="username" /></span></td>
			</tr>
			<tr>
				<td><spring:message
						code="ecomm.customers.login.page.pword.label" /></td>
				<td><form:password path="password" /></td>
				<td><span><form:errors path="password" /></span></td>
			</tr>
			<tr>
				<td><input type="submit"
					value='<spring:message code="ecomm.customers.login.page.submit.label"/>' /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>