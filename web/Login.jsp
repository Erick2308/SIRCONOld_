<%-- 
    Document   : Index
    Created on : 22 oct. 2019, 20:34:24
    Author     : Erick Meza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIRCON - Login</title>
    </head>
    <body>
        <h1>Bienvenido al Sistema SIRCON</h1><br/>
        <h2> Inicio de Sesión</h2><br/>
        
        <form action="Entrar" method="post"><br/>
            <label>Usuario: </label>
            <input type="text" name="usuario"/><br/>
            <label>Contraseña: </label>
            <input type="password" name="pass"/><br/>
            <input type="submit" value="Iniciar Sesión"/><br/>
        </form> 
        <br/>
        Click aqui para <a href="Registro.jsp">Registrarte</a>
    </body>
</html>
