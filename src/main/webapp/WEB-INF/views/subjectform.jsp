<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Subject</title>
</head>
<body>
	<div align="center">
		<h1>Create Subject</h1>
		<form:form action="save" method="post" modelAttribute="subject">
			<table>
				<tr>
					<td>Subject Id:</td>
					<td><form:input path="subjectId" type="number" step="1" readOnly="true"/></td>
				</tr>
				<tr>
					<td>Year:</td>
					<td><form:input path="year" type="number" step="1"/></td>
				</tr>
				<tr>
					<td>Instructor:</td>
					<td><form:input path="instructor"/></td>
				</tr>
				<tr>
					<td>Subject:</td>
					<td><form:input path="subject"/></td>
				</tr>
				<tr>
					<td>Theory:</td>
					<td><form:input path="theory" type="number" step="1"/></td>
				</tr>
				<tr>
					<td>Practical:</td>
					<td><form:input path="practical" type="number" step="1"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Submit"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>