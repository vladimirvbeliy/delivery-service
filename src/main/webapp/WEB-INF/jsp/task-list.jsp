<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>List of Tasks</title>
</head>

<body>

<c:choose>
	<c:when test="${not empty task}">
		<h4>List of available Tasks</h4>
		<hr>
			<table>
				<tr>
					<th>ID</th>
					<th>Title</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Actions</th>
				</tr>
				
				<c:forEach var="temp" items="${task}">
					<c:url var="infoLink" value="/tasks/info">
						<c:param name="taskId" value="${temp.id}" />
					</c:url>
					<c:url var="deleteLink" value="/tasks/delete">
						<c:param name="taskId" value="${temp.id}" />
					</c:url>

					<tr>
						<td> ${temp.id} </td>
						<td> ${temp.title} </td>
						<td> ${temp.firstName} </td>
						<td> ${temp.lastName} </td>
						<td>
							<a href="${infoLink}">Info</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this task?'))) return false">Delete</a>
						</td>

					</tr>
				</c:forEach>
			</table>
	</c:when>
	<c:otherwise>
		<h2>Good news, Everyone!</h2>
		<h4>No tasks found for today</h4>
		<br>
		<img src="<c:url value="/img/chill-out.png">
					</c:url>" alt = "image" style="width: 25%"/>

	</c:otherwise>
</c:choose>

<br>
<br>

<a href="/">back to Home Page</a>

</body>

</html>









