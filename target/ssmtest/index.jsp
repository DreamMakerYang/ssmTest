<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/account/findAll">测试SpringMVC</a><br>

    <form action="/account/save" method="post">
        账户名：<input type="text" name="name"><br>
        金额：<input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>

</body>
</html>
