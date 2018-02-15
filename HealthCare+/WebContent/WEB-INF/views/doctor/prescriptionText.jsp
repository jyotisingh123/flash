<%-- <%@ page ="com.app.PatientController" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file = "../patient/header.jsp" %> 

<h1>Hello ${prescription.doctorID}</h1>
<body align="center">

<center>
	<h1>Prescription Given Successfully For Patient  ${prescription.patientID}</h1>
</center><br><br>
	<table style="margin: auto;" border="1">

		<tr>
			
			<td>Medicine :</td><td>${prescription.medicine}</td>
		</tr>	
		
		<tr>
			
			<td>Remedy :</td><td>${prescription.remedies}</td>
		</tr>
		<tr>
			
			<td>Remark :</td><td>${prescription.remark}</td>
		</tr>
	
	</table>
	<a href = "<c:url value = "/logout"/>">Logout</a></td>
	
<%@ include file = "../patient/footer.jsp" %>
