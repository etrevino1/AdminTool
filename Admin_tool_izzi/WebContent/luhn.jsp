<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%-- <%@ taglib uri="/struts-dojo-tags" prefix="sx"%> --%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><s:text name="equipo.title" /></title>

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

<%@ include file="/jsp/menu.jsp"%>

<body>
	<s:form method="post" namespace="/equipo" action="mirada">
		<table>
			<tr>
				<td><s:textfield key="equipo.inicialCA_ID" name="equipoInicial" /></td>
			</tr>
			<tr>
				<td><s:textfield key="equipo.finalCA_ID" name="equipoFinal" /></td>
			</tr>

			<tr>
				<td><s:submit key="label.retrieve"></s:submit></td>
			</tr>
		</table>
	</s:form>


	<c:if test="${!empty lista}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="equipo.number" />
				<th align="left"><s:text name="equipo.CA_ID" />
			</tr>
			<c:forEach items="${lista}" var="current" varStatus="contador">
				<tr>
					<td>${contador.index + 1}</td>
					<td>${current}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>