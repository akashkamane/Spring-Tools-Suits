<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<form action="add">
		User Name =<input type="text" name="Name"><br> 
		User Email =<input type="text" name="Email"><br> 
		User Salary =<input type="text" name="salary"><br> 
		<input type="submit" value="add" name="addEmp"> 
		<input type="submit" value="search" name="search">
	</form>
	
	<br>
	
	
	
	<table style="width:50%">
  <tr>
    <th>Firstname</th>
    <th>Email</th> 
    <th>salary</th>
  </tr>
  <tr>
    <td>${employee.firstName}</td>
    <td>${employee.Email}</td> 
    <td>${employee.SALARY}</td>
  </tr>
  
</table>
	
	Welcome ${employee.firstName},${employee.Email},${employee.SALARY}
	
	

</body>
</html>