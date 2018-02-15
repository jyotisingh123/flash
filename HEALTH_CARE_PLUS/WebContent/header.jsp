<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>HealthCare+</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
     
    <img src="${pageContext.request.contextPath}/resources/images/img.jpeg" width="280" height="83" alt="HealthCarePlus" />  
         
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
     
     <form class="navbar-form navbar-right" action="/action_page.php">
  		<div class="input-group">
  			
    	<input type="text" class="form-control" placeholder="Search">	
    	<div class="input-group-btn">
      		<button class="btn btn-default" type="submit">
        	<i class="glyphicon glyphicon-search"></i>
      	</button>
    	</div>
  		</div>
	</form>	
     	
      <ul class="nav navbar-nav navbar-right">
        <li><a href="user/about">About Us</a></li>
        <li><a href="user/login">Login</a></li>
        <li><a href="user/register">Register</a></li>
      </ul>
    </div> 
  </div>
</nav>

