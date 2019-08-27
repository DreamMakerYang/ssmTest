<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    测试成功<br>

    <c:forEach items="${Account}" var="account" >
        ${account.toString()}<br>
    </c:forEach>
</body>
</html>
