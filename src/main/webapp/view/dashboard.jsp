<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="add" method="POST" modelAttribute="admin">
		<h1>Add Task</h1>
		<table>
			<tr>
				<td>Id</td>
				<td><form:input path="id" /></td>
			</tr>

			<tr>
				<td>Description</td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td>Attachment</td>
				<td><form:input path="attachment" /></td>
			</tr>

			<tr>
				<td>Add Attachment</td>
				<td><form:input path="Add Attachment" /></td>
			</tr>



			<tr>

				<td><input type="submit" value="Submit" /></td>

			</tr>


		</table>

	</form:form>
	
	
	<form>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Description</th>
                    <th>Attachment</th>
                    <th>Add Attachment</th>
                    
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${tasks}" var="entity">
                    <tr>
                        <td>${entity.id}</td>
                        <td>${entity.description}</td>
                        <td>${entity.addAttachment}</td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </form>

</body>
</html>