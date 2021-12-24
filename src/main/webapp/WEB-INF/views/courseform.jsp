<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Create course</title>
</head>
<body>
	<div align="center">
		<h1>Create Course</h1>
		<form:form action="save" method="post" modelAttribute="course">
			<table>
				<tr>
					<td>Course No:</td>
					<td><form:input path="courseno" readOnly="true"/></td>
				</tr>
				<tr>
					<td>duration:</td>
					<td><form:input path="duration" type="number" step="1"/></td>
				</tr>
				<tr>
					<td>Start Date:</td>
					<td><form:input type="date" path="startDate" class= "date" name = "startDate" /></td>
				</tr>
				<tr>
					<td>End Date:</td>
					<td><form:input type="date" path="endDate" class= "date" name = "endDate"/></td>
				</tr>
				<tr>
					<td>HOD:</td>
					<td><form:input path="hod"/></td>
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