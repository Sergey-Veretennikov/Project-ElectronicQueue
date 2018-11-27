<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11.11.2018
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Терминал</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

    <style>
        input {
            height: 225px;
            border: 1px solid #0a3c59;
            border-radius: 6px;
        }
    </style>
</head>
<body>

<form>
    <input class="btn-block" type="button" value="Оформление кредита" onClick='location.href="/sendTalon"'>
</form>
<form>
    <input class="btn-block" type="button" value="Получение карты банка" onClick='location.href="/sendTalon"'>
</form>
<form>
    <input class="btn-block" type="button" value="Снять или внести наличные на счет"
           onClick='location.href="/sendTalon"'>
</form>
<form>
    <input class="btn-block" type="button" value="Консультация по остальным вопросам"
           onClick='location.href="/sendTalon"'>
</form>


</body>
</html>
