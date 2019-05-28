<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!-- 
this is A cretae page of Elibrary.
passing ISBN,title,Author,publisher,quantity .

 --> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">E-Libraary</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="http://localhost:8080/home">Home</a></li>
      <li class="active"><a href="http://localhost:8080/create">Add Book</a></li>
      <li><a href="http://localhost:8080/delete">Delete Book</a></li>
      <li><a href="http://localhost:8080/search">Search</a></li>
      <li><a href="http://localhost:8080/list">Show Books</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<div class="form-group" style="width: 20%;margin-left: 35%">
<form method="POST" action="addbook">
<p>ISBN : <input type="text" class="form-control" name="isbn"></p>
<p>Title : <input type="text" class="form-control" name="title"></p>
<p>Author : <input type="text" class="form-control" name="author"></p>
<p>Publisher :<input type="text" class="form-control" name="publisher"></p>
<p>Quantity :<input type="text" class="form-control" name="qty"></p>
<p>
<input class="btn btn-primary form-control" type="submit" value="add">
</p>
</form>

</div>
</body>
</html>