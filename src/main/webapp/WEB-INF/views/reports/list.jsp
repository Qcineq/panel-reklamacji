<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>All reports</title>
</head>
<body>
<sec:authorize access="isAuthenticated()">
    Jesteś zalogowany jako: <sec:authentication property="principal.username"/>
</sec:authorize>

<sec:authorize access="isAuthenticated()">
    <form action="/logout" method="post">
        <input class="fa fa-id-badge" type="submit" value="Wyloguj">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>
</sec:authorize>

<table>
    <tr>
        <th>Lp.</th>
        <th>Producer</th>
        <th>Model</th>
        <th>Description</th>
    </tr>
    <c:forEach items="${reports}" var="report">
        <tr>
            <td>${report.id}</td>
            <td>${report.title}</td>
            <td>${report.rating}</td>
            <td>${report.description}</td>
            </td>
            <td><a href="edit?id=${report.id}">Edit</a></td>
            <td><a href="remove?id=${report.id}" onclick="return confirm('Are you sure?')">Remove</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
