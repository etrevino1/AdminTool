<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>

<html>
<head>
<%-- <sx:head /> --%>
<title>izzi tv admin</title>

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

<script>
	function abrir() {
		open('newSubscriber.jsp', '', 'top=300,left=300,width=300,height=300');
	}
</script>
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
	<s:url id="findCPE" namespace="/" action="findCPE">
	</s:url>
	<s:a href="%{localeEN}">English</s:a>
	<s:a href="%{localeES}">Español</s:a>
	<s:a href="%{localeDE}">Deutsche</s:a>
	<br />
	<s:a href="%{findCPE}">CPE</s:a>
	<br />
	<a href="<s:url action="index" namespace="config-browser" />">Launch
		the configuration browser</a>

	<s:form method="post" action="/findSubscriber">
		<table style="border: 1px solid black">
			<s:textfield key="label.account" name="account" />
			<s:textfield key="label.irisId" name="irisId" />
			<tr>
				<td><label>Nodo:</label></td>
				<td><select name="node" style="width: 100%;">
						<option value="mex">México</option>
						<option value="mty">Monterrey</option>
				</select></td>
			</tr>
			<tr>
				<td colspan="2">
				<s:submit key="label.retrieve" type="button" theme="simple"/>
				<s:submit key="label.create" type="button" onclick="abrir();" theme="simple"/>
				</td>
			</tr>
		</table>
	</s:form>


	<h3>
		<s:text name="label.clients" />
	</h3>
	<c:if test="${!empty subscriber}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.nickname" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.regionName" /></th>
				<th align="left"><s:text name="label.actions" /></th>
			</tr>
			<tr>
				<td>${subscriber.nickname}</td>
				<td>${subscriber.irisId}</td>
				<td>${subscriber.regionName}</td>
				<td>
					<s:url id="deleteSubscriber" namespace="/suscriptor" action="deleteSubscriber">
						<s:param name="account">${account}</s:param>
					</s:url> 
					<s:url id="activate" namespace="/ird" action="activateAccount">
						<s:param name="subscriber">${account}</s:param>
					</s:url> 
					<s:url id="deactivate" namespace="/ird" action="deactivateAccount">
						<s:param name="subscriber">${account}</s:param>
					</s:url> 
					<s:a href="%{deleteSubscriber}">Delete</s:a> 
					<s:a href="%{activate}">Activate</s:a>
					<s:a href="%{deactivate}">Deactivate</s:a>
				</td>
			</tr>
		</table>
	</c:if>
	</br>
	<h3>
		<s:text name="label.package" />
	</h3>

	<s:form method="post" namespace="/service" action="addPackage" >
		<s:textfield key="label.package" name="irisPackage"></s:textfield>
		<s:submit key="label.send"></s:submit>
	</s:form>
	<c:if test="${!empty subscription}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.actions" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.irisPackageId" /></th>
				<th align="left"><s:text name="label.packageName" /></th>
				<th align="left"><s:text name="label.creationDate" /></th>
			</tr>

			<c:forEach items="${subscription}" var="current">
				<tr>
					<td><s:url id="deletePackage" namespace="/service"
							action="mirada">
							<s:param name="irisId">${current.irisId}</s:param>
							<s:param name="account">${account}</s:param>
						</s:url> <s:a href="%{deletePackage}">Delete</s:a></td>
					<td>${current.irisId}</td>
					<td>${current.irisPackageId}</td>
					<td>${current.packageName}</td>
					<td>${current.creationDatetime.time}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

	</br>
	<h3>
		<s:text name="label.hardwareId" />
	</h3>
	<s:form method="post" namespace="/cpe" action="addCPE">
		<table>
			<tr>
				<td><s:textfield key="label.hardwareId" name="hardwareId"></s:textfield></td>
			</tr>
			<tr>
				<td><label>Nodo:</label></td>
				<td><select name="type">
						<option value="Technicolor 5010451">Technicolor</option>
						<option value="PACE 5010452">Pace</option>
				</select></td>
			</tr>
			<tr>
				<td><s:submit key="label.send"></s:submit></td>
			</tr>
		</table>
	</s:form>

	<c:if test="${!empty equipments}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.actions" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.hardwareId" /></th>
				<th align="left"><s:text name="label.type" /></th>
				<th align="left"><s:text name="label.creationDate" /></th>
			</tr>
			<c:forEach items="${equipments}" var="current">
				<tr>
					<td><s:url id="deleteCPE" namespace="/cpe" action="deleteCPE">
							<s:param name="irisId">${current.irisId}</s:param>
							<s:param name="account">${account}</s:param>
						</s:url> <s:url id="sendMessage" namespace="/ird" action="showMessage">
							<s:param name="hardwareId">${current.hardwareId}</s:param>
						</s:url> <s:a href="%{deleteCPE}">Delete</s:a> <s:a href="%{sendMessage}">Message</s:a>
					</td>
					<td>${current.irisId}</td>
					<td>${current.hardwareId}</td>
					<td>${current.type}</td>
					<td>${current.creationDatetime.time}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>



</body>
</html>