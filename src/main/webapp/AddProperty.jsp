<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./Styles/AddPrStyles.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<script>
function myFunction() {
  document.getElementById("myForm").reset();
}
</script>

<title>AddProperty</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="./Styles/style.css">

</head>
<body>

<div id="header">
<jsp:include page="Header.jsp"/>
</div>

    <div class="container"> 
    <div class="row">
    <div class="offset-4 col-md-4">

<form method="post" action="createProperty" id="myForm" name="myForm" class="form-login">
   <div class="row"> 
   <div class="col-md-12 text-center"><h3>ADD PROPERTY</h3></div>
   </div>

   <div class="row my-2"> 
   <div class="col-md-4">Title</div>
   <div class="col-md-8"><input type="text" name="Title" required></div>
   </div>
   
   <div class="row my-2"> 
   <div class="col-md-4">Location</div>
   <div class="col-md-8"><input type="text" name="Location" required></div>
   </div>
         
   <div class="row my-2"> 
   <div class="col-md-4">Landmark</div>
   <div class="col-md-8"><input type="text" name="Landmark"></div>
   </div>
   
   <div class="row my-2"> 
   <div class="col-md-4">Area</div>
   <div class="col-md-8"><input type="text" name="Area" required></div>
   </div>  
   
   <div class="row my-2"> 
   <div class="col-md-4">Area</div>
   <div class="col-md-8"><input type="text" name="Area" required></div>
   </div>   
   
   <div class="row my-2"> 
   <div class="col-md-4">Image</div>
   <div class="col-md-8"><input type="file" name="image" ></div>
   </div>
   
   <div class="row my-2"> 
   <div class="col-md-4">ContactNo</div>
   <div class="col-md-8"><input type="number" name="ContactNumber" required></div>
   </div>  
   
   <div class="row"> 
   <div class="col-md-6 ">Amenities</div>
   
   <div class="col-md-6 ">
  
   <div class="checkbox">
   <label><input type="checkbox" value="">security</label>
   </div>
  
   <div class="checkbox">
   <label><input type="checkbox" value="">Gym</label>
   </div>
  
   <div class="checkbox ">
   <label><input type="checkbox" value="" >Swimming Pool</label>
   </div>
  
   <div class="checkbox">
   <label><input type="checkbox" value="">Swimming Pool</label>
   </div>
  
   <div class="checkbox">
   <label><input type="checkbox" value="">Kids Play Area</label>
   </div>
  
   <div class="checkbox ">
   <label><input type="checkbox" value="" >Jogging Track</label>
   </div>
 
   </div>
   </div>
   <div class="row"> 
   <div class="col-md-4"> </div>
   <div class="col-md-8"> <input class="btn btn-md btn-primary" type="submit" value="Submit" />
   <input class="btn btn-md btn-danger" type="reset" onclick="myFunction()" value="Reset" /></div>
   </div>
</form>

</div>
</div>
</div>
</body>
</html>