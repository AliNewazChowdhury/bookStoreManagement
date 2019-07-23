<%-- 
    Document   : registration
    Created on : Apr 8, 2019, 9:49:35 PM
    Author     : Ishmam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <title>Registration</title>
  </head>
  <body>

	<div class="container">
		<div class="row justify-content-center">
			<div class="col-sm-6">
				<h1>Registration</h1>
				<form action="JSP/addClient.jsp" method="get">
                                    
                                    <div class="form-group">
                                          <label for="name">Name</label>
                                          <input type="text" name="name" class="form-control"  placeholder="Enter Name">
                                    </div>

                                    <div class="form-group">
                                        <label for="gender">Gender :</label><br>
                                          <input type="radio" name="gender" value="male">Male
                                          <input type="radio" name="gender" value="female">Female<br>
                                    </div>

                                    <div class="form-group">
                                          <label for="phone">Phone No</label>
                                          <input type="text" name="phone" class="form-control"  placeholder="Phone number">
                                    </div>
                                    <div class="form-group">
                                          <label for="address">Address:</label>
                                          <input type="text" name="address" class="form-control"  placeholder="Address">
                                    </div>
                                    <div class="form-group">
                                          <label for="password">House No</label>
                                          <input type="text" name="house" class="form-control"  placeholder="House No">
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
