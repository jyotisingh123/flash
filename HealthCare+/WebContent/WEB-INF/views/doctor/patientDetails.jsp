<%@page import="pojos.Prescription"%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file = "../patient/header.jsp" %>

	<h3 align="center"> Patient Details of ${patientId}</h3>
	<h1></h1>
	
	<table style="margin: auto;" border="1">

		<tr>
			<th>Name</th>
			<th>City</th>
			<th>DOB</th>
			<th>Gender</th>
			<th>Email</th>
			<th>Phone No</th>
			
		</tr>
		
			<tr>
				<td>${patient.name}</td>
				<td>${patient.city}</td>
				<td>${patient.dob}</td>
				<td>${patient.gender}</td>
				<td>${patient.email}</td>
				<td>${patient.phoneNo}</td>
				
				
			</tr>
	

	</table><br><br><br>
	<center>
	<button onclick="goBack()">Go Back</button>
</center>
<script>
function goBack() {
    window.history.back();
}
</script>
	
<%@ include file = "../patient/footer.jsp" %>