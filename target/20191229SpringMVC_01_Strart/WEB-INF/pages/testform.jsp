<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2019/12/29
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/structure.css">
</head>
<body>
    <form class="box login" action="testFormBindingByBeanImpl">
        <fieldset class="boxBody">
            <label>Username</label>
            <input type="text" tabindex="1" placeholder="Please input your name?" required name="username">
            <label><a href="#" class="rLink" tabindex="6">Forget your password?</a>Password</label>
            <input type="password" tabindex="3" required name="password">
        </fieldset>

        <footer>
            <label><input type="checkbox" tabindex="4">Keep me logged in</label>
            <input type="submit" class="btnLogin" value="Login" tabindex="5">
        </footer>
    </form>
</body>
</html>
