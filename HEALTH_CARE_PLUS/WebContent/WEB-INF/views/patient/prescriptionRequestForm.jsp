<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file = "/header.jsp" %> 
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
<title>Insert title here</title>
</head>

<body align="center">
<h1>Prescription Form</h1><br>
<h3>Write Your Medical Issues Here To Get Prescription</h3>


<form action="submitDetailsForPrescription" method="post">

<input type="hidden" name="doctorId" value='${doctorId}' />
 <input type="hidden" name="patientId" value='${patientId}' /> 
<textarea rows="10" cols="70" id="prescription" name="prescriptionText" required="true"></textarea><br><br><br>
<input class="btn btn-primary" type ="submit" value="Submit">
</form>
</body>
</html>
<%@ include file = "../patient/footer.jsp" %>
