<%-- 
    Document   : index
    Created on : 19/01/2016, 09:09:36 PM
    Author     : heroe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido Ingresa tus Datos!</h1>
        <p>Datos de Autentificacion</p>
        
    <form action="proceso.jsp" method="post">
    Login:
    <input type="text" name="login">
    <br>
    <br>
    Password:
    <input type="text" name="password">
    <br/>
    Entrar
    <input type="button" name="boton">
    
</form>
        
        <% 
//Este Bloque se le llama Scriptlet y acepta codigo JAVA

 

 
         %>
    </body>
</html>
