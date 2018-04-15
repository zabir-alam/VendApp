<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
		<h1 style="color: red;">Welcome to Vendor Data Page</h1>
<a href="venExcelExport">ExcelExport</a>|<a href="venPdfExport">PdfExport</a>
		<table
			class=" table table-bordered table-hover table-condensed">
  <tr>
    <th>Cust_Id</th><th>Cust_Name</th><th>Email</th><th>Type</th><th>Pwd</th>
 
 </tr>
 
  <c:forEach items="${customerList}" var="cust">
  
  <tr>
  <td><c:out value="${cust.custId}"/></td>
  <td><c:out value="${cust.cName}"/></td>
   <td><c:out value="${cust.eMail}"/></td>
  <td><c:out value="${cust.cType}"/></td>
  <td><c:out value="${cust.cAddr}"/></td>
  <td><c:out value="${cust.pwd}"/></td>
  <td><c:out value="${cust.accTocken}"/></td>
  
  <td><a href="deleteVendor?vId=${ven.vId}">
					<span class="glyphicon glyphicon-trash"></span></a> Delete&nbsp;&nbsp;</td>	
		<td> <a href="showEditVendor?vId=${ven.vId}"><span class="glyphicon glyphicon-pencil"></span></a>&nbsp;&nbsp;Edit</td>
  
   </tr>
   
  </c:forEach>
 
</table>

<a href="regCustomer.jsp">Customer Registraion Page</a>
</body>
</html>