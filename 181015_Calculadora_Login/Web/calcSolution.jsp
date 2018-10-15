<%-- 
    Document   : calcSolution
    Created on : 15-oct-2018, 17:32:16
    Author     : Jikan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solución</title>
    </head>
    <body>
        <%double number1 = (Double)(request.getAttribute("num1"));
        double number2 = (Double)(request.getAttribute("num2"));
        double resul = (Double)request.getAttribute("solution"); %>
       
        
    <center>
        <h1>Resultados de la operación</h1><br>
        <p>El resultado de la operación es :</p>
        <p><%=number1%> y <%=number2%> es <%=resul%></p>
    </center>
    </body>
</html>
