<%--
  Created by IntelliJ IDEA.
  User: Ricky
  Date: 2023/3/22
  Time: 下午 03:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>INDEX</title>
    <script type="text/javascript">
        const user = {
            name: "秦晨阳",
            age: 30,
            sex: "男"
        };
        // js对象转为json并打印
        console.log(JSON.stringify(user));
        // json转为JS并打印
        console.log(JSON.parse(JSON.stringify(user)));
    </script>
</head>
<body>
</body>
</html>

