<%-- 
    Document   : login
    Created on : 15-oct-2018, 15:40:21
    Author     : Jikan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Página de Login</h1>
        <form action="IndexController" method="POST">
            
            Nombre: <input type="text" name="user" required/><br><br>
            Contraseña: <input type="password" name="pwd" required/><br><br>
            <input type="submit" name="ok"/>
            
        </form>
        
    </body>
</html>
