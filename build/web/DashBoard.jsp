<%-- 
    Document   : DashBoard
    Created on : Apr 6, 2019, 6:34:47 PM
    Author     : Ishmam
--%>


<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true" %>
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

              <div class="col-md-9  justify-content-center">
                  <div style ="width: 67%; margin-left: auto; margin-right: auto;" class="pt-5">
                    <table class="table table-hover " cellpadding ="10">
                        <tr>
                            <th>Previous Login Time</th>
                            <th>Number of Log-in</th>
                           
                        </tr>
                            <tr>
                                <td>${sessionScope.Date}</td>
                                <td>${sessionScope.visitCount}</td>
                            </tr>
                    </table>
                </div>  
                
                <form method="POST" action="JSP/ManagerAddNew.jsp" class="justify-content-center pt-5" style="width: 450px;">
                  <h1>Dashboard</h1>
                  <div class="form-group">
                        <label for="title">Title</label>
                        <input type="text" name="title" class="form-control" id="title" placeholder="Enter Your Full Name">
                  </div>

                  <div class="form-group">
                        <label for="subject">Subject</label>
                        <select name="subject" class="form-control">

                          <option value="math">Math</option>
                          <option value="phy">Physics</option>
                          <option value="che">Chemistry</option>
                          <option value="bio">Biology</option>
                          <option value="cse">CSE</option>
                          <option value="eee">EEE</option>
                          <option value="civil">Civil</option>
                          <option value="detect">Detective</option>

                        </select>
                  </div>

                  <div class="form-group">
                        <label for="pubisher">Publisher</label>
                        <input type="text" name="pubisher" class="form-control" id="pubisher" placeholder="Pubisher's name">
                  </div>
                  <div class="form-group">
                        <label for="lang">Language</label>
                        <select name="lang" class="form-control" id="lang">

                          <option value="bangla">Bangla</option>
                          <option value="english">English</option>


                        </select>
                  </div>
                  <div class="form-group">
                        <label for="number_page">Number of page</label>
                        <input type="text" name="number_page" class="form-control" placeholder="Enter number of page">
                  </div>
                  <div class="form-group">
                        <label for="number_book">Total number of book</label>
                        <input type="text" name="number_book" class="form-control" placeholder="Enter number of books">
                  </div>
                  <div class="form-group">
                        <label for="image">Upload image</label>
                        <input type="file" name="image" class="form-control"  placeholder="Enter image name">
                  </div>
                  <button type="submit" name="registration" class="btn btn-primary">Submit</button>
                </form>
              

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

