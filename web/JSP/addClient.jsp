<%-- 
    Document   : addClient
    Created on : Apr 8, 2019, 9:05:46 PM
    Author     : Ishmam
--%>

<%@page import="dao.DataAccess"%>
<%@page import="model.addClient"%>
<%@page import="java.text.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = request.getParameter("name");
            String gender = request.getParameter("gender");
            int phone = Integer.parseInt(request.getParameter("phone")) ;
            String address= request.getParameter("address");
            String house_no = request.getParameter("house");
            
            addClient n = new addClient(name, gender, phone, address, house_no);
            DataAccess da = new DataAccess();
            da.addClient(n);
            response.sendRedirect("/LibraryManagement/Customer");
        %>
    </body>
</html>
