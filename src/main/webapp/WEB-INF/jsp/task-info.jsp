<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Task Info</title>
</head>
<body>

<img src="<c:url value="/img/ready.jpg">
					</c:url>" alt = "image" style="width: 15%"/>

<h2>Task Info</h2>
<h3>Task id:  ${task.id}</h3>
<h4>Customer: </h4>${task.title}  ${task.firstName}  ${task.lastName}
<br>
<h4>Scheduled Date: </h4> ${task.scheduledDate}
<c:choose>
    <c:when test="${not empty task.notes}">
        <h4>Notes:</h4>
        <p>${task.notes}</p>
    </c:when>
    <c:otherwise>
        <h4>No Special Notes for this Task</h4>
    </c:otherwise>
</c:choose>
<hr>
<h3>Task Address:</h3>
<h4>Address Line 1:  </h4>${address.address1}
<c:choose>
    <c:when test="${not empty address.address2}">
        <h4>Address Line 2:  </h4>
        <p>${task.notes}</p>
    </c:when>
</c:choose>
<h4>Town:  </h4>${address.town}
<h4>Country:  </h4>${address.country}
<h4>Postal Code:  </h4>${address.postCode}
<hr>
<a href="<spring:url value="${pageContext.request.contextPath}/tasks/list" />">back to Tasks List</a>

</body>
</html>
