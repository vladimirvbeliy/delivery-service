<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<img src="<c:url value="/img/futurama.png">
					</c:url>" alt = "image" style="width: 25%"/>

<h3>WELCOME TO PLANET EXPRESS</h3>
<h4>fastest delivery service in Y3K</h4>
<h5>but not for sure</h5>

<hr>

<a href="${pageContext.request.contextPath}/api/tasks">All Tasks JSON</a>

<br>
<br>

<a href="${pageContext.request.contextPath}/tasks/list">Show Tasks Table</a>

</body>
</html>