<%--
  Created by IntelliJ IDEA.
  User: m.biryukov
  Date: 24.10.2018
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="css/my.css">
    <link rel="stylesheet" type="text/css" href="css/administrator.css">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
</head>
<body>

<div class="header centered">
    <h3>Администратор</h3>
</div>

<div class="content">

    <div class="tab">
        <button class="tablinks" onclick="openTab(event, 'Services')">Услуги</button>
        <button class="tablinks" onclick="openTab(event, 'Operators')">Операторы и услуги</button>
        <button class="tablinks" onclick="openTab(event, 'Users')">Пользователи</button>
    </div>

    <div id="Services" class="tabcontent">
        <h3>Список услуг:</h3>

        <table id="serviceTable">
            <tr>
                <th>Название услуги</th>
                <th>Описание</th>
            </tr>
            <tr>
                <td>Получение прав</td>
                <td>Выдача новых прав водителю на основании заявления.</td>
            </tr>
            <tr>
                <td>Замена прав</td>
                <td>Выдача новых прав водителю в замен старых</td>
            </tr>
            <tr>
                <td>Ультрозвуковая чистка зубов</td>
                <td>Что-нибудь про чистку(например то что эта услуга не предоставляется по ДМС)</td>
            </tr>
            <tr>
                <td>Мойка машины</td>
                <td>Комплексная мойка машины. Не включает мойку багажника.</td>
            </tr>
        </table>
        </BR>
        <div class="row">
            <button onclick="{
				$('#serviceTable tr:last').after('<tr><td>aaa</td><td>bbb</td></tr>');
			}">Добавить
            </button>
        </div>

    </div>

    <div id="Operators" class="tabcontent">
        <h3>Список операторов и услуг:</h3>
        <table id="operatorsTable">
            <tr>
                <th>Оператор</th>
                <th>Номер окна</th>
                <th>Список услуг</th>
            </tr>
            <tr>
                <td>Иванов Иван Иванович</td>
                <td>
                    <select>
                        <option value="1" selected>1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                    </select>
                </td>
                <td>Получение прав; Замена прав;</td>
            </tr>
            <tr>
                <td>Петров Иван Иванович</td>
                <td>
                    <select>
                        <option value="1">1</option>
                        <option value="2" selected>2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                    </select>
                </td>
                <td>Мойка машины;</td>
            </tr>
            <tr>
                <td>Сидоров Иван Иванович</td>
                <td>
                    <select>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3" selected>3</option>
                        <option value="4">4</option>
                    </select>
                </td>
                <td>Удаление зубов;Ультрозвуковая чистка зубов;</td>
            </tr>
        </table>
        <div class="row">

        </div>
    </div>

    <div id="Users" class="tabcontent">
        <h3>Пользователи</h3>
        <table id="usersTable">
            <tr>
                <th>Фамилия</th>
                <th>Имя</th>
                <th>Отчество</th>
                <th>Логин</th>
                <th>Роль</th>
            </tr>
            <tr>
                <td>Иванов</td>
                <td>Иван</td>
                <td>Иванович</td>
                <td>test1</td>
                <td>Оператор</td>
            </tr>
            <tr>
                <td>Петров</td>
                <td>Петр</td>
                <td>Петрович</td>
                <td>test2</td>
                <td>Администратор</td>
            </tr>
            <tr>
                <td>Сергеев</td>
                <td>Сергей</td>
                <td>Сергеевич</td>
                <td>test3</td>
                <td>Клиент</td>
            </tr>
        </table>
        <div class="row">
            <button onclick="{$('#usersTable tr:last').after('<tr><td>Сергеев</td><td>Сергей</td><td>Сергеевич</td><td>test3</td><td>Клиент</td></tr>');}">
                Добавить
            </button>
        </div>
    </div>

    <script>
        function openTab(evt, cityName) {
            var i, tabcontent, tablinks;
            tabcontent = document.getElementsByClassName("tabcontent");
            for (i = 0; i < tabcontent.length; i++) {
                tabcontent[i].style.display = "none";
            }
            tablinks = document.getElementsByClassName("tablinks");
            for (i = 0; i < tablinks.length; i++) {
                tablinks[i].className = tablinks[i].className.replace(" active", "");
            }
            document.getElementById(cityName).style.display = "block";
            evt.currentTarget.className += " active";
        }
    </script>


</div>

<!--<div style="padding-left:20px">
  <h1>Responsive Header</h1>
  <p>Resize the browser window to see the effect.</p>
  <p>Some content..</p>
</div>-->

<div class="footer">ООО "Рога и копыта" благодарят вас за визит</div>
</body>
<a href="/static/j_spring_security_logout">Выйти</a>
</html>
