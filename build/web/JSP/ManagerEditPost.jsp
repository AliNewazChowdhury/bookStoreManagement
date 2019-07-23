<%-- 
    Document   : ManagerEditPost
    Created on : Apr 5, 2019, 4:37:44 PM
    Author     : Ishmam
--%>

<%@page import="dao.DataAccess"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            int id =  Integer.parseInt(request.getParameter("id"));
            String title = request.getParameter("title");
            String subject = request.getParameter("subject");
            String publisher = request.getParameter("pubisher");
            String language = request.getParameter("lang");
            String image = request.getParameter("image");
            int numberOfPages =Integer.parseInt(request.getParameter("number_page"));
            int totalBook = Integer.parseInt(request.getParameter("number_book"));
            
            DataAccess da = new DataAccess();
            da.edit(title, subject, publisher, language, numberOfPages, totalBook, id,image);
            response.sendRedirect("/LibraryManagement/AllPost");
        %>
        
    </body>
        	
</html>
