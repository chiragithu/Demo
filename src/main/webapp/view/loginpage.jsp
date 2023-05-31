<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="login" method="POST" modelAttribute="admin">
		<table>
		
				<tr>
				<td>UserName::</td>
				<td><form:input path="username" /></td>
			</tr>
				<tr>
				<td>Password::</td>
				<td><form:input path="password" /></td>
			</tr>

			
			<tr>
				
				<td><input type="submit" value="LogIn" /></td>

			</tr>




		</table>

	</form:form>

</body>
</html>