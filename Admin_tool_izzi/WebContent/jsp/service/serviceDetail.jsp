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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Package Detail</title>
</head>
<body>
	<%@ include file="/jsp/menu.jsp"%>
	<br>


	<s:form method="post" namespace="/service" action="insertPackageDetails">
		<table style="border: 1px solid black">
			<tr>
				<s:textfield key="label.packageName" name="packageName"></s:textfield>
			</tr>
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
				<s:textfield key="label.packageDetail" name="packageDetail"></s:textfield>
			</tr>
			<tr>
				<s:checkbox key="label.service.required" name="required"/>
			</tr>
			<tr>
				<td colspan="2"><s:submit key="label.create" type="button"
						theme="simple" method="/service/getPackage" /></td>
			</tr>
		</table>
	</s:form>

	</br>

	<table class="list">
		<tr>
			<th align="left"><s:text name="label.actions" /></th>
			<th align="left"><s:text name="label.service.name" /></th>
			<th align="left"><s:text name="label.node" /></th>
			<th align="left"><s:text name="label.service.name" /></th>
			<th align="left"><s:text name="label.service.required" /></th>
		</tr>

		<c:forEach var="current" items="${packageDetailInfo}">
			<tr>
				<td>edit</td>
				<td>${current.packageName}</td>
				<td>${current.packageNode}</td>
				<td>${current.packageDetail}</td>
				<td>${current.required}</td>
				
			</tr>
		</c:forEach>
	</table>


</body>
</html>