<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="./Styles/style.css">
    </head>
    <body >
     <div class="container"> 
    <div class="row">
    <div class="offset-4 col-md-4">
    

   <form method="post" action="createUser" class="form-login">
   <div class="row"> 
   <div class="col-md-12 text-center"><h3>Registration Page</h3></div>
   </div>
   
   <div class="row my-2"> 
   <div class="col-md-4">First Name</div>
   <div class="col-md-8"><input type="text" class="form-control" name="firstName" value="" /></div>
   </div>
   
   <div class="row my-2"> 
   <div class="col-md-4">Last Name</div>
   <div class="col-md-8"><input type="text" class="form-control" name="lastName" value="" /></div>
   </div>
         
   <div class="row my-2"> 
   <div class="col-md-4">Email</div>
   <div class="col-md-8"><input type="text" class="form-control" name="firstName" value="" /></div>
   </div>
   
   <div class="row my-2"> 
   <div class="col-md-4">User Name</div>
   <div class="col-md-8"><input type="text" class="form-control" name="userName" value="" /></div>
   </div> 
   
   <div class="row my-2"> 
   <div class="col-md-4">Password</div>
   <div class="col-md-8"><input type="password"  class="form-control" name="password" value="" /></div>
   </div>   
   
   <div class="row"> 
   <div class="col-md-4"> </div>
   <div class="col-md-8"> <input class="btn btn-md btn-primary" type="submit" value="Submit" />
   <input class="btn btn-md btn-danger" type="reset" value="Reset" /></div>
   </div>
   
 <div class="row my-2"> 
   <div class="col-md-12 text-center">Already registered!! <a href="login.jsp">Login Here</a></div>
</div>
</form>
</div>
</div>
</div>
</body>
</html>