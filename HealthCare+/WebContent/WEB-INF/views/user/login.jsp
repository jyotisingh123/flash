<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file = "../patient/header.jsp" %> 
<body align="center" background="k.jpg">
<form:form method="post" modelAttribute="person">
<table style="margin: auto;">
	<tr>
	<td>Email: </td>
	<td><form:input path="email"  autofocus="true" required="true"/></td>
	</tr><br>
	<tr>
	<td>password: </td> 
	<td><form:password path="password" required="true" /></td>
	</tr>
	
	
	<tr colspan="2">
	<td><input type="submit" value="login" align="center"></td>
</table>
</form:form>

<%@ include file = "../patient/footer.jsp" %>
