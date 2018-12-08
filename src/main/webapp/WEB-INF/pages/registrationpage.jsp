<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="../../assets/ico/favicon.ico">

    <title>Пожалуйста, войдите</title>

    <!-- Bootstrap core CSS -->
    <link href="resources/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/signin.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy this line! -->
    <!--[if lt IE 9]>
    <script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<div class="container">

    <form class="form-signin" role="form" action="/addUser" method="post">

        <c:if test="${not empty registrationFailed}">
            <H3>Такой пользователь уже зарегистрирован</H3>
        </c:if>

        <h2 class="form-signin-heading">Пожалуйста, зарегистрируйтесь</h2>
        <input type="text" name="name" class="form-control" placeholder="Name" required autofocus>
        <input type="text" name="surname" class="form-control" placeholder="Surname" required>
        <input type="date" name="dateofBirth" class="form-control" placeholder="Dateof birth" required>
        <input type="text" name="contact" class="form-control" placeholder="Contact" required>
        <br>
        <input type="email" name="login" class="form-control" placeholder="Email address" required autofocus>
        <input type="password" name="password" class="form-control" placeholder="Password" required>
        <label for="sel">Выберите полномочия:</label>
        <select class="form-control" name="idRole" id="sel">
            <option value="1">Пользователь</option>
            <%-- ROLE_GUEST--%>
            <option value="2">Оператор № 1</option>
            <%-- ROLE_OPERATOR_1--%>
            <option value="3">Оператор № 2</option>
            <%-- ROLE_OPERATOR_2--%>
            <option value="4">Оператор № 3</option>
            <%-- ROLE_OPERATOR_3--%>
            <option value="5">Оператор № 4</option>
            <%-- ROLE_OPERATOR_4--%>
            <option value="6">Руководитель оператора</option>
            <%-- ROLE_HEAD_OPERATOR--%>
            <option value="7">Администратор</option>
            <%-- ROLE_ADMIN--%>
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

</div> <!-- /container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>
