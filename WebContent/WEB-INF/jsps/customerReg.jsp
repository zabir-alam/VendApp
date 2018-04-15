<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js">
	
</script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
	
</script>
</head>
<%-- <body>
<div class="container">
<h1 style="color: Red",align="center">Vendor Registration Page</h1>

<h3 style="color:lightgreen">${message}</h3><br>
<pre>
<form action="insertVendor" method="post">
ID:::<input type="text" name="vId"/><br>
Name:<input type="text" name="vName"/><br>
Email:<input type="text" name="email"/><br>
Mobile:<input type="text" name="mobile"/><br>
Address:<input type="text" name="address"/> --%>
 
<body>
 <div class="container">
 
 <div class="panel panel-default">
 <div class="panel panel-heading">
 <%@include file="master.jsp" %>
 <h3 style="color:green">Welcome to Customer Register page </h3></div>
 <h2 style="color: Blue">${message}<br/></h2>
 
 <div class="panel-body">
 <form class="form-horizontal" action="insertCustomer" method="post">
 <div class="form-group">
 <label class="control-label col-sm-3" for ="custId">
Customer_Id</label>
 <div class="col-sm-5">
 <div class="input-group">
 <span class="input-group-addon">123</span>
 <input type="text" name="custId" id="custId" class="form-control" placeholder="Enter Customer Id"/>
 </div>
 </div>
 </div>
 
 
  <div class="panel-body">
 <form class="form-horizontal">
 <div class="form-group">
 <label class="control-label col-sm-3" for ="cName">
Customer_Name</label>
 <div class="col-sm-5">
 <div class="input-group">
 <span class="input-group-addon">Abc</span>
 <input type="text" name="cName" id="cName" class="form-control" placeholder="Enter Customer Name"/>
 </div>
 </div>
 </div> 
 
 
 
 <div class="panel-body">
 <form class="form-horizontal">
 <div class="form-group">
 <label class="control-label col-sm-3" for ="email">
Email</label>
 <div class="col-sm-5">
 <div class="input-group">
 <span class="input-group-addon">a@b</span>
 <input type="text" name="eMail" id="eMail" class="form-control" placeholder="Enter Email_Id"/>
 </div>
 </div>
 </div> 
 
  <div class="panel-body">
 <form class="form-horizontal">
 <div class="form-group">
 <label class="control-label col-sm-3" for ="cType">
Customer Type </label>
 <div class="col-sm-5">
 <div class="input-group">
 <span class="input-group-addon">Abc</span>
 <input type="text" name="cType" id="cType" class="form-control" placeholder="Enter customer Type"/>
 </div>
 </div>
 </div>
 
  <div class="panel-body">
 <form class="form-horizontal">
 <div class="form-group">
 <label class="control-label col-sm-3" for ="cAddr">
Customer Address </label>
 <div class="col-sm-5">
 <div class="input-group">
 <span class="input-group-addon">A@1</span>
 <input type="text" name="cAddr" id="cAddr" class="form-control" placeholder="Enter password"/>
 </div>
 </div>
 </div>
 
 
 
 <div class="panel-body">
 <form class="form-horizontal">
 <div class="form-group">
 <label class="control-label col-sm-3" for ="location">
Location:</label>:<select name="loc.locId">
 				<option value="-1">--select--</option>
 				<c:forEach items="${locList}" var="loc" >
 				<option value="${loc.locId}"><c:out value="${loc.locName}"/>
 				</option>
 				</c:forEach>
 </select>
 <div class="col-sm-5">
 <div class="input-group">
   </div>
 </div>
 </div> 
 <%-- Location:<select name="loc.locId">
 				<option value="-1">--select--</option>
 				<c:forEach items="${locList}" var="loc" >
 				<option value="${loc.locId}"><c:out value="${loc.locName}"/>
 				</option>
 				</c:forEach>
 </select> --%>
 
 
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" 
             class="btn btn-danger"  value="save Customer Details" />  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="viewAllCustomer">View All Customer</a>
 </form>
 </div>
 </div>
 </div>
 </body>
 </html>



<!-- <input type="submit" 
             class="btn btn-danger" value="save Vendor Details" />   <h3><a href="viewAllVendor">View All Vendors</a></h3> -->


</form>
</pre>
</div>
</body>
</html>