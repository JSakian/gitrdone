<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Volunteer Signup</title>
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
.formFieldError {
	background-color: yellow
}
</style>
<title>volunteer form</title>
</head>
<body>

<header class="navbar">
<nav class="navbar navbar-default">
  <div class="container-fluid" class="navbar navbar-inverse">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Home</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class="active"><a href="http://localhost:8080/capstone/events.mvc">Events<span class="sr-only">(current)</span></a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Admin</a></li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</header>

	<div class="container-fluid">
		<!-- 	<div class="gd-title gd-volunteer-title" col-sm-6">Signup</div> -->
		<div>
			<h2 class="text-center">Sign-up</h2>
		</div>

		<div class="row">

			<mvc:form modelAttribute="volunteerPerson"
				action="volunteerFormSubmission.mvc" class="gd-form">
				<div>
					<p class="text-center">
						<mvc:label path="firstName">First Name*:</mvc:label>
						<mvc:input path="firstName" cssErrorClass="formFieldError" placeholder= "John"/>
						<mvc:errors path="firstName" />
					</p>
				</div>

				<div>
					<p class="text-center">
						<mvc:label path="lastName">Last Name*:</mvc:label>
						<mvc:input path="lastName" cssErrorClass="formFieldError" placeholder= "Doe"/>
						<mvc:errors path="lastName" />
					</p>
				</div>

				<div>
					<p class="text-center">
						<mvc:label path="email">Email Address*:</mvc:label>
						<mvc:input path="email" cssErrorClass="formFieldError" placeholder= "John.Doe@example.com" />
						<mvc:errors path="email" />
					</p>
				</div>

				<div>
					<p class="text-center">
						<mvc:label path="phone">Phone*:</mvc:label>
						<mvc:input path="phone" cssErrorClass="formFieldError" placeholder= "2101234567"/>
						<mvc:errors path="phone" />
					</p>
				</div>

				<div>
					<p class="text-center">
						<mvc:label path="comments">Comments:</mvc:label>
						<mvc:textarea path="comments"></mvc:textarea>
						<!-- 	TODO does this need an errors mvc tag???  -->
					</p>
				</div>

				<p class="text-center">
					<input type="submit" value="Submit volunteer form" />
				</p>

				<div class="gd-required">
					<p class="text-center">*Required</p>
				</div>
			</mvc:form>
		</div>

		<script
			src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
			integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
			crossorigin="anonymous">
			
		</script>

	</div>

</body>
</html>