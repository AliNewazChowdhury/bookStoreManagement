<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <title>Hello, world!</title>
  </head>
  <body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-sm-6">
				<h1>Registraion</h1>
				<form method="POST" action="validation.php">
				  <div class="form-group">
					<label for="name">Name</label>
					<input type="text" name="name" class="form-control" id="name" placeholder="Enter Your Full Name">
				  </div>
				  <div class="form-group">
					<label for="email">Email address</label>
					<input type="email" name="email" class="form-control" id="email" placeholder="Enter Email">
				  </div>
				  <div class="form-group">
					<label for="phone">Phone</label>
					<input type="text" name="phone" class="form-control" id="phone" placeholder="Enter Your Phone Number">
				  </div>
				  <div class="form-group">
					<label for="blood">Blood Group</label>
					<select name="blood" class="form-control" id="blood">
					<?php
						$blood = array('apv'=>'A+','anv'=>'A-','bpv'=>'B+','bnv'=>'B-','opv'=>'O+','onv'=>'O-','abpv'=>'AB+','abnv'=>'AB-',);
						
						foreach($blood as $bv => $bn){
							echo '<option value="'.$bv.'">'.$bn.'</option>';
						}
					?>
					<!-- 
					  <option value="apv">A+</option>
					  <option value="anv">A-</option>
					  <option value="bpv">B+</option>
					  <option value="bnv">B-</option>
					  <option value="opv">O+</option>
					  <option value="onv">O-</option>
					  <option value="abpv">AB+</option>
					  <option value="abnv">AB-</option>
					 -->
					</select>
				  </div>
				  <div class="form-group">
					<label>Gender</label><br>
					<div class="form-check form-check-inline">
					  <input class="form-check-input" type="radio" name="gender" id="male" value="m" checked>
					  <label class="form-check-label" for="male">Male</label>
					</div>
					<div class="form-check form-check-inline">
					  <input class="form-check-input" type="radio" name="gender" id="female" value="f">
					  <label class="form-check-label" for="female">Female</label>
					</div>
				  </div>
				  <div class="form-group">
					<label for="password">Password</label>
					<input type="password" name="password" class="form-control" id="password" placeholder="Password">
				  </div>
				  <div class="form-group">
					<label for="cpassword">Confirm Password</label>
					<input type="password" name="cpassword" class="form-control" id="cpassword" placeholder="Password">
				  </div>
				  <div class="form-group form-check">
					<input type="checkbox" name="accept" class="form-check-input" value="ok" id="accept" checked>
					<label class="form-check-label" for="accept">Check me out</label>
				  </div>
				  <button type="submit" name="registration" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>