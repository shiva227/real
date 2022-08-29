<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "save" method = "post">
<pre>
first name : <input type ="text" name = "firstName"/>
last name : <input type ="text" name = "lastName" />
email : <input type ="text" name = "email"/>
mobile : <input type ="text" name = "mobile"/>
source : <select name = "source">

<option value = "news">news</option>
<option value = "tv">tv</option>
<option value = "net">net</option>
<option value = "friends">friends</option>
</select>
<input type = "submit" value = "save"/>
</pre>
</form>
</body>
</html>