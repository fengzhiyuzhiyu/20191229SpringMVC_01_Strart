<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2019/12/29
  Time: 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Index</title>
</head>
<body>
    <h1>Some solid cases of spring MVC</h1>
    <p>测试中文</p>
<%--    注意此处配置路径的时候前面不能加'/',加了等于到tomcat根目录查找项目--%>
    <a href="modular/testController">1. 入门案例</a><br>
    <a href="modular/bindingParamter?name=root&password=123456">2. 带参数的请求案例</a><br>
    <a href="modular/testFormBindingByBean">3. 带参数的请求案例-bean包装</a><br>
    <a href="modular/testFormBindingByBeanQuoting">4. 带参数的请求案例-bean引用包装</a><br>
    <a href="modular/testFormBindingByBeanCustomize">5. 自定义数据转换</a><br>
    <a href="modular/testServlet">6. 获取原生Servlet API</a><br>

    <br>
    <a href="anno/testrequestparam01">7. 表单属性name与bean中属性不一致，可以用Request Parameter注解配置</a><br>
    <a href="anno/testrequestparam01">8. Request Param body注解配置,只能post</a><br>
    <a href="anno/testpathvariables/10086">9. PathVariable注解,restful风格</a><br>
    <a href="anno/testrequestheader">10. 测试@request Header,返回特定的返回头而非全部</a><br>
    <a href="anno/testCookieValue">11. 测试@CookieValue</a><br>
    <a href="anno/testModelAttr">12. 测试@testModelAttr,在控制器类中的方法添加了改注解会优先运行</a><br>

    <br>
    <a href="anno/testSaveSession">13. 存储数据到session域对象</a><br>
    <a href="anno/testGetSession">13. 获取数据从session域对象</a><br>
    <a href="anno/testdelSession">13. 删除数据在session域对象</a><br>

    <br>
    <a href="resp/testReturnData">14. 响应返回数据</a><br>
    <a href="resp/testCustomizeDispatcher">15. 测试手动转发</a><br>
</body>
</html>
