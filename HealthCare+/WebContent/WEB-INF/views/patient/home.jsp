<%@page import="pojos.Prescription"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file = "header.jsp" %> 

	<h3 align="center">All Doctors Details</h3>
	
	<table style="margin: auto;" border="1">

		<tr>
			<th>Name</th>
			<th>City</th>
			<th>Specialization</th>
			<th>Gender</th>
			<th>Email</th>
			<th><th>
			<th><th>
		</tr>
		<c:forEach var="doctor" items="${requestScope.listDoctor}">
			<tr>
				<td>${doctor.name}</td>
				<td>${doctor.city}</td>
				<td>${doctor.specialization}</td>
				<td>${doctor.gender}</td>
				<td>${doctor.email}</td>
				
				<td><a href="user/doctor/moreInfo">more info</a></td>
				<!-- <td><a href="doctor/prescription">Get Prescription</a></td> -->
				<%-- <td><a href="doctor/prescription/${doctor.email}/${patientId}"/">Get Prescription</a></td> --%>
					<td> <a href = "<c:url value = "/takePrescription/${doctor.email}/${patientId}"/>">Get Prescription  </a></td>
				<td><a href="user/doctor/moreInfo">Request For Appointment </a></td>
			</tr>
		</c:forEach>
		
		


	</table><br><br><br>
	<center>
	<h2>List Of Requested Prescriptions</h2>
	</center>
	
	<table style="margin: auto;" border="1">

		<tr>
			<th>DoctorId</th>
			<th>Symptoms</th>
			<th>Remedy</th>
			<th>Medicine</th>
			<th>Remark</th>
			<th><th>
		</tr>
		<c:forEach var="prescription" items="${listPrescriptionForPatient}">
		
			<tr>
				<td>${prescription.doctorID}</td>
				<td>${prescription.symptomsDetails}</td>
				<td>${prescription.remedies}</td>
				<td>${prescription.medicine}</td>
				<td>${prescription.remark}</td>
				
				
			</tr>
			
		</c:forEach>
		
		


	</table>
	

<%@ include file = "footer.jsp"%>