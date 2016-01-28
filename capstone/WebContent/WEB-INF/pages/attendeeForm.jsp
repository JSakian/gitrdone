<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RSVP</title>
<link rel="stylesheet" type="text/css" href="/capstone/style.css" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">

<style type="text/css">
.formFieldError {
	background-color: yellow
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
					<a class="navbar-brand" href="#">Home</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a
							href="http://localhost:8080/capstone/events.mvc">Events<span
								class="sr-only">(current)</span></a></li>
					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><a href="#">Admin</a></li>
					</ul>
				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</header>

	<div class="container-fluid">
		<div>
			<h2 class="text-center">Sign-up</h2>
		</div>
		<div class="row">

			<mvc:form modelAttribute="attendeePerson"
				action="attendeeFormSubmission.mvc" class="form-horizontal">
				<div class="form-group">
					<mvc:label path="firstName" class="col-sm-2 control-label">First Name*:</mvc:label>
					<div class="col-sm-8">
						<mvc:input path="firstName" cssErrorClass="formFieldError"
							placeholder="John" class="form-control" />
						<mvc:errors path="firstName" />
					</div>
				</div>

				<div class="form-group">
					<mvc:label path="lastName" class="col-sm-2 control-label">Last Name*:</mvc:label>
					<div class="col-sm-8">
						<mvc:input path="lastName" cssErrorClass="formFieldError"
							placeholder="Doe" class="form-control" />
						<mvc:errors path="lastName" />
					</div>
				</div>

				<div class="form-group">
					<mvc:label path="email" class="col-sm-2 control-label">Email Address*:</mvc:label>
					<div class="col-sm-8">
						<mvc:input path="email" cssErrorClass="formFieldError"
							placeholder="John.Doe@example.com" class="form-control" />
						<mvc:errors path="email" />
					</div>
				</div>
				<p class="text-center">
					<input type="submit" value="Submit" />
				</p>
				<div class="gd-required">
					<p class="text-center">*Required</p>
				</div>
			</mvc:form>
		</div>
	</div>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
		integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
		crossorigin="anonymous">
		
	</script>
</body>
</html>