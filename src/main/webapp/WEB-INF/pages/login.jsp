<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="./header.jsp"%>
    <link href="http://bootstrap-3.ru/examples/signin/signin.css" rel="stylesheet">
    <title>Пожалуйста, войдите</title>

</head>

<body>

<div class="container">

    <form class="form-signin" role="form" action="/j_username_security_check" method="post">
        <c:if test="${not empty loginError}">
            <H3>Неверный логин, или пароль</H3>
        </c:if>
        <h2 class="form-signin-heading">Пожалуйста, войдите</h2>
        <input type="email" name="j_username" class="form-control" placeholder="Email address" required autofocus>
        <input type="password" name="j_password" class="form-control" placeholder="Password" required>
        <label class="checkbox">
            <input type="checkbox" value="remember-me" name="_spring_security_remember_me"> Запомнить меня
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit" value="Login">Войти</button>
    </form>

</div>
</body>
</html>

