<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="/struts-dojo-tags" prefix="sx"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<sql:query var="rs" dataSource="jdbc/tomcat_realm">
	call spr_mirada_package ('mex');
</sql:query>

<sql:query var="rs_type" dataSource="jdbc/tomcat_realm">
	call spr_mirada_stb_type;
</sql:query>

<sql:query var="rs_node" dataSource="jdbc/tomcat_realm">
	call spr_mirada_node;
</sql:query>

<html>
<head>
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
	<%@ include file="/jsp/menu.jsp"%>

	<s:form method="post" action="/findSubscriber">
		<table style="border: 1px solid black">
			<s:textfield key="label.account" name="account" />
			<s:textfield key="label.irisId" name="irisId" />
			<tr>
				<td><label>Nodo:</label></td>

				<td><select name="node" style="width: 100%">
						<option disabled selected value>
							<c:forEach var="row" items="${rs_node.rows}">
								<option value='${row.mirada_node_code}'>${row.mirada_node_descr}</option>
							</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="2"><s:submit key="label.retrieve" type="button"
						theme="simple" /> <s:submit key="label.create" type="button"
						onclick="abrir();" theme="simple" /></td>
			</tr>
		</table>
	</s:form>


	<c:if test="${!empty client}">
		<h3>
			<s:text name="label.clients" />
		</h3>
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.nickname" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.regionName" /></th>
				<th align="left"><s:text name="label.PPV"></s:text></th>
				<th align="left"><s:text name="label.actions" /></th>
			</tr>
			<tr>
				<td>${client.subscriber.nickname}</td>
				<td>${client.subscriber.irisId}</td>
				<td>${client.subscriber.regionName}</td>
				<td>${client.impulsePPVAllowed}</td>
				<td><s:url id="deleteSubscriber" namespace="/suscriptor"
						action="deleteSubscriber">
						<s:param name="account">${account}</s:param>
					</s:url> <s:url id="activate" namespace="/ird" action="activateAccount">
					</s:url> <s:url id="deactivate" namespace="/ird" action="deactivateAccount">
						<s:param name="subscriber">${account}</s:param>
					</s:url> <s:url id="updateIPPV" namespace="/ippv" action="updateIPPV">
						<s:param name="account">${account}</s:param>
					</s:url> <s:a href="%{deleteSubscriber}">Delete</s:a> <s:a
						href="%{activate}">Activate</s:a> <s:a href="%{deactivate}">Deactivate</s:a>
					<s:a href="%{updateIPPV}">UpdateIPPV</s:a></td>
			</tr>
		</table>
	
	</br>
	<h3>
		<s:text name="label.package" />
	</h3>

	<s:form method="post" namespace="/service" action="addPackage">
		<td><label>Paquete:</label></td>
		<td><select name="irisPackage">
				<option disabled selected value>
					<c:forEach var="row" items="${rs.rows}">
						<option value='${row.package_name}'>${row.package_name}</option>
					</c:forEach>
		</select></td>
		
		<s:textfield key="label.hardwareId" name="hardwareId"></s:textfield>


		<s:submit key="label.send"></s:submit>
	</s:form>
	<c:if test="${!empty client.subscription}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.actions" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.irisPackageId" /></th>
				<th align="left"><s:text name="label.packageName" /></th>
				<th align="left"><s:text name="label.creationDate" /></th>
			</tr>

			<c:forEach items="${client.subscription}" var="current">
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
				<td><label>Tipo:</label></td>
				<td><select name="type" style="width: 100%">
						<option disabled selected value>
							<c:forEach var="row" items="${rs_type.rows}">
								<option value='${row.mirada_stb_type_name}'>${row.mirada_stb_type_descr}</option>
							</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td><s:submit key="label.send"></s:submit></td>
			</tr>
		</table>
	</s:form>

	<c:if test="${!empty client.equipment}">
		<table class="list">
			<tr>
				<th align="left"><s:text name="label.actions" /></th>
				<th align="left"><s:text name="label.irisId" /></th>
				<th align="left"><s:text name="label.hardwareId" /></th>
				<th align="left"><s:text name="label.type" /></th>
				<th align="left"><s:text name="label.creationDate" /></th>
			</tr>
			<c:forEach items="${client.equipment}" var="current">
				<tr>
					<td><s:url id="deleteCPE" namespace="/cpe" action="deleteCPE">
							<s:param name="irisId">${current.irisId}</s:param>
							<s:param name="account">${account}</s:param>
						</s:url> <s:url id="sendMessage" namespace="/ird" action="showMessage">
							<s:param name="hardwareId">${current.hardwareId}</s:param>
						</s:url> <s:url id="rebootSTB" namespace="/ird" action="reboot">
							<s:param name="hardwareId">${current.hardwareId}</s:param>
						</s:url> <s:url id="restoreSTB" namespace="/ird" action="restore">
							<s:param name="hardwareId">${current.hardwareId}</s:param>
						</s:url> <s:url id="enableSTB" namespace="/ird" action="enable">
							<s:param name="hardwareId">${current.hardwareId}</s:param>
						</s:url> <s:url id="disableSTB" namespace="/ird" action="disable">
							<s:param name="hardwareId">${current.hardwareId}</s:param>
						</s:url> 
						
						<s:url id="resetPin" namespace="/ird" action="resetPin">
							<s:param name="hardwareId">${current.hardwareId}</s:param>
						</s:url>
						<% if(request.isUserInRole("cpe-resetpin")){ %>
						<s:a href="%{resetPin}">ResetPin</s:a>
						<% } %>
						<% if(request.isUserInRole("cpe-delete")){ %>
						<s:a href="%{deleteCPE}">Delete</s:a> 
						<% } %>
						<% if(request.isUserInRole("cpe-message")){ %>
						<s:a href="%{sendMessage}">Message</s:a>
						<% } %>
						<% if(request.isUserInRole("cpe-reboot")){ %>
						<s:a href="%{rebootSTB}">Reboot</s:a> 
						<% } %>
						<% if(request.isUserInRole("cpe-restore")){ %>
						<s:a href="%{restoreSTB}">Restore</s:a>
						<% } %>
						<% if(request.isUserInRole("cpe-enable")){ %>
						<s:a href="%{enableSTB}">Enable</s:a> 
						<% } %>
						<% if(request.isUserInRole("cpe-disable")){ %>
						<s:a href="%{disableSTB}">Disable</s:a>
						<% } %>
					</td>
					<td>${current.irisId}</td>
					<td>${current.hardwareId}</td>
					<td>${current.type}</td>
					<td>${current.creationDatetime.time}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</c:if>


</body>
</html>