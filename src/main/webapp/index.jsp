<%--
  Created by IntelliJ IDEA.
  User: zxx
  Date: 2021/8/31
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <a href="account/test">测试查询</a>

    <h1>测试保存</h1>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name">
        金额：<input type="text" name="money">
        <input type="submit" value="保存">
    </form>
</body>
</html>
