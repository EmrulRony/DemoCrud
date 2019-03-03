<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Delete Student Information</h1>
<h2>Please insert the student ID to remove</h2>
<form id="DeleteID" action="DeleteServlet" method="post">
<table>
<tr><td>Student ID</td><td><input type="number" id="StudentID" name="StudentID"></td></tr>
</table>
<input type="submit" id="DeleteServlet" value="DeleteRecord">
</form>



</body>
</html>