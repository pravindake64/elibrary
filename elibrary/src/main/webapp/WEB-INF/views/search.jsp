<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 
this is A search page of Elibrary .
passing name parameter to find record
 -->
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Book</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-inverse table-bordered">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">E-Libraary</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="http://localhost:8080/home">Home</a></li>
				<li><a href="http://localhost:8080/create">Add Book</a></li>
				<li><a href="http://localhost:8080/delete">Delete Book</a></li>
				<li class="active"><a href="http://localhost:8080/search">Search</a></li>
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
	<div class="form-group" style="width: 20%;">
	<form method="POST" action="searchbook">

		<p>
			Enter Book Name : <input type="text"  name="title"
				placeholder="Search">
			<button class="btn btn-primary" type="submit">
				<i class="glyphicon glyphicon-search"></i>
			</button>
		</p>
	</form>
</div>
	<table class="table table-striped">
		<tbody>
			<tr>
				<td>Id</td>
				<td>ISBN</td>
				<td>Title</td>
				<td>Author</td>
				<td>Publisher</td>
				<td>Quantity</td>

			</tr>
			<tr>
				<td><c:out value="${books.id} " /></td>
				<td><c:out value="${books.isbn} " /></td>
				<td><c:out value="${books.title} " /></td>
				<td><c:out value="${books.author}" /></td>
				<td><c:out value="${books.publisher} " /></td>
				<td><c:out value="${books.qty}  " /></td>
			</tr>
		</tbody>
	</table>
</body>
</html>