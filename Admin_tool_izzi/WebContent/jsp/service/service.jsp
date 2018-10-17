<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:query var="rs_node" dataSource="jdbc/tomcat_realm">
	call spr_mirada_node;
</sql:query>

<html>
<head>

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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Packages Admin</title>
</head>
<body>
	<%@ include file="/jsp/menu.jsp"%>
	<br>

	<table style="border: 1px solid black">
		<s:form method="post" namespace="/service">
			<tr>
				<td><label>Nodo:</label></td>

				<td><select name="packageNode" style="width: 100%">
						<option disabled selected value>
							<c:forEach var="row" items="${rs_node.rows}">
								<option value='${row.mirada_node_code}'>${row.mirada_node_descr}</option>
							</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><s:submit key="label.retrieve" type="button"
						theme="simple" method="/service/getPackage" /></td>
			</tr>
		</s:form>
		<s:form method="post" namespace="/service" action="/service/insertPackage">
			<s:submit key="label.create" type="button" theme="simple"
				method="/service/insertPackage" />
		</s:form>
	</table>


	<table class="list" style="border: 1px solid black">
		<tr>
			<th align="left"><s:text name="label.actions" /></th>
			<th align="left"><s:text name="label.service.name" /></th>
			<th align="left"><s:text name="label.node" /></th>
			<th align="left"><s:text name="label.service.required" /></th>
		</tr>

		<c:forEach var="current" items="${packages}">
			<tr>
				<td><s:url id="deletePackage" namespace="/service"
						action="deletePackage">
						<s:param name="packageId">${current.package_id}</s:param>
					</s:url> 
					<s:a href="%{deletePackage}">Delete</s:a> edit</td>
				<td>
					<s:url id="getPackageDetails" namespace="/service"
						action="getPackageDetails">
						<s:param name="packageName">${current.package_name}</s:param>
					</s:url> 
					<s:a href="%{getPackageDetails}">${current.package_name}</s:a></td>
				</td>
				<td>${current.mirada_node}</td>
				<td>${current.equipment_needed}</td>
			</tr>
		</c:forEach>
	</table>



</body>
</html>