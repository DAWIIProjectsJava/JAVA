<%-- 
    Document   : operations
    Created on : 15-oct-2018, 15:41:16
    Author     : 100005978.joan23
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Selección de operación</h1><br>
        <form action="setNumbers.jsp" method="GET">
            <label>Selecciona qué clase de operación quieres realizar.</label>
            <br><br>
            <select name="oper">
                <option value="1">Suma</option>
                <option value="2">Resta</option>
                <option value="3">Multiplicación</option>
                <option value="4">División</option>
            </select>
            <br><br>
            <input type="submit" value="Seleccionar"/>
        </form>
    </center>
    </body>
</html>
