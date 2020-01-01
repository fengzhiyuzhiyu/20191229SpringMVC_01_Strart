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
    <br>
<%--    注意此处配置路径的时候前面不能加'/',加了等于到tomcat根目录查找项目--%>
    <p>数据封装的方式</p>
    <a href="modular/testController">1. 入门案例</a><br>
    <a href="modular/bindingParamter?name=root&password=123456">2. 带参数的请求案例</a><br>
    <a href="modular/testFormBindingByBean">3. 带参数的请求案例-bean包装</a><br>
    <a href="modular/testFormBindingByBeanQuoting">4. 带参数的请求案例-bean引用包装</a><br>
    <a href="modular/testFormBindingByBeanCustomize">5. 自定义数据转换</a><br>
    <a href="modular/testServlet">6. 获取原生Servlet API</a><br>

    <br>
    <P>提供关于域对象的操作的方法</P>
    <a href="anno/testrequestparam01">7. 表单属性name与bean中属性不一致，可以用Request Parameter注解配置</a><br>
    <a href="anno/testrequestparam01">8. Request Param body注解配置,只能post</a><br>
    <a href="anno/testpathvariables/10086">9. PathVariable注解,restful风格</a><br>
    <a href="anno/testrequestheader">10. 测试@request Header,返回特定的返回头而非全部</a><br>
    <a href="anno/testCookieValue">11. 测试@CookieValue</a><br>
    <a href="anno/testModelAttr">12. 测试@testModelAttr,在控制器类中的方法添加了改注解会优先运行</a><br>

    <br>
    <P>使用model类及其实现类进行数据操作</P>
    <a href="anno/testSaveSession">13. 存储数据到session域对象</a><br>
    <a href="anno/testGetSession">13. 获取数据从session域对象</a><br>
    <a href="anno/testdelSession">13. 删除数据在session域对象</a><br>

    <br>
    <p>request进行转发,response进行重定向</p>
    <a href="resp/testReturnData">14. 响应返回数据:request.setAttribute</a><br>
    <a href="resp/testCustomizeDispatcher">15. 测试手动转发:requestDispatcher.forward</a><br>
    <a href="resp/testRedirect">16. 测试重定向:response.sendRedirect</a><br>
    <a href="resp/testDirectRespose">17. 测试直接响应:response.getWriter().print</a><br>
    <a href="resp/testModelAndView">18. 使用Model and View进行对象响应:modelAndView.setViewName(resp)</a><br>
    <a href="resp/testKeywordForward">19. 测试关键字转发forward:/WEB-INF/pages/resp.jsp</a><br>
    <a href="resp/testKeywordRedirect">20. 测试关键字重定向:redirect:/index.jsp</a><br>

    <br>
    <p>异步请求</p>
    <a href="testAjax.jsp">21. 测试异步</a><br>

    <br>
    <p>上传文件</p>
    <a href="fileupload.jsp">22. 文件上传</a><br>
</body>
</html>
