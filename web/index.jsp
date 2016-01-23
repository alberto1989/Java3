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
        
        <form action="autenticar" method="POST">
            <input type="text" name="Login" placeholder="Escribe tu Login"/>
            <input type="password" name="Password" placeholder="Escribe tu password"/>
            <input type="submit" value="Autenticar">
            
            
        </form>
        
    
        <% 
//Este Bloque se le llama Scriptlet y acepta codigo JAVA

 

 
         %>
    </body>
</html>
