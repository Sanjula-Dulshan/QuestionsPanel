<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
table {
  background-color: #FFFFFF
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
				<a href="insertquestion.jsp" class="navbar-brand"> Add Question</a>
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
	</header>
	
	<div class="row">
		<div class="container">
			<h3 class="text-center">List of Questions</h3>
			<hr>
			<div class="container text-left">

				<a href="insertquestion.jsp"
					class="btn btn-success">Add Question</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Subject</th>
						<th>Question</th>
						<th>Date</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
	
					<c:forEach var ="ques" items ="${quesDetails}">
						
						<tr>
							<td><c:out value= "${ques.subName}"/></td>
							<td><c:out value= "${ques.question}"/></td>
							<td><c:out value= "${ques.qDate}"/></td>
							
							<td><a href="questioneload?id=<c:out value='${ques.id}' />&amp;status=0">Edit</a>
								&nbsp;&nbsp;&nbsp;&nbsp; <a
								href="questioneload?id=<c:out value='${ques.id}' />&amp;status=1">Delete</a></td>
						</tr>
					
					</c:forEach>
			</table>
		</div>
	</div>
<br><br><br><br>

<footer class="footer font-small black">
    <!-- Copyright -->
  <div class="footer-copyright text-center py-3" style="color: white">© 2021Copyright:
        <a href="#" > <strong> Online Exam </strong></a>
   </div>
</footer>
</body>
</html>