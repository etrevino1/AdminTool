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

	<s:form method="post" action="/user/createUser">
		<table style="border: 1px solid black">
			<s:textfield key="label.user" name="user" />
			<s:textfield key="label.password" name="password" />
			<tr>
				<td colspan="2"><s:submit key="label.retrieve" type="button" theme="simple" /></td>
			</tr>
		</table>
	</s:form>

	<br>

	<table class="list">
		<tr>
			<th align="left"><s:text name="label.user" /></th>
			<th align="left"><s:text name="label.actions" /></th>
		</tr>

		<c:forEach var="current" items="${users}">
			<tr>
				<td>${current.userName}</td>
				<td> 
					<s:url id="deleteUser" namespace="/user" action="deleteUser">
						<s:param name="user">${current.userName}</s:param>
					</s:url>
					<s:url id="editUser" namespace="/user" action="getUserRoles">
						<s:param name="user">${current.userName}</s:param>
					</s:url>
					
					
					<s:a href="%{deleteUser}">Delete</s:a>
					<s:a href="%{editUser}">Edit</s:a>
					
					
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>