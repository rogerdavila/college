<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Feedbacks</title>
</head>
<body>
	<div align="center">
		<h2>
			<a href="instructor">Instructors</a>&nbsp;&nbsp;&nbsp;<a
				href="course">Courses</a>&nbsp;&nbsp;&nbsp;<a href="subject">Subjects</a>
		</h2>
		
		<h1>Feedbacks</h1>
	    <h3><a href="feedback/add">New feedback</a></h3>
		
		<table border="1">
			<tr>
				<th>Feedback Id</th>
				<th>Student Name</th>
				<th>Instructor</th>
				<th>Subject</th>
				<th>FbValue</th>
			</tr>
			<c:forEach var="feedback" items="${feedbacks}">
				<tr>
					<td>${feedback.fid}</td>
					<td>${feedback.studentName}</td>
					<td>${feedback.instructor}</td>
					<td>${feedback.subject}</td>
					<td>${feedback.fbValue}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>