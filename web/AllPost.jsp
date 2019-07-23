 <%-- 
    Document   : AllPost
    Created on : Mar 30, 2019, 11:29:11 PM
    Author     : Ishmam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <title>Dashboard</title>
  </head>
  <body>
       <nav class="navbar navbar-dark fixed-top bg-dark flex-md-nowrap p-0 shadow">
            <a class="navbar-brand col-sm-3 col-md-2 mr-0" href="#">Library Management System</a>
            
            <ul class="navbar-nav px-3">
                <li class="nav-item text-nowrap " style="width: 300px; ">
                  <h4 style="color: white; padding-right: 36px; padding-top: 4px;" class="float-left">${sessionScope.name}</h4>
                  <form action ="logout">
                      <button type="submit" name="logout">Log out</button>
                  </form>
              </li>
            </ul>
      </nav>
      <div class="container-fluid justify-content-center">
            <div class="row ">
              <nav class="col-md-2 d-none d-md-block bg-light sidebar">
                <div class="sidebar-sticky">
                  <ul class="nav flex-column">
                    <li class="nav-item">
                      <a class="nav-link active" href="#">
                        Dashboard <span class="sr-only">(current)</span>
                      </a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">
                       Orders
                      </a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">
                        Products
                      </a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">
                        Customers
                      </a>
                    </li>
                </div>
            </nav>
               <table class="table table-hover col-md-8 mt-5" cellpadding ="10">
                    <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Subject</th>
                        <th>Publish</th>
                        <th>Language</th>
                        <th>Number of Pages</th>
                        <th>Total Books</th>

                    </tr>
                    <c:forEach items = "${AllPost}" var = "p">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.title}</td>
                            <td>${p.subject}</td>
                            <td>${p.publisher}</td>
                            <td>${p.language}</td>
                            <td>${p.num_of_page}</td>
                            <td>${p.total_books}</td>
                            <td>${p.image}</td>
                            <td>
                                <a href = "edit?id=${p.id}">Edit</a>
                                <a href = "delete?id=${p.id}">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <div style ="width: 1200px; margin-left: auto; margin-right: auto;">
                
            </div>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
