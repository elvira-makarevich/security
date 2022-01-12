<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form:form
        action="${pageContext.request.contextPath}/authenticateTheUser"
        method="POST">

    <c:if test="${not empty param.error}">
			<span style="color: red; font-size: 17px;"> Invalid data! Try again
			</span>
    </c:if>


    <p>
        <input type="text"
               placeholder="email"
               name="username"/><br>
        <form:errors path="userName" cssClass="error"/>
    </p>

    <p>
        <input type="password"
               placeholder="password"
               name="password"/><br>
        <form:errors path="password" cssClass="error"/>
    </p>

    <br>
    <div style="margin-top: 10px">
        <input type="submit"
               value="submit"/>
    </div>
</form:form>

</body>
</html>

</body>
</html>
