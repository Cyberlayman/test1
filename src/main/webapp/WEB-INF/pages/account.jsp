<%--
  Created by IntelliJ IDEA.
  User: dame
  Date: 2020/3/5
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>account</title>
</head>
<body>
成功<br>
<c:forEach items="${users}" var="user">
    ${user.id}
    ${user.name}
    ${user.money}<br>
</c:forEach>
</body>
</html>
