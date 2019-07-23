<%-- 
    Document   : DashBoard
    Created on : Apr 6, 2019, 6:34:47 PM
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
                <a class="nav-link" href="login.html">Sign out</a>
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

              <div class="col-md-9  justify-content-center">
                  <table class="table table-hover mt-5" cellpadding ="10">
                    <tr>
                        <td>Id</td>
                        <td>Name</td>
                        <td>Gender</td>
                        <td>Phone</td>
                        <td>Address</td>
                        <td>House Number</td>
                        
                    </tr>
                    <c:forEach items = "${Customer}" var = "p">
                        <tr>
                            <td>${p.id}</td>
                            <td>${p.name}</td>
                            <td>${p.gender}</td>
                            <td>${p.phone}</td>
                            <td>${p.address}</td>
                            <td>${p.house_no}</td>

                        </tr>
                    </c:forEach>
                  </table>
              </div>
            </div>
      </div>   
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>

