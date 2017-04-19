<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<sql:query var="rs" dataSource="jdbc/tomcat_realm">
call spr_mirada_package;
</sql:query>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<s:form method="post" namespace="/service" action="addPackage">
		<select name="irisPackage1">
			<c:forEach var="row" items="${rs.rows}">
				<option value='${row.package_name}'>${row.package_name}</option>
			</c:forEach>
		</select>
	</s:form>
	<c:forEach var="row" items="${rs.rows}">
     ${row.package_id} 
     ${row.package_name}<br />
	</c:forEach>
</body>
</html>