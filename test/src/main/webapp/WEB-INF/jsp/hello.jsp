<%--
  Created by IntelliJ IDEA.
  User: Ricky
  Date: 2023/3/22
  Time: 下午 03:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Title</title>
</head>
<body>
<h1>User Info</h1>
<p>ID: ${user.name}</p>
<p>Name: ${name}</p>
<h1 style="color: red" th:text="${name}"></h1>
<p>Age: ${{user.name}}</p>
<h1>${message}</h1>
</body>
<script>

</script>
</html>
