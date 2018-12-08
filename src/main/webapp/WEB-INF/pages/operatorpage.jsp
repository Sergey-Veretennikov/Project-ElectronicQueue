<%@ page import="queue.main.db.entities.UserInfo" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 05.11.2018
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        /* Set height of the grid so .sidenav can be 100% (adjust if needed) */
        .row.content {
            height: auto
        }

        /* Set gray background color and 100% height */
        .sidenav {
            background-color: #f1f1f1;
            height: 100%;
        }

        /* Set black background color, white text and some padding */
        footer {
            background-color: #555;
            color: white;
            padding: 15px;
        }

        /* On small screens, set height to 'auto' for sidenav and grid */
        @media screen and (max-width: 767px) {
            .sidenav {
                height: auto;
                padding: 15px;
            }

            .row.content {
                height: auto;
            }
        }

        iframe {
            border: 0px;
            width: fit-content;
            height: fit-content;
        }
    </style>
</head>
<div class="container-fluid">
    <div class="row content">
        <div class="col-sm-3 sidenav">
            <h4>Оператор </h4>
            <%UserInfo userInfo = (UserInfo) request.getAttribute("userInfo");%>
            <h4><%= userInfo.getSurname() + " " +
                    userInfo.getName()%>
            </h4>
            <img class="img-circle" height="120" width="65" alt="Avatar">
            <ul class="nav nav-pills nav-stacked">
                <li><a href="operatorpage?action=next">Следующий</a></li>
                <li><a href="operatorpage?action=done">Прием клиента окончен</a></li>
                <li><a href="operatorpage?action=nextWithout">Принять без очереди</a></li>
                <li><a href="operatorpage?action=callAdmin">Вызвать администратора</a></li>
                <li><a href="/static/j_spring_security_logout">Выйти</a></li>
            </ul>
            <br>
        </div>

        <div class="col-sm-9">
            <div class="row">
                <iframe src="window.html" frameborder="0"></iframe>
            </div>
        </div>
    </div>
    <footer class="container-fluid">
        <p>Сервис электронной очереди</p>
        <p>Количество принятых клиентов за смену: __</p>
    </footer>
</div>
</html>