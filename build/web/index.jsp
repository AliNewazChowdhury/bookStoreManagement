<%-- 
    Document   : index
    Created on : Apr 10, 2019, 2:50:20 PM
    Author     : Ishmam
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="dao.DataAccess" %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="css/all.css">
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- == stylesheet == -->
        <link rel="stylesheet" href="css/style.css">
    </head>
    
    <body>
	<header>
            <div class="container">
                    <div class="row p-0">
                           <div class="col-12 p-0">
                                <nav class="navbar navbar-expand-md navbar-dark p-0">
                                            <!-- ==Company Name & logo== -->
                                        <div class="company float-left " >
                                           
                                           <h2>National Library</h2>
                                        </div>


                                        <div class="collapse navbar-collapse " id="navbarsExample04">
                                            <ul class="navbar-nav ml-auto">
                                              <li class="nav-item active mx-3">
                                                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                                              </li>
                                              <li class="nav-item mx-3">
                                                <a class="nav-link" href="registration.jsp">Registration</a>
                                              </li>
                                            </ul>
                                        </div>
                                </nav>
                           </div>
                    </div>
            </div>			
	</header>
        <section id="project">
            <div class="container">
                <h1>Library Books</h1>
                <!-- ==Portfolio Content== -->
                <div class="row">
                 <%
                    DataAccess da= new DataAccess();
                    ResultSet rs=da.getImage();
                    while(rs.next())
                    {
                  %>
                    <div class="col-md-4 col-sm-6">
                         <div class="content text-center">
                              <img src="images/<%out.println(rs.getString("image"));%>" >
                            <div class="overlay">
                                <a href="/Orders">Borrow</a>
                            </div>
                         </div>  
                    </div>  
                    <%
                    }
                    rs.close();
                    %>

                </div>
            </div>
        </section>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>

