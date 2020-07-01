<%-- 
    Document   : login
    Created on : 07-01-2020, 10:31:46 AM
    Author     : JHONATAN CORTEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicion de Session</title>
        <%@include file="WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body class="content-login">
        <div id="login"><br>
        <h2 class="text-center text-white pt-5">Inicio de Sesión</h2>
        <div class="container center-block">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="login" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">Usuario:</label><br>
                                <input type="text" name="txtUsername" id="txtUsername" class="form-control" placeholder="ejemplo@gmail.com">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Contraseña:</label><br>
                                <input type="password" name="txtPassword" id="txtPassword" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="remember-me" class="text-info"><span>Recordar contraseña</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="Ingresar">
                            </div>
                            
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
        
    
    </body>
</html>
