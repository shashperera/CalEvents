<%-- 
    Document   : deletedes
    Created on : Aug 5, 2018, 3:38:24 PM
    Author     : Sohan
--%>
<%@page import="menu.Deserts,java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <% String id = request.getParameter("des_id");
           
           if (Deserts.isDeleted(id)) {
        %>
        <script>
            alert("Your record has been successfully deleted");
        </script>
        <%@include file="/Menu/UpdateDeserts.jsp" %> 
        <% }else
            out.println("sorry your record cannot be deleted");
        %>
    </body>
</html>
