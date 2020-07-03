<%-- 
    Document   : index
    Created on : 06-29-2020, 10:28:55 AM
    Author     : JHONATAN CORTEZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
        <!--incluimos las vistas parciales de las url de librerias-->
        <%@include file="WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
        <!--vista parcial del encabezado-->
        <%@include file="WEB-INF/Vistas-Parciales/encabezado.jspf"%>
        
        <div class="container">
            <div class="row">
              <div class="col-sm-12 col-md-12 col-lg-12 col-xl-9">
                <h1 style="font-size: 100px; color: white;" class="mt-5">Bienvenido al Sistema de Control de Inventario</h1>
                <a href="acercade.jsp" title=""><p style="font-size: 30px; color: white;">Un paso adelante!</p></a>
                
              </div>
             </div>
        </div>
        
        <style type="text/css">
            body{
                background: -webkit-linear-gradient(to right, #25317D, #25317D);
                background: linear-gradient(to right, #0C98FF, #14508C);
                min-height: 100vh;
            }
        </style>
        <br><br><br><br><br><br><br><br><br><br><br><br><br>
        <!--vista parcial del pie de pagina-->
        <%@include file="WEB-INF/Vistas-Parciales/pie.jspf"%>
        
    </body>
</html>
