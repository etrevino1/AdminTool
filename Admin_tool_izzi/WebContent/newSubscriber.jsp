<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Subscriber</title>
</head>
<body>
	<s:form method="post" namespace="/suscriptor" action="newSubscriber" >
		<s:textfield key="label.account" name="account"></s:textfield>
		<s:textfield key="label.region" name="region"></s:textfield>
		<s:submit key="label.send"/>
	</s:form>
</body>
</html>