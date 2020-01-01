<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2020/1/1
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>file upload</title>
</head>
<body>


    <%--
        form表单提交文件有几个需要被满足的条件:
            1. method只能为post,否则会被解析为键值对
            2. enctype默认为"application/x-www-form-urlencoded",需要修改为"multipart/form-data"
            3. input type="file"必须存在
    --%>
    <h3>common-fileupload组件上传</h3>
    <form action="upload/testUploadOriginalMethod" method="post" enctype="multipart/form-data">
        <label for="input01">上传文件：</label>
        <input type="file" name="uploadFile" id="input01"/><br>
        <label for="input02">点击提交：</label>
        <input type="submit" name="submit" value="upload" id="input02"/>
    </form>

    <hr>
    <h3>SpringMVC上传(需要配置组件)</h3>
    <form action="upload/testUploadSpringMethod" method="post" enctype="multipart/form-data">
        <label for="input03">上传文件：</label>
        <input type="file" name="uploadFile" id="input03"/><br><%-- 注意此处name的值与后台的值要一致 --%>
        <label for="input04">点击提交：</label>
        <input type="submit" name="submit" value="upload" id="input04"/>
    </form>

</body>
</html>
