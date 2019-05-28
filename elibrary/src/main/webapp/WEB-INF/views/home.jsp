<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 
this is A home page of Elibrary .

 -->
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>

<body background="../qwe.jpg">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">E-Libraary</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="http://localhost:8080/home">Home</a></li>
				<li><a href="http://localhost:8080/create">Add Book</a></li>
				<li><a href="http://localhost:8080/delete">Delete Book</a></li>
				<li><a href="http://localhost:8080/search">Search</a></li>
				<li><a href="http://localhost:8080/list">Show Books</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</nav>
</body>

</html>