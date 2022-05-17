<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Customer Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-light" style="background-color: #77abff;"">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#" style="color:black;font-size:30px;font-weight:bold;">BANKING</a>
    </div>
    <ul style="padding-left:455px" class="nav navbar-nav">
      <li class="active"><a href="#" style="color:black;font-size:17px;font-weight:bold">Deposit</a></li>
      <li><a href="memberRegister.jsp" style="color:black;font-size:17px;font-weight:bold;"> WithDraw</a></li>
      <li><a href="viewStatement.obj" style="color:black;font-size:17px;font-weight:bold;">Transfer</a></li>
	  <li><a href="#" style="color:black;font-size:17px;font-weight:bold;">Check Balance</a></li>
  <li><a href="#" style="color:black;font-size:17px;font-weight:bold;">Transaction Summary</a></li>
    </ul>
	
    <form class="navbar-form navbar-left ">
     
	  <a href="memberLogin.jsp" action="memberLogin.jsp" class="btn btn-default btn-md">
          <span class="glyphicon glyphicon-log-out"></span> Log out
      </a>
     
    </form>
  </div>
</nav>