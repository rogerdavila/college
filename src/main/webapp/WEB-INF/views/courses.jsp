<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Courses</title>
</head>
<body>
	<div align="center">
		<h2>
			<a href="instructor">Instructors</a>&nbsp;&nbsp;&nbsp;<a
				href="subject">Subjects</a>&nbsp;&nbsp;&nbsp;<a href="feedback">Feedbacks</a>
		</h2>
		
		<h1>Courses</h1>
	    <h3><a href="course/add">New course</a></h3>
		
		<table border="1">
			<tr>
				<th>Course No</th>
				<th>Duration</th>
				<th>Start Date</th>
				<th>End Date</th>
				<th>HOD</th>
			</tr>
			<c:forEach var="course" items="${courses}">
				<tr>
					<td>${course.courseno}</td>
					<td>${course.duration}</td>
					<fmt:formatDate value="${course.startDate}" var="startDate" pattern="MM/dd/yyyy"/>
					<td>${startDate}</td>
					<fmt:formatDate value="${course.endDate}" var="endDate" pattern="MM/dd/yyyy"/>
					<td>${endDate}</td>
					<td>${course.hod}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>