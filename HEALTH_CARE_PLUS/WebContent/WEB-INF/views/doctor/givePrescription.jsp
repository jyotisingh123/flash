<%-- <%@ page ="com.app.PatientController" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file = "/header.jsp" %> 

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
<div style="height: 100px; width: 50%; margin:0 auto;">
<form:form method="post" modelAttribute="prescription" action="processPrescriptionForm">
		<table class="table">
			
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
			<tr>
			<td><input type="submit" value="Submit" class="btn btn-primary"/></td>
			<td><input type="reset" value="Reset"  class="btn btn-primary" /></td>
			<td><button class="btn btn-primary" onclick="goBack()">Go Back</button></td>
			</tr>
		</table><br>
		
				<!-- <center>
				<button class="btn btn-primary" onclick="goBack()">Go Back</button>
				</center> -->
			<script>
			function goBack() {
			    window.history.back();
			}
			</script>
				
		<input type="hidden" name="patientID" value="${patientId}" />
		<input type="hidden" name="doctorID" value="${doctorId}" />
	</form:form>
	<%@ include file = "../patient/footer.jsp" %>
	</div>
	</body>
	

