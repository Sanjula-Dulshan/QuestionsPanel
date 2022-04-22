<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Exam</title>
<style> 
body{
	background-image: url("background.jpeg");
	background-repeat: no-repeat;
	background-attachment: fixed; 
	background-size: 100% 100%;
}
.footer {
    position: relative;
    bottom: 0;
    width:100%;
    height: 60px;
    background-color: #000000;
}

</style>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
	<header style="position: fixed; width: 100%; z-index: 1">
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: #000000">
			<div>
				<a href="#" class="navbar-brand"> Add Question</a>
			</div>

			<ul class="navbar-nav">
				<li><a href="questionlist" 
					class="nav-link">Question List</a></li>
			</ul>

			<ul class="navbar-nav navbar-collapse justify-content-end">
				<li><a href="#"
					class="nav-link">Logout</a></li>
			</ul>
		</nav>
	</header><br><br>
	<div class="container col-md-5"><br><br>
		<div class="card">
			<div class="card-body">
			<h3 class="text-center">Add Question</h3>
			<hr>
			
				<form action="insert" method ="post">
				
				<fieldset class="form-group">
					<label>Subject</label><select class="form-control" name="subject" required="required">
						<option value="ict">ICT</option>
						<option value="science">Science</option>
						<option value="maths">Maths</option>
						<option value="art">Art</option>
					</select>
				</fieldset>
				
				<fieldset class="form-group">
				 	<label>Question </label><input type = "text" class="form-control" name ="question" required="required">
				 </fieldset>
				 
				 <fieldset class="form-group">
				 	<label>Answer 1</label> <input type = "text" class="form-control" name ="answer1" required="required">
				 </fieldset>
				 
				 <fieldset class="form-group">
				 	<label> Answer 2</label> <input type = "text" class="form-control" name ="answer2" required="required">
				 </fieldset>
				 
				 <fieldset class="form-group">
				 	<label> Answer 3</label> <input type = "text" class="form-control" name ="answer3" required="required">
				 </fieldset>
				 
				 <fieldset class="form-group">
				 	<label> Answer 4 </label><input type = "text" class="form-control" name ="answer4" required="required">
				 </fieldset>
				 
				 <fieldset class="form-group">
					<label>Correct Answer</label><select class="form-control" name="cAnswer" required="required">
						<option value="1">Answer 1</option>
						<option value="2">Answer 2</option>
						<option value="3">Answer 3</option>
						<option value="4">Answer 4</option>
					</select><br>
				</fieldset>
				 	
				 	<input type = "submit"  class="btn btn-success" name ="submit" value = "Create Question">	
				
				</form>
			</div>
		</div>
	</div>
<br><br>

<footer class="footer font-small black">
    <!-- Copyright -->
  <div class="footer-copyright text-center py-3" style="color: white">© 2021Copyright:
        <a href="#" > <strong> Online Exam </strong></a>
   </div>
</footer>
</body>
</html>