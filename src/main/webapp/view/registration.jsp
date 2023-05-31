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
	<form:form action="done" method="POST" modelAttribute="usr">
		<table>
			<tr>
				<td>Id::</td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td>Name::</td>
				<td><form:input path="name" /></td>
			</tr>
				<tr>
				<td>Address::</td>
				<td><form:input path="address" /></td>
			</tr>

			<tr>
				<td>Email::</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>D.O.B::</td>
				<td><form:input path="dob" /></td>
			</tr>
				<tr>
				<td>UserName::</td>
				<td><form:input path="username" /></td>
			</tr>
				<tr>
				<td>Password::</td>
				<td><form:input path="password" /></td>
			</tr>

			
			<tr>
				
				<td><input type="submit" value="Submit" /></td>

			</tr>




		</table>

	</form:form>

</body>
</html>