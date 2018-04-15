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
	<h1 style="color: green" align="center">Location Edit Page</h1>
	<pre>
<form action="updateLoc" method="post">
LocID  ::<input type="text" name="locId" value="${locObj.locId}"
				readonly="readonly" /><br>
LocName::<input type="text" name="locName" value="${locObj.locName}" />
<c:choose>
        <c:when test="${locObj.locType eq 'urban'}">
LocType::  <input type="radio" name="locType" value="rural" />Rural          <input type="radio" name="locType" value="urban"
						checked="checked" />Urban              
         </c:when>         
              <c:otherwise>
LocType::<input type="radio" name="locType" value="rural"
						checked="checked" />Rural<input type="radio" name="locType" value="urban" />Urban
              
              </c:otherwise>
</c:choose>
<!-- <input type="submit" value="update" /> -->
	<input type="submit" 
            class="btn btn-primary" value="update"/>
	</pre>
	</form>
	</div>
</body>
</html>