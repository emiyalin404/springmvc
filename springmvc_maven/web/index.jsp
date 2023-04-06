<%--
  Created by IntelliJ IDEA.
  User: Ricky
  Date: 2023/3/23
  Time: 下午 04:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>

    <script type="text/javascript">
      const user = {
        name: "秦晨阳",
        age: 30,
        sex: "男"
      };
    console.log(user)
      console.log(JSON.stringify(user))
      console.log(JSON.parse(JSON.stringify(user)))
    </script>

  </head>
  <body>
  <form action="${pageContext.request.contextPath}/hello" method="post">

    <input type="text" name="id">
    <input type="text" name="name">
    <input type="text" name="age">
    <input type="text" name="sex">
    <input type="submit">
  </form>
  </body>
</html>
