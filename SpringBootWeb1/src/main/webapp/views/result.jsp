<%@page language="java" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h2>
            Hello World
        </h2>
        <br>
<%--        <h3>Result : <%= session.getAttribute("result") %></h3>--%>
        <h3>Result : ${result} </h3>
    </body>
</html>