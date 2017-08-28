<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users Admin</title>

<style>
table.list {
	border-collapse: collapse;
	width: 40%;
}

table.list, table.list td, table.list th {
	border: 1px solid gray;
	padding: 5px;
}
</style>


</head>
<body>
	<%@ include file="/jsp/menu.jsp"%>
	<br>

	<s:form method="post" action="/user/assignUserRole">
		<table style="border: 1px solid black">
			<tr>
				<td><label>Role:</label></td>
				<td><select name="role" style="width:100%">
						<option disabled selected value>
							<c:forEach var="row" items="${userNotRoles}">
								<option value='${row.roleName}'>${row.roleName}</option>
							</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><s:submit key="label.retrieve" type="button"
						theme="simple" /></td>
			</tr>
		</table>
	</s:form>
	<br>
	<table class="list">
		<tr>
			<th align="left"><s:text name="label.role" /></th>
			<th align="left"><s:text name="label.actions" /></th>
		</tr>

		<c:forEach var="current" items="${userRoles}">
			<tr>
				<td>${current.role}</td>
				<td><s:url id="deleteUserRole" namespace="/user"
						action="deleteUserRole">
						<s:param name="user">${current.user}</s:param>
						<s:param name="role">${current.role}</s:param>
					</s:url> <s:a href="%{deleteUserRole}">Delete</s:a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>