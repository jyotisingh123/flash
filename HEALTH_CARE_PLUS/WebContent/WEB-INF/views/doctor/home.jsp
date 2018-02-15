<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
	<h3>Hello ${doctorID}</h3>
	<div style="height: 170px; width: 80%; margin:0 auto;">
	<center>
		<h1> List Of Requested  Prescription</h1>
	</center>
	<br>
	<br>
	<table class="table">
		<tr>

			<th>Patient ID</th>
			<th>Symptoms</th>
			<th>
			<th>
			<th>
			<th>
		</tr>
		<c:forEach var="prescription" items="${listPresciption}">
			<tr>

				<td>${prescription.patientID}</td>

				<td>${prescription.symptomsDetails}</td>


				<td><a
					href="<c:url value = "/givePrescription/${prescription.patientID}/${prescription.doctorID}/${prescription.symptomsDetails}"/>">Give
						Prescription</a></td>
				<td><a
					href="<c:url value = "/user/doctor/patientDetails/${prescription.patientID}"/>">View
						Patient Details</a></td>
				<td><a
					href="<c:url value = "/user/doctor/confirmAppointment/${prescription.patientID}/${prescription.doctorID}"/>">Give
						Appointment</a></td>

			</tr>
		</c:forEach>


	</table>
	<%@ include file="../patient/footer.jsp"%>
</div>
</body>
