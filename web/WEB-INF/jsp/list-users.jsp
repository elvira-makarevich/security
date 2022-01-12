<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="security"
           uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>List users</title>
</head>
<body>
<table>
    <tr>
        <security:authorize access="hasRole('ADMIN')">
            <th>id</th>
        </security:authorize>
        <th>First name</th>
        <th>Email</th>
    </tr>
    <tr>
        <c:forEach items="${users}" var="user">
    <tr>
        <security:authorize access="hasRole('ADMIN')">
            <td>${user.id}</td>
        </security:authorize>
        <td>${user.firstName}</td>
        <td>${user.email}</td>
    </tr>
    </c:forEach>

</table>
<br><br>
<form:form
        action="${pageContext.request.contextPath}/logout" method="POST">
    <input type="submit"
           value="logout"/>
</form:form>

</body>
</html>
