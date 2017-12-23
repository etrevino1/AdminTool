<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>

<html>
<head>
<%-- <sx:head /> --%>
<sj:head/>
<sql:query var="rs_node" dataSource="jdbc/tomcat_realm">
	call spr_mirada_node;
</sql:query>

<title>Insert title here</title>
</head>
<body>
	<%@ include file="/jsp/menu.jsp"%>
	<br>

	<s:form method="post" action="createIPPV" namespace="/ippv">
		<table style="border: 1px solid black">
			<s:textfield key="label.externalRef" name="externalRef" />
			<s:textfield key="label.eventId" name="eventId" />
			<s:textfield key="label.eventPrice" name="eventPrice" />

			<sj:datepicker key="label.eventPurchaseStartTime" name="eventPurchaseStartTime" changeMonth="true" changeYear="true" timepicker="true" timepickerShowSecond="true" timepickerFormat="HH:mm:ss" displayFormat="dd/mm/yy" />
			<sj:datepicker key="label.eventPurchaseEndTime" name="eventPurchaseEndTime" changeMonth="true" changeYear="true" timepicker="true" timepickerShowSecond="true" timepickerFormat="HH:mm:ss" displayFormat="dd/mm/yy" />
		 	
		 	<sj:datepicker key="label.eventFreeviewStartTime" name="eventFreeviewStartTime" changeMonth="true" changeYear="true" timepicker="true" timepickerShowSecond="true" timepickerFormat="HH:mm:ss" displayFormat="dd/mm/yy" />
			<sj:datepicker key="label.eventFreeviewEndTime" name="eventFreeviewEndTime" changeMonth="true" changeYear="true" timepicker="true" timepickerShowSecond="true" timepickerFormat="HH:mm:ss" displayFormat="dd/mm/yy" />
			
			<sj:datepicker key="label.eventCancelStartTime" name="eventCancelStartTime" changeMonth="true" changeYear="true" timepicker="true" timepickerShowSecond="true" timepickerFormat="HH:mm:ss" displayFormat="dd/mm/yy" />
			<sj:datepicker key="label.eventCancelEndTime" name="eventCancelEndTime" changeMonth="true" changeYear="true" timepicker="true" timepickerShowSecond="true" timepickerFormat="HH:mm:ss" displayFormat="dd/mm/yy" />
			
			<s:textfield key="label.language" name="language" />
			<s:textfield key="label.name" name="name" />
			
			<td><label>Nodo:</label></td>

				<td><select name="node" style="width: 100%">
						<option disabled selected value>
							<c:forEach var="row" items="${rs_node.rows}">
								<option value='${row.mirada_node_code}'>${row.mirada_node_descr}</option>
							</c:forEach>
				</select></td>
			<tr>
				<td colspan="2">
					<s:submit key="label.retrieve" type="button" theme="simple" />
				</td>
			</tr>
		</table>
	</s:form>


</body>
</html>