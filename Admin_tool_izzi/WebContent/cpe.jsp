<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Find CPE</title>
</head>
<body>
	<s:form method="post" action="/findCPE2">
		<table>
			<tr>
				<td><s:textfield key="label.hardwareId" name="hardwareId" /></td>
			</tr>
			<tr>
				<td>
					<select name="node">
						<option value="mex">México</option>
						<option value="mty">Monterrey</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><s:submit key="label.retrieve"></s:submit></td>
			</tr>
		</table>
	</s:form>
</body>
</html>