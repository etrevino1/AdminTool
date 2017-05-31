<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>




<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find CPE</title>





</head>
<body>
	<s:url id="findSubscriber" namespace="/" action="findSubscriber">
	</s:url>
	<s:url id="viewUsers" namespace="/user" action="getUsers">
	</s:url>
	<s:url id="viewLog" namespace="/log" action="viewLog">
	</s:url>
	<s:a href="%{findSubscriber}">Subscriber</s:a>
	<s:a href="%{viewUsers}">Users</s:a>
	<s:a href="%{viewLog}">Log</s:a>
	<br />
	<a href="<s:url action="index" namespace="config-browser" />">Launch
		the configuration browser</a>


		<s:form method="post" action="/findCPE">
			<table >
				<tr>
					<td><s:textfield key="label.hardwareId" name="hardwareId"
							requiredLabel="true" class="" /></td>
				</tr>
				<tr>
					<td><label>Nodo:</label></td>
					<td><select name="node" style="width: 100%;">
							<option value="mex">México</option>
							<option value="mty">Monterrey</option>
					</select></td>
				</tr>
				<tr>
					<td><s:submit key="label.retrieve"></s:submit></td>
				</tr>
			</table>
		</s:form>

</body>
</html>