<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Service</title>
</head>
<body>
	<%@ include file="/jsp/menu.jsp"%>
	<br>

	<s:form method="post" action="/service/insertPackage">
		<table style="border: 1px solid black">
			<tr>
				<s:textfield key="label.service.name" name="packageName"></s:textfield>
			</tr>
			<tr>
				<td><label>Role:</label></td>
				<td>
					<select name="packageNode" style="width:100%">
						<option disabled selected value/>
						<c:forEach var="row" items="${nodes}">
							<option value='${row.node_code}'>${row.node_description}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<s:checkbox key="label.service.required" name="required"/>
			</tr>
			<tr>
				<td>
					<s:submit key="label.create" type="button" theme="simple" />
				</td>
			</tr>
			
		</table>
	</s:form>



</body>
</html>