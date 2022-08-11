<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add report</title>

    <style>
        .flex-container {
            display: flex;
            flex-direction: column;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>
<h1>Add report</h1>
<form:form method="post">
    <div class="flex-container">
        <span>Producer:<form:input path="producer"/></span><form:errors path="producer" cssClass="error"/>
        <span>Model: <form:input path="model"/></span><form:errors path="model" cssClass="error"/>
        <span>Description: <form:input path="description"/></span><form:errors path="description" cssClass="error"/>
    </div>
    <input type="submit" value="Add report">
</form:form>
</body>
</html>
