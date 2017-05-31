<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log View</title>

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

	<s:url id="findSubscriber" namespace="/" action="findSubscriber">
	</s:url>
	<s:url id="findCPE" namespace="/" action="findCPE">
	</s:url>
	<s:url id="viewUsers" namespace="/user" action="getUsers">
	</s:url>
	<s:a href="%{findSubscriber}">Subscriber</s:a>
	<s:a href="%{findCPE}">CPE</s:a>
	<s:a href="%{viewUsers}">Users</s:a>
	<br />
	<a href="<s:url action="index" namespace="config-browser" />">Launch
		the configuration browser</a>
	<br>
	<br>
	<s:form method="post" action="/log/viewLog">
		<table style="border: 1px solid black">
			<s:textfield key="label.user" name="user" />
			<tr>
				<td colspan="2"><s:submit key="label.retrieve" type="button"
						theme="simple" /></td>
			</tr>
		</table>
	</s:form>
	<br>

	<table class="list">
		<tr>
			<th align="left"><s:text name="label.date" /></th>
			<th align="left"><s:text name="label.user" /></th>
			<th align="left"><s:text name="label.action" /></th>
			<th align="left"><s:text name="label.actionDetail" /></th>
		</tr>

		<c:forEach var="current" items="${logs}">
			<tr>
				<td>${current.date}</td>
				<td>${current.user}</td>
				<td>${current.operation}</td>
				<td>${current.detail}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>