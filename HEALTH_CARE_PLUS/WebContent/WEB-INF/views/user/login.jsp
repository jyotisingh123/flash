<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


<%@ include file = "/header.jsp" %> 

<body >

<!-- <div class="jumbotron text-center"  style="height: 170px; width: 80%; margin:0 auto;">
  <h1>Login</h1>
  
</div> -->
 
<div class="container" style="height: 170px; width: 30%; margin:0 auto;">
 <!-- <h2>Login</h2>-->
  <form action="login" modelAttribute="person" method="post">
    <div class="form-group">
      <label for="email"> Email: </label>
      <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" autofocus="true">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox" name="remember"> Remember me</label>
    </div>
    <input type="submit"  class="btn btn-primary"  value="Login" />
 &nbsp; &nbsp;<input type="reset" class="btn btn-primary" value="Reset"/>

  </form>

</div><br><br><br>

<%@ include file = "../patient/footer.jsp" %>