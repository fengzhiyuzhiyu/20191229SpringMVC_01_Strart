<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2019/12/29
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form action="testFormBindingByBeanQuotingImpl" method="get">
            <!-- name属性要和bean的属性一致才能自动封装到bean中 -->
            <label for="u01">User Name:</label>
            <input type="text" name="username" id="u01"><br>
            <label for="p01">Password:</label>
            <input type="password" name="password" id="p01"><br>

            <label for="userusername">user name:</label>
            <input type="text" name="user.username" id="userusername"><br>
            <label for="userage">user age:</label>
            <input type="number" name="user.age" id="userage"><br>

            <input type="submit" value="submit">
        </form>
    </div>
</body>
</html>
