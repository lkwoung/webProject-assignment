<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
  <meta charset="UTF-8"/>
  <title>CodePen - Basic Sliding Navigation</title>
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<!-- partial:index.partial.html -->
<div class="block-signup">
  <button class="button-signup"><span>Log in</span></button>
  <div class="block-inner">
    <form action="login/loginAction.jsp" method="post">
      <label style="left:15%;">Welcome to Cheap PC World!</label>
      <input class="form-text" type="text" placeholder="ID" name="userID"/>
      <input class="form-text" type="password" placeholder="PASSWORD" name="userPassword"/>
		<div class="form-action">
        	<input type="submit" value="Check" style="left:35%;"/>
    	</div>
    </form>
 </div>
 	<new onclick="location='login/join.jsp'"><span>Join in</span></new>
 </div>



 

<!-- partial -->
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
</body>
</html>