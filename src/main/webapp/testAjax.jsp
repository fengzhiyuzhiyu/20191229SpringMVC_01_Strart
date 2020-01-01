<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2020/1/1
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Ajax</title>
<%--    注意，由于js被前端控制器拦截了，所以请求的资源要到spring mvc的配置中修改--%>
    <script src="js/jquery-3.4.1.js"></script>
</head>
<body>

    <button id="btn">发送ajax请求</button>

    <script>
        // 绑定事件
        $(function(){
            $("#btn").click(function(){
                // alert("hello btn");
                // 异步数据
                $.ajax({
                    url:"resp/testAjaxDeal",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"fatcat","age":2}',
                    dataType:"json",
                    type:"POST",
                    success:function(data){
                        // data为服务器响应的json数据，进行解析
                        alert(data)
                        alert(data.username);
                        alert(data.age);
                    }
                });
            });
        });
    </script>

</body>
</html>
