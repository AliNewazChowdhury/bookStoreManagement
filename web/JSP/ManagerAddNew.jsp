<%-- 
    Document   : ManagerAddNew
    Created on : Mar 30, 2019, 11:24:30 PM
    Author     : Ishmam
--%>


<%@page import = "dao.DataAccess"%>
<%@page import = "java.text.*"%>
<%@page import = "model.addBook"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String title = request.getParameter("title");
            String subject = request.getParameter("subject");
            String publisher = request.getParameter("pubisher");
            String language = request.getParameter("lang");
            int numberOfPages =Integer.parseInt(request.getParameter("number_page"));
            String image = request.getParameter("image") ;
            int totalBook = Integer.parseInt(request.getParameter("number_book"));
            addBook n = new addBook(title, subject, publisher, language ,numberOfPages , totalBook ,image);
            DataAccess da = new DataAccess();
            da.addNew(n);
            response.sendRedirect("/LibraryManagement/AllPost");
        %>
    </body>
</html>
