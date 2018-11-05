<%--
  Created by IntelliJ IDEA.
  User: m.biryukov
  Date: 24.10.2018
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Anyuser page</title>
</head>
<body>
${role}
<a href="/static/j_spring_security_logout">Выйти</a>
</body>
</html>
