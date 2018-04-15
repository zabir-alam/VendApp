<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<h1 style="color:red;",align="center">Location Registration Page</h1>
${msg}<br/>

<pre>
<form action="insert" method="post">
LocID:::<input type="text" name="locId"/><br>
LocName:<input type="text" name="locName"/><br>
LocType::<input type="radio" name="locType" value="rural"/>Rural <input type="radio" name="locType" value="urban"/>Urban
              
<!-- <input type="submit" value="insert"/> -->
<input type="submit" 
             class="btn btn-danger" value="insert" />    <a href="viewLocationDetails">View All Locations</a>

</form>

</pre>



</div>
</body>
</html>