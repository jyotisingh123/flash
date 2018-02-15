<%-- <%@ page ="com.app.PatientController" %> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file = "/header.jsp" %> 
<body align="center">
<h2 >Register as a Doctor</h2>
<div style="height: 100px; width: 50%; margin:0 auto;">
	<form:form method="post" modelAttribute="newDoctor" class="form-inline">
		<table class="table">
			<tr>
				<td>Name</td>
				<td><form:input path="name" autofocus="true" required="true"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input type="email" path="email" placeholder="abc@gmail" required="true"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" required="true"/></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" value="Male" required="true"/>Male
				<form:radiobutton path="gender" value="Female" required="true"/>Female</td>
			</tr>
			<tr>
				<td>City</td>
				<td>
                  <form:select path = "city">
                     <form:option value = "NONE" label = "Select" required="true"/>
                     <form:options items = "${cityList}" />
                  </form:select>     	
                </td>
			</tr>
			<tr>
				<td>Phone No</td>
				<td><form:input type="number" path="phoneNo" required="true"/></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><form:input type="date" path="dob" required="true"/></td>
			</tr>
			<tr>
				<td>Specialization</td>
				 <td>
                  <form:select path = "specialization">
                     <form:option value = "NONE" label = "Select" required="true"/>
                     <form:options items = "${specialityList}" />
                  </form:select>     	
                </td>
			</tr>
			<tr>
				<td>Max Number of Appointments</td>
				<td><form:input type="number" path="maxAppointments" required="true"/></td>
			</tr>
			<tr>
				<td><input class="btn btn-primary" type="submit" value="Register" /></td>
				<td><input  class="btn btn-primary" type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form:form>
	<h3 align="center"><a href="<c:url value = "/user/register"/>">Register as a Patient</a></h3>
	
	<%@ include file = "../patient/footer.jsp" %>
	</div>
	

