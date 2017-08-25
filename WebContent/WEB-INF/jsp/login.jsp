<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Modern Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css' />
<link href="${pageContext.request.contextPath}/css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<!----webfonts--->
<!-- <link href='http://fonts.useso.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'> -->
<!---//webfonts--->  
<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body id="login">
<h1 class="form-heading" align="center" >Dtc Query</h1>
  <div class="login-logo">
    <a href="index.html"><img src="${pageContext.request.contextPath}/images/logo.png" alt=""/></a>
  </div>
  <h2 class="form-heading">login</h2>
  <div class="app-cam">
	  <form action="${pageContext.request.contextPath }/admin/loginSubmit.action" method="post">
		<input type="text" name="adminCustom.aname" class="text" value="Admin name" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Admin name';}">
		<input type="password" name="adminCustom.apassword" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = '';}">
		<div class="submit"><input type="submit" onclick="myFunction()" value="Login"></div>
				<ul class="new">
			
			<div class="clearfix"></div>
		</ul>
	</form>
  </div>
   <div class="copy_layout login">
      <p></p>
   </div>
</body>
</html>
