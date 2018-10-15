<%-- 
    Document   : login2.jsp
    Created on : 15-oct-2018, 16:05:19
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
        <%String user = String.valueOf(request.getAttribute("userjsp"));%>
        <%String pwd = String.valueOf(request.getAttribute("pwdjsp"));%>
        <center><h1>Hola <%=user%></h1></center>
        <center><p>Ud. ha hecho un login correcto</p></center>
        <center><p>Su contraseña es :<%=pwd%></p></center>
        <center><p><a href="index.html">Ir al inicio</a></p></center>
    </body>
</html>
