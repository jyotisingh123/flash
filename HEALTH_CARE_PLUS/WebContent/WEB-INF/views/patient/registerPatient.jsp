
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ include file = "/header.jsp" %> 


<body align="center" >
<h3>Register as a Patient</h3>
<div style="height: 100px; width: 50%; margin:0 auto;">
<form:form method="post" modelAttribute="newUser" class="form-inline">
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
				<td>Address</td>
				<td><form:textarea path="address"/></td>
			</tr>
			<tr>
				<td><input class="btn btn-primary" type="submit" value="Register" /></td>
				<td><input  class="btn btn-primary" type="reset" value="Reset" /></td>
					<td><button class="btn btn-primary" onclick="goBack()">Go Back</button></td>
			</tr>
		</table>
	</form:form>
	<script>
			function goBack() {
			    window.history.back();
			}
			</script>
	<h3 align="center"><a href="doctor/register">Register as a Doctor</a></h3>
<%@ include file = "footer.jsp" %>
</div>
</body>