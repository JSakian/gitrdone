<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">

<link rel="stylesheet" href="/capstone/style.css" />

<style type="text/css">
#target {
	/*  	height: 200px;  */
	/*  	width: 200px;  */
	color: navy;
	background-color: white;
}

#target:hover {
	color: red;
	background-color: orange;
	font-style: italic;
	text: "hey";
	text-color: black;
}
</style>
</head>
<body>

	<header class="navbar">
		<nav class="navbar navbar-default">
			<div class="container-fluid" class="navbar navbar-inverse">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand"
						href="http://localhost:8080/capstone/home.mvc">Home</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a
							href="http://localhost:8080/capstone/events.mvc">Events<span
								class="sr-only">(current)</span></a></li>
						<li><a href="http://localhost:8080/capstone/volunteer.mvc">Volunteer</a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="http://localhost:8080/capstone/admin.mvc">Admin</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</header>

	<div class="container-fluid">
		<img
			src="http://timeforplay.co.uk/wp-content/themes/t4p/images/home-logo-opt.png"
			class="img-responsive" alt="Responsive image">
		<p id="target"></p>
	</div>

	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
		crossorigin="anonymous">
		
	</script>
</body>
</html>