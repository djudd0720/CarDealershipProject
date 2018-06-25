<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">

    <title>Signin</title>

    <!-- Bootstrap core CSS -->
    <link href="../../dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
  </head>
  <body class="text-center">
<div class="container">
		<!-- Example row of columns -->
		<div class="row">
		<div class="col-md-4">
			<h2>Welcome to DJ's Deals </h2>
  
    <form class="form-signin" action="SignInServlet" method="get">
    <table>
      <!-- <img class="mb-4" src="https://getbootstrap.com/assets/brand/bootstrap-solid.svg" alt="" width="75" height="75"> -->
      <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
      <label for="inputUserName" class="sr-only">Username</label>
      <!-- <label for="inputEmail" class="sr-only">Email address</label> -->
      <input type="userName" name="userName" id="inputUserName" class="form-control" placeholder="Username" required autofocus>
<!--       <input type="email" name="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus> -->
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" name="password" id="inputPassword" class="form-control" placeholder="Password" required>
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      <p class="mt-5 mb-3 text-muted">&copy; 2018-2019</p>
      </table>
    </form>
    </div>
  </div>
  </div>
  </body>
  
</html>