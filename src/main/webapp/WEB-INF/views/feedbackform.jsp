<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Feedback</title>
</head>
<body>
	<div align="center">
		<h1>Create Feedback</h1>
		<form:form action="save" method="post" modelAttribute="feedback">
			<table>
				<tr>
					<td>Feedback Id:</td>
					<td><form:input path="fid" /></td>
				</tr>
				<tr>
					<td>Student Name:</td>
					<td><form:input path="studentName" /></td>
				</tr>
				<tr>
					<td>Instructor:</td>
					<td><form:input path="instructor" /></td>
				</tr>
				<tr>
					<td>Subject:</td>
					<td><form:input path="subject" /></td>
				</tr>
				<tr>
					<td>FbValue:</td>
					<td><form:input path="fbValue" /></td>
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