<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="doUpload" method="post" enctype="multipart/form-data">
ID:<input type="text" name="fileId"/>
File:<input type="file" name="fileObj"/>
<input type="submit" value ="upload"/>
</form>
<table>
<c:forEach items="${docList}" var="doc">
<tr>
<td><c:out value="${doc[0] }"/></td>
<td><c:out value="${doc[1] }"/></td>
<td>Download</td>
</tr>

</c:forEach>
</table>
</body>
</html>