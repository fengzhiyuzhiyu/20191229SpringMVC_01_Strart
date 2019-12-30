<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2019/12/29
  Time: 18:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form action="testCustomizeDateType" method="get">
            <!-- name属性要和bean的属性一致才能自动封装到bean中 -->
            <label for="d01">输入yyyy-MM-dd类型的日期数据:</label>
            <input type="text" name="date" id="d01"><br>
            <input type="submit" value="submit">
        </form>
    </div>
</body>
</html>
