<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>View Properties</title>
</head>
<body>

<div id="header">
    <jsp:include page="Header.jsp"/>
</div>

    <div class="container"> 
    <div class="row">
    <div class="offset-4 col-md-5">

 <form method="post" action="createUser" class="form-login">
   <div class="row"> 
   <div class="col-md-12 text-center"><h3>PROPERTIES</h3></div>
   </div>

 <c:forEach items="${properties}" var="property">
 <div class="card my-2" style="width:25rem;">
  <div class="card" style="width: 18rem;">
  <img src="<c:out value="${property.image}" />" class="card-img-top" alt="...">
  <div class="card-body text-center">
    <h2 class="card-title" ><c:out value="${property.title}" /></h2>
    <pre class="card-text">location:<c:out value="${property.location}"/>  |   landmark:<c:out value="${property.landmark}"/><br>
    area:<c:out value="${property.area}"/>      price:<c:out value="${property.price}"/>  </pre>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>
</c:forEach>
</form>
</div>
</div>
</div>

</body>
</html>
