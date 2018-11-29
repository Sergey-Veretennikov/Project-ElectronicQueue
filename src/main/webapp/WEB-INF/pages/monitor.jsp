<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11.11.2018
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="my.css">
    <link rel="stylesheet" type="text/css" href="administrator.css">
    <link rel="stylesheet" type="text/css" href="monitor2.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
</head>
<body>

<div class="header centered">
    <h3>Монитор</h3>
</div>
<div class="content">
    <div class="row" style="background-color:rgb(127,200,200);">
        <div class="monitorHeader floatLeft Hсentered">
            Номер талона
        </div>
        <div class="monitorHeader floatLeft Hсentered">
            Номер окна
        </div>
    </div>
    <div class="row" style="background-color:rgb(127,200,200);">
        <div class="queueContainer floatLeft">
            <div class="queueItem">
                <div class="queueItemContent Hсentered Vcentered">
                    <span>123</span>
                </div>
            </div>
        </div>
        <div class="queueContainer floatLeft">
            <div class="queueItem">
                <div class="queueItemContent Hсentered">
                    <span>1</span>
                </div>
            </div>
        </div>
    </div>

    <div class="row" style="background-color:rgb(127,200,200);">
        <div class="queueContainer floatLeft">
            <div class="queueItem">
                <div class="queueItemContent Hсentered">
                    <span>432</span>
                </div>
            </div>
        </div>
        <div class="queueContainer floatLeft">
            <div class="queueItem">
                <div class="queueItemContent Hсentered">
                    <span>2</span>
                </div>
            </div>
        </div>
    </div>

    <div class="row" style="background-color:rgb(127,200,200);">
        <div class="queueContainer floatLeft">
            <div class="queueItem">
                <div class="queueItemContent Hсentered">
                    <span>155</span>
                </div>
            </div>
        </div>
        <div class="queueContainer floatLeft">
            <div class="queueItem" onclick="location.href='index.html';">
                <div class="queueItemContent Hсentered">
                    <span>28</span>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="footer">ООО "Рога и копыта" благодарят вас за визит</div>
</body>
</html>