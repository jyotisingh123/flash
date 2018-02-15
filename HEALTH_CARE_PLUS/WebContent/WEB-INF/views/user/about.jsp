<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file = "/header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body align="center">
<div class="table" style="height: 400
px; width: 80%; margin:0 auto;">
<h2>For millions of people, HealthcarePlus is the trusted and familiar home where they know they’ all find a healing touch. 
It connects them with everything they need to take good care of themselves and their family - 
assessing health issues, finding the right doctor, booking diagnostic tests, obtaining medicines, 
storing health records or learning new ways to live healthier.</h2>	
</div>
<button class="btn btn-primary" onclick="goBack()">Go Back</button>

<script>
			function goBack() {
			    window.history.back();
			}
			</script>
</body>
</html>
<%@ include file = "../patient/footer.jsp" %>