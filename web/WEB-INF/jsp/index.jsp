<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="security"
           uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Main page</title>
</head>
<body>

<c:url var="users" value="/users"> </c:url>
<a href="${users}">View users</a>
<br>
<br>
<security:authorize access="hasRole('ANONYMOUS')">
    <form action="${pageContext.request.contextPath}/showLoginPage"
          method="GET">

        <input type="submit"
               value="login"/>

    </form>
</security:authorize>
<br>
<br>
<security:authorize access="hasRole('ADMIN') or hasRole('USER')">
    <form:form
            action="${pageContext.request.contextPath}/logout" method="POST">
        <input type="submit"
               value="logout"/>
    </form:form>
</security:authorize>

</body>
</html>
