<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<h1 style="color: red;">Welcome to Data Page</h1>
		<hr/>
		<a href="locExcelExport">Excel Export</a>&nbsp;&nbsp;&nbsp;
		|&nbsp;&nbsp;&nbsp;<a href="locPdfExport">Pdf Export</a>
		<table
			class=" table table-bordered table-hover table-condensed">
			<tr>
				<th>LocID</th>
				<th>LocName</th>
				<th>LocType</th>
			</tr>

			<c:forEach items="${allLocObj }" var="loc">
				<tr>
					<td><c:out value="${loc.locId}" /></td>
					<td><c:out value="${loc.locName}" /></td>
					<td><c:out value="${loc.locType}" /></td>
					<td><a href="deleteLocation?locId=${loc.locId}">
					<span class="glyphicon glyphicon-trash"></span></a> Delete</td>
					
					<td> <a href="showEditLocation?locId=${loc.locId}">
					<span class="glyphicon glyphicon-pencil"></span></a> Edit</td>
				</tr>

			</c:forEach>
		</table>
		<b><a href="locReg.jsp">Go to Location Registration Page</a> </b> 	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><a href="http://localhost:2017/VendorApplications">Home</a> </h4></b>
		
		
	</div>
</body>
</html>