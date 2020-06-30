<%-- 
    Document   : conexion
    Created on : 29-jun-2020, 20:50:20
    Author     : Luis E. Leonor
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
            Connection con = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_inventario", "root", "");
                out.print("Conexion en linea");
            } catch(Exception ex) {
                out.print("error" + ex.getMessage());
            }
        %>
    </body>
</html>
