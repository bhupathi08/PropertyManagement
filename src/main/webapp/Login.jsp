<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="./Styles/style.css">
    </head>
    <body>
    <div class="container"> 
    <div class="row">
    <div class="offset-4 col-md-4">
    

   <form method="post" action="LoginServlet" class="form-login">
   <div class="row"> 
   <div class="col-md-12 text-center"> <h3> Login Page</h3></div>
   </div>
   
     <div class="row my-2"> 
   <div class="col-md-4"> User name</div>
   <div class="col-md-8"> <input type="text"  class="form-control" name="userName" value="" /></div>
   </div>
   
       <div class="row my-2"> 
   <div class="col-md-4"> Password</div>
   <div class="col-md-8"> <input type="password"  class="form-control" name="password" value="" /></div>
   </div>
   
   <div class="row"> 
   <div class="col-md-4"> </div>
   <div class="col-md-8"> <input class="btn btn-md btn-primary" type="submit" value="Login" />
    <input class="btn btn-md btn-danger" type="reset" value="Reset" /></div>
   </div>
   
   <div class="row my-2"> 
   <div class="col-md-12 text-center">New User? <a href="Registration.jsp">Register Here</a> </div>
   </div>
   
    </form>
    </div>
     </div>
    </div>
    
     
        
        
        
    </body>
</html>