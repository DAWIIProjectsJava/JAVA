<%-- 
    Document   : setNumbers
    Created on : 15-oct-2018, 16:17:48
    Author     : 100005978.joan23
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Numbers</title>
    </head>
    <body>
    <center>
        <h1>Selección de números</h1>
        <br>
        <%String operJSP = request.getParameter("oper"); %>
        
        <form action="CalculatorController" method="post">
            <label>Número 1: </label>
            <input type="number" name="num1" value=""/><br><br>
            <label>Número 2: </label>
            <input type="number" name="num2" value=""/><br><br>
            <input type="hidden" name="oper" value="<%=operJSP%>">
            <input type="submit" name="button" value="Calcular"/>
            
        </form>
    </center>
        
    </body>
</html>
