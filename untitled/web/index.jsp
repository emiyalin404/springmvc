<%--
  Created by IntelliJ IDEA.
  User: Ricky
  Date: 2023/3/24
  Time: 下午 02:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/register" method="post">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="text" name="password">
    <input type="submit">
  </form>

  </body>
</html>
