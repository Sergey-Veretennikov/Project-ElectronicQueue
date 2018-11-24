<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="./header.jsp"%>
    <link href="http://bootstrap-3.ru/examples/signin/signin.css" rel="stylesheet">
    <title>Пожалуйста, войдите</title>
</head>

<body>

<div class="container">

    <form class="form-signin" role="form" action="/addUser" method="post">
        <h2 class="form-signin-heading">Пожалуйста, зарегистрируйтесь</h2>
        <input type="text" name="name" class="form-control" placeholder="Name" required autofocus>
        <input type="text" name="surname" class="form-control" placeholder="Surname" required>
        <input type="date" name="dateofBirth" class="form-control" placeholder="Dateof birth" required>
        <input type="text" name="contact" class="form-control" placeholder="Contact" required>
        <br>
        <input type="email" name="login" class="form-control" placeholder="Email address" required autofocus>
        <input type="password" name="password" class="form-control" placeholder="Password" required>
        <label for="sel">Выберите полномочия:</label>
        <select class="form-control" name="role" id="sel">
            <option value="ROLE_GUEST">Пользователь</option>
            <option value="ROLE_OPERATOR">Оператор</option>
            <option value="ROLE_HEAD_OPERATOR">Руководитель оператора</option>
            <option value="ROLE_ADMIN">Администратор</option>
        </select>
        <br>
        <label for="sel1">Учетная запись:</label>
        <select class="form-control" name="isActive" id="sel1">
            <option value="true">Активна</option>
            <option value="false">Неактивна</option>
        </select>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit" value="Login">Зарегистрироваться</button>
    </form>

</div>
</body>
</html>
