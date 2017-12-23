<%@ taglib uri="/struts-tags" prefix="s"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
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


<title>Insert title here</title>
</head>
<body>

	<s:url id="localeEN" namespace="/" action="locale">
		<s:param name="request_locale">en</s:param>
	</s:url>
	<s:url id="localeES" namespace="/" action="locale">
		<s:param name="request_locale">es</s:param>
	</s:url>
	<s:url id="localeDE" namespace="/" action="locale">
		<s:param name="request_locale">de</s:param>
	</s:url>
	<s:url id="findSubscriber" namespace="/" action="findSubscriber">
	</s:url>
	<s:url id="findCPE" namespace="/" action="findCPE">
	</s:url>
	<s:url id="viewUsers" namespace="/user" action="getUsers">
	</s:url>
	<s:url id="viewLog" namespace="/log" action="viewLog">
	</s:url>
	<s:url id="equipos" namespace="/" action="luhn">
	</s:url>
	<s:url id="ippv" namespace="/ippv" action="ippv">
	</s:url>
	<s:url id="paquetes" namespace="/service" action="getPackage">
	</s:url>
	<s:a href="%{localeEN}">English</s:a>
	<s:a href="%{localeES}">Español</s:a>
	<s:a href="%{localeDE}">Deutsche</s:a>
	<br />
	<% if(request.isUserInRole("admintool-access")){ %>
	<s:a href="%{findSubscriber}">Subscriber</s:a>
	<% } %>
	<% if(request.isUserInRole("cpe-find")){ %>
	<s:a href="%{findCPE}">CPE</s:a>
	<% } %>
	<% if(request.isUserInRole("user-get")){ %>
	<s:a href="%{viewUsers}">Users</s:a>
	<% } %>
	<% if(request.isUserInRole("equipment")){ %>
	<s:a href="%{equipos}">Equipos</s:a>
	<% } %>
	<% if(request.isUserInRole("log-query")){ %>
	<s:a href="%{viewLog}">Log</s:a>
	<% } %>
	<s:a href="%{ippv}">iPPV</s:a>
	<br />
	<s:a href="%{paquetes}">Paquetes</s:a>
	<br />
	<% if(request.isUserInRole("admintool-admin")){ %>
	<a href="<s:url action="index" namespace="config-browser" />">Launch
		the configuration browser</a>
	<% } %>
	<br />
</body>
</html>