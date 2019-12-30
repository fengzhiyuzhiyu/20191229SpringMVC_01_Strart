<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2019/12/29
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <div>
        <h3>Testing Requestparam</h3>
        <form action="testRequestparamImpl" method="get">
            <!-- name属性要和bean的属性一致才能自动封装到bean中 -->
            <label for="u01">User Name:</label>
            <input type="text" name="unfix_name" id="u01"><br>
            <input type="submit" value="submit">
        </form>
    </div>

    <hr>

    <div>
        <h3>Testing Requestbody</h3>
        <form action="testRequestBodyImpl" method="post">
            <label for="u02">User Name:</label>
            <input type="text" name="username" id="u02"><br>
            <label for="p02">Password:</label>
            <input type="text" name="password" id="p02"><br>
            <input type="submit" value="submit">
        </form>
    </div>

</body>
</html>
