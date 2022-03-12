<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">Form</h1>
<div class="container">
	<div class="center-align">
		<form class="form" method="post" action="web" >
			<input type="text" placeholder="Username" name="Username">
			<input type="text" placeholder="SecretCode" name="SecretCode">
			<div style="margin: 10px;">
				<button type="submit" class="btn">Submit</button>
				<button type="reset" class="btn">Reset</button>
			</div>
		</form>
	</div>
</div>
</body>
</html>