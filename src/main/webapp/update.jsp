<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Please insert Student information</h1>
<form id="insert" action="UpdateServlet" method="post">
<table>
<tr><td>Student ID</td><td><input type="number" id="StudentID" name="StudentID"></td></tr>
<tr><td>Student Name</td><td><input type="text" id="StudentName" name="StudentName"></td></tr>
<tr><td>Student Phone</td><td><input type="number" id="StudentNumber" name="StudentNumber"></td></tr>
<tr><td>CGPA</td><td><input type="number" id="CGPA" name="CGPA"></td></tr>
<tr><td>Date of Birth</td><td><input type="date" id="DOB" name="DOB"></td></tr>
</table>

<input type="submit" id="CreateRecord" value="Create Record">
</form>

</body>
</html>