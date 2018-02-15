<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file = "header.jsp" %> 


<body align="center" background="images/k.jpg">
<h3>Register as a Patient</h3>
<form:form method="post" modelAttribute="newUser">
		<table style="margin: auto;">
			<tr>
				<td>Name</td>
				<td><form:input path="name" autofocus="true" required="true"/></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" placeholder="abc@gmail" required="true"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" required="true"/></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td>M<form:radiobutton path="gender" value="M" required="true"/>
				F<form:radiobutton path="gender" value="F" required="true"/></td>
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
				<td><form:input path="phoneNo" required="true"/></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><form:input type="date" path="dob" required="true"/></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><form:textarea path="address"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
				<td><input type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form:form>
	<h3 align="center"><a href="doctor/register">Register as a Doctor</a></h3>
<%@ include file = "footer.jsp" %>