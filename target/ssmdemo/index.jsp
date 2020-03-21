<%--
  Created by IntelliJ IDEA.
  User: dame
  Date: 2020/3/5
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<a href="account/selectAll">Test</a><br>

<form action="account/save" method="post">
    name:<input type="text" name="name"/><br>
    money:<input type="text" name="money"/><br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
