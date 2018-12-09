<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11.11.2018
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<!--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
</html>-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../header.jsp"%>
<link href="resources/guestpage.css" rel="stylesheet">
<title>Список услуг</title>
<<script>
function getQueueNumber(serviceName) {
var xhr = new XMLHttpRequest();

var body = 'name=' + encodeURIComponent(serviceName);

xhr.open("POST", '/talon', true);
xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

//xhr.onreadystatechange = ...;

xhr.send(body);
}
</script>>
</head>
<body>

<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
    <div class="my-0 mr-md-auto font-weight-normal text-center">
        <h5>Выберите услугу</h5>
    </div>

    <a class="btn btn-outline-primary" href="#">Войти</a>
</div>

<!--size == ${services.size()}-->

<div class="container">
    <div class="card-deck mb-3 text-center">

        <div class="card mb-4 shadow-sm service-item">
            <div class="card-body" onclick="getQueueNumber('test');">
                <h1 class="card-title pricing-card-title">$0 <small class="text-muted">/ mo</small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li>10 users included</li>
                    <li>2 GB of storage</li>
                    <li>Email support</li>
                    <li>Help center access</li>
                </ul>
            </div>
        </div>
        <div class="card mb-4 shadow-sm service-item">
            <div class="card-body">
                <h1 class="card-title pricing-card-title">$15 <small class="text-muted">/ mo</small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li>20 users included</li>
                    <li>10 GB of storage</li>
                    <li>Priority email support</li>
                    <li>Help center access</li>
                </ul>
            </div>
        </div >
        <div class="card mb-4 shadow-sm service-item">

            <div class="card-body">
                <h1 class="card-title pricing-card-title">$29 <small class="text-muted">/ mo</small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li>30 users included</li>
                    <li>15 GB of storage</li>
                    <li>Phone and email support</li>
                    <li>Help center access</li>
                </ul>
            </div>
        </div>
        <div class="card mb-4 shadow-sm service-item" >
            <div class="card-body">
                <h1 class="card-title pricing-card-title">$29 <small class="text-muted">/ mo</small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li>30 users included</li>
                    <li>15 GB of storage</li>
                    <li>Phone and email support</li>
                    <li>Help center access</li>
                </ul>
            </div>
        </div>
        <div class="card mb-4 shadow-sm service-item" >
            <div class="card-body">
                <h1 class="card-title pricing-card-title">$0 <small class="text-muted">/ mo</small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li>10 users included</li>
                    <li>2 GB of storage</li>
                    <li>Email support</li>
                    <li>Help center access</li>
                </ul>
            </div>
        </div>
        <div class="card mb-4 shadow-sm service-item" >
            <div class="card-body">
                <h1 class="card-title pricing-card-title">$15 <small class="text-muted">/ mo</small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li>20 users included</li>
                    <li>10 GB of storage</li>
                    <li>Priority email support</li>
                    <li>Help center access</li>
                </ul>
            </div>
        </div>
        <div class="card mb-4 shadow-sm service-item">
            <div class="card-body">
                <h1 class="card-title pricing-card-title">$29 <small class="text-muted">/ mo</small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li>30 users included</li>
                    <li>15 GB of storage</li>
                    <li>Phone and email support</li>
                    <li>Help center access</li>
                </ul>
            </div>
        </div >
        <div class="card mb-4 shadow-sm service-item">
            <!--<div class="card-header">
                <h4 class="my-0 font-weight-normal">Enterprise</h4>
            </div>-->
            <div class="card-body">
                <h1 class="card-title pricing-card-title">$29 <small class="text-muted">/ mo</small></h1>
                <ul class="list-unstyled mt-3 mb-4">
                    <li>30 users included</li>
                    <li>15 GB of storage</li>
                    <li>Phone and email support</li>
                    <li>Help center access</li>
                </ul>
                <!--<button type="button" class="btn btn-lg btn-block btn-primary">Contact us</button>-->
            </div>
        </div>
    </div>


</div>
<%@include file="../../footer.jsp"%>



