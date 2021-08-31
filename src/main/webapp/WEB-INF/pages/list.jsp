<%--
  Created by IntelliJ IDEA.
  User: zxx
  Date: 2021/8/31
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    <c:forEach items="${accounts}" var="account">
        ${account.name}
    </c:forEach>
</body>
</html>
