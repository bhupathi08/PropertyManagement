<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="./Styles/AddPrStyles.css">
<script>

function myFunction() {
  document.getElementById("myForm").reset();
}
</script>
</head>
<body>
<h1>ADD PROPERTY</h1>
<pre>
<form id="myForm" name="myForm"  action="createProperty" method="POST">
Title    : <input type="text" name="Title" required><br><br>
Location : <input type="text" name="Location" required><br><br>
Landmark : <input type="text" name="Landmark"><br><br>
Price    : <input id="id1" type="number" name="Price" required><br><br>
Area     : <input type="text" name="Area" required><br><br>  
            Image   : <input type="file" name="Image" ><br><br>
<strong>Amenities</strong> 
<select name="Amenities" multiple>
  <option value="security">security</option>
  <option value="Gym">Gym</option>
  <option value="Swimming_Pool">Swimming Pool</option>
  <option value="Community_Hall">Community Hall</option>
  <option value="Kids_Play_Area">Kids Play Area</option>
  <option value="Jogging_Track">Jogging Track</option>
</select>
<br>
<input type="button"  onclick="myFunction()" value="Reset">  <input type="submit" value="Submit">
</form>
</pre>
</body>
</html>