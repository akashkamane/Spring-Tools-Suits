<%@ page import="java.util.*, com.demo.mvc.bean.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<td>
		<tr>
			<td>
				<form name="Search" method="get" action="search">

					<table>
						<caption>Find User</caption>
						<tr>
						<tr>
							<td>
								<button name="Abovebutton" type="button">Above</button> User =<input
								type="text" name="Name">
								<button name="Belowbutton" type="button" >Below</button>
								
						</tr>
					</table>

				</form>


			</td>
		</tr>
	</table>
	<table style="width:50%">
	
  <tr>
    <th>Firstname</th>
    <th>Email</th> 
    <th>salary</th>
  </tr>
  <%

if(session.getAttribute("Employee")==null){
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
	response.sendRedirect("cart.jsp");
%>
<%} %>
<%
Vector v=(Vector) request.getAttribute("Employee");
Iterator it=v.iterator();
while(it.hasNext()){
	Employee Emp=(Employee)it.next();
	%>
  <tr>
    <td><%= Emp.getFirstName()%></td>
    <td><%= Emp.getEmail()%></td> 
    <td><%= Emp.getSALARY()%></td>
  </tr>
  <%} %>
</table>
</body>
</html>