<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>

<th>first name</th>
<th>last name</th>
<th>email</th>
<th>mobile</th>
<th>source</th>
</tr>
<c:forEach var = "g" items="${k }">
<tr>
<td><a href = "convertId?id=${g.id }">${g.firstName }</a></td>
<td>${g.lastName }</td>
<td>${g.email }</td>
<td>${g.mobile }</td>
<td>${source }</td>
</tr>
</c:forEach>
</table>
</body>
</html>