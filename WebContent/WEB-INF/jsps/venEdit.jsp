<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
	
</script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
	
</script>
</head>

<body>
 <div class="container">
 <%@include file="master.jsp" %>
	<h1 style="color: graytext;" align="center">Vendor Edit Page</h1>
	<pre>
<form action="updateVendor" method="post">
ID:::<input type="text" name="vId" value="${ven.vId}"/><br>
Name:<input type="text" name="vName" value="${ven.vName}"/><br>
Email:<input type="text" name="email" value="${ven.email}"/><br>
Mobile:<input type="text" name="mobile" value="${ven.mobile}"/><br>
Address:<input type="text" name="address" value="${ven.address}/">


<!-- <input type="submit" value="update" /> -->
	<input type="submit" 
            class="btn btn-primary" value="update"/>
	</pre>
	</form>
	</div>
</body>
</html>