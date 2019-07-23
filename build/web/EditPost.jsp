<%-- 
    Document   : EditPost
    Created on : Apr 5, 2019, 4:44:59 PM
    Author     : Ishmam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

    </head>
    <body>
       <div class="container">
		<div class="row justify-content-center">
			<div class="col-sm-6">
				<h1>Edit Post</h1>
                                <c:forEach items="${getBookById}" var="p">
                                    <form method="POST" action="JSP/ManagerEditPost.jsp">
                                    <div class="form-group">
                                          <label for="title">Id</label>
                                          <input type="text" name="id" value="${p.id}" class="form-control" id="title">
                                    </div>    
                                    <div class="form-group">
                                          <label for="title">Title</label>
                                          <input type="text" name="title" value="${p.title}" class="form-control" id="title" placeholder="Enter Your Full Name">
                                    </div>

                                    <div class="form-group">
                                          <label for="subject">Subject</label>
                                          <select name="subject" class="form-control" id="blood">
                                            <option value="${p.subject}">${p.subject}</option>  
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
                                          <input type="text" name="pubisher" value="${p.publisher}" class="form-control" id="pubisher" placeholder="Pubisher's name">
                                    </div>
                                    <div class="form-group">
                                          <label for="lang">Language</label>
                                          <select name="lang" class="form-control" id="lang">
                                              <option value="${p.language}">${p.language}</option>
                                            <option value="bangla">Bangla</option>
                                            <option value="english">English</option>


                                          </select>
                                    </div>
                                    <div class="form-group">
                                          <label for="number_page">Number of page</label>
                                          <input type="text" name="number_page" value="${p.num_of_page}" class="form-control" id="number_page" placeholder="Enter number of page">
                                    </div>
                                    <div class="form-group">
                                          <label for="number_book">Total number of book</label>
                                          <input type="text" name="number_book" value="${p.total_books}" class="form-control" id="number_book" placeholder="Enter number of books">
                                    </div>
                                    <div class="form-group">
                                          <label for="number_book">Image Name</label>
                                          <input type="file" name="number_book" value="${p.image}" class="form-control" id="number_book" placeholder="Enter number of books">
                                    </div>                                    <button type="submit" name="registration" class="btn btn-primary">Submit</button>
                                  </form>
                                </c:forEach>
				
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
