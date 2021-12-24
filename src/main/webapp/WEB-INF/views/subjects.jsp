<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Subjects</title>
</head>
<body>
	<div align="center">
		<h2>
			<a href="course">Courses</a>&nbsp;&nbsp;&nbsp;<a
				href="instructor">Instructors</a>&nbsp;&nbsp;&nbsp;<a
				href="feedback">Feedbacks</a>
		</h2>
		
		<h1>Subjects</h1>
	    <h3><a href="subject/add">New subject</a></h3>
		
		<table border="1">
			<tr>
				<th>Subject Id</th>
				<th>Year</th>
				<th>Instructor</th>
				<th>Subject</th>
				<th>Theory</th>
				<th>Practical</th>
			</tr>
			<c:forEach var="subject" items="${subjects}">
				<tr>
					<td>${subject.subjectId}</td>
					<td>${subject.year}</td>
					<td>${subject.instructor}</td>
					<td>${subject.subject}</td>
					<td>${subject.theory}</td>
					<td>${subject.practical}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>