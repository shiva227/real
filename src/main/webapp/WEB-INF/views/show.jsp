<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
id : ${k.id }<br/>
first name : ${k.firstName }<br/>
last name : ${k.lastName }<br/>
email : ${k.email }<br/>
mobile : ${k.mobile }<br/>
source : ${k.source }<br/>
<form action="convert" method="post">
<input type = "hidden" name = "id" value = "${k.id }"/>
<input type = "submit" value = "convert"/>
</form>
</body>
</html>