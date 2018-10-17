<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<sql:query var="rs_node" dataSource="jdbc/tomcat_realm">
	call spr_mirada_node;
</sql:query>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Subscriber</title>

</head>
<body>
	<s:form method="post" namespace="/suscriptor" action="newSubscriber">
		<s:textfield key="label.account" name="account"></s:textfield>
		<s:textfield key="label.region" name="region"></s:textfield>
		<tr>
		<td><label>Nodo:</label></td>
		<td><select name="node" style="width: 100%">
				<option disabled selected value>
					<c:forEach var="row" items="${rs_node.rows}">
						<option value='${row.mirada_node_code}'>${row.mirada_node_descr}</option>
					</c:forEach>
		</select></td>
		</tr>
		<s:submit key="label.send" />
	</s:form>
</body>
</html>