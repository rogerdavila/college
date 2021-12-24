<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Instructors</title>
</head>
<body>
	<div align="center">
		<h2>
			<a href="course">Courses</a>&nbsp;&nbsp;&nbsp;<a
				href="subject">Subjects</a>&nbsp;&nbsp;&nbsp;<a
				href="feedback">Feedbacks</a>
		</h2>

		<h1>Instructors</h1>

		<table>
			<tr>
				<th>Instructor Name<th>
			</tr>
			<c:forEach var="instructor" items="${instructors}">
				<tr>
					<td>${instructor}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>