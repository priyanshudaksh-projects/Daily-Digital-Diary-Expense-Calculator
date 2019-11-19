<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta charset="ISO-8859-1">
<style>
body  {
  background-image: url("hi.jpg");
  background-color: #cccccc;
  background-size: cover;
}
</style>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
}

.navbar {
  overflow: hidden;
  background-color: #0000FF;
}

.navbar a {
  float: left;
  font-size: 16px;
  color: #800080;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

.dropdown {
  float: left;
  overflow: hidden;
}

.dropdown .dropbtn {
  font-size: 16px;  
  border: none;
  outline: none;
  color: #800080;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
}

.navbar a:hover, .dropdown:hover .dropbtn {
  background-color: #800080;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #800080;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  float: none;
  color: blue;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {
  background-color: #ddd;
}

.dropdown:hover .dropdown-content {
  display: block;
}
</style><link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>OExpenses details</title>
</head>
<body>
<div class="navbar">
  <a href="#home">Home</a>
  <a href="https://www.hexaware.com">Hexaware</a>
  <a href="#news">News</a>
  <div align="right" class="dropdown">
    <button  class="dropbtn">${user.name}
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
      <a href="#">View profile</a>
      <a href="#">Services</a>
      <a href="LogoutServlet">Logout</a>
    </div>
  </div> 
</div>
<div class="w3-container">
  <h2 align="center" style="color:blue" ><u>Expenses of ${user.name}</u></h2>
   <table class="w3-table-all w3-card-4">
    <tr>
      <th>Date</th>
      <th>Food</th>
      <th>Snacks</th>
      <th>Transport</th>
      <th>Others</th>
      <th>Total</th>
      <th>Reason</th>
    </tr>
    <c:forEach var="p" items = "${expense}"> 
		<tr>
		<td>${p.date}</td>
		<td>${p.food}</td>
		<td>${p.golgappa}</td>
		<td>${p.transport}</td>
		<td>${p.other}</td>
		<td>${p.total}</td>
		<td>${p.reason}</td>
		</br>
		</tr>   
	</c:forEach>
  </table>
</div>
</body>