<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Volunteer Signup</title>
<link rel="stylesheet" type="text/css" href="/capstone/style.css" />
</head>
<body>
<div class="gd-title gd-signup-title">Signup</div>
<form action="/capstone/formSubmission.mvc" method="POST" class="gd-signup-form">
	<div><label for="firstname">First Name*:</label> <input type="text" name="firstName" /></div>
	<div><label for="lastname">Last Name*:</label> <input type="text" name="lastName" /></div>
	<div><label for="email">Email Address*:</label> <input type="text" name="email" /></div>
	<div><label for="email">Phone:</label> <input type="text" name="phone" /></div>
	<div><label for="comments">Comments*:</label> <textarea name="comments"></textarea></div>
	<input type="submit" value="Submit" />
	<div class="gd-required">*Required</div>
</form>
</body>
</html>