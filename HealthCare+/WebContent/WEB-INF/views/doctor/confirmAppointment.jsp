<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">

<form:form method="post" action="confirmAppointment" modelAttribute="appointments">
<h1>Appointment Details</h1>
Date: <form:input type="date" path="apointmentDate" required="true"/><br><br>
Time: <form:input type="time" path="appointmentTime" required="true"/><br><br>
<form:hidden  path="doctorEmail" value="${doctorId}"/>
<form:hidden  path="userName" value="${patientId}"/>

<input type="submit" name="btn" value="Confirm">


</form:form>
</body>
</html>