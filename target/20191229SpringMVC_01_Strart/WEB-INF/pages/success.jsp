<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2019/12/29
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%-- 注意配置显示El表达式 --%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    <h3>清平调</h3>
    <h4>李白</h4>
    <p>云想衣裳花想容</p>
    <p>春风拂槛露华浓</p>
    <p>若非群玉山头见</p>
    <p>会向瑶台月下逢。</p>
</div>

<p>显示requestScope.sessionKey</p>
${ requestScope.sessionKey }
<p>显示sessionScope.sessionKey</p>
${ sessionScope}

</body>
</html>
