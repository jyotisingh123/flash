<%-- <%@ page ="com.app.PatientController" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file = "../patient/header.jsp" %> 

<h4>Hello,  ${doctorId}</h4>
<body>
<center>
	<h2>Doctor's prescription form for ${patientId}</h2>
</center>
<center>
<div>
	<h3>Symptoms: ${symptomsDetails }</h3>
</div><br>
</center>
<form:form method="post" modelAttribute="prescription" action="processPrescriptionForm">
		<table style="margin: auto;">
			<%-- <tr>
				<td>Appointment:</td>
				
				 <td><form:radiobutton path="appointment" value="YES"/>Yes
				<form:radiobutton path="appointment" value="NO"/>No</td>
			</tr> --%>
			<tr>
				<td>Medicine:</td>
				<td><form:textarea path="medicine" required="true"/></td>
			</tr>
			<tr>
				<td>Remedy:</td>
				<td><form:textarea path="remedies" required="true"/></td>
				
			</tr>
			<tr>
				<td>Remark:</td>
				<td><form:textarea path="remark" required="true"/></td>
			</tr>
		</table><br>
		<table  align="center">
		<td>
		<input type="submit" value="Submit" "/></td>
		
				<td><input type="reset" value="Reset"  /></td>
				
			
				</table><br><br>
				<center>
				<button onclick="goBack()">Go Back</button>
				</center>
			<script>
			function goBack() {
			    window.history.back();
			}
			</script>
				
		<input type="hidden" name="patientID" value="${patientId}" />
		<input type="hidden" name="doctorID" value="${doctorId}" />
	</form:form>
	</body>
	
<%@ include file = "../patient/footer.jsp" %>
