<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Volunteer Signup</title>
	<link rel="stylesheet" type="text/css" href="/capstone/style.css" />
    <style type="text/css"> 
        .formFieldError {background-color: yellow} 
    </style> 
	<title>volunteer form</title>
</head>
<body>
<div class="gd-title gd-volunteer-title">Signup</div>

<!-- TODO delete commented out old form code once volunteer form is is thoroughly  debuged -->
<!-- <form action="/capstone/formSubmission.mvc" method="POST" class="gd-signup-form"> -->
<!-- 	<div><label for="firstname">First Name*:</label> <input type="text" name="firstName" /></div> -->
<!-- 	<div><label for="lastname">Last Name*:</label> <input type="text" name="lastName" /></div> -->
<!-- 	<div><label for="email">Email Address*:</label> <input type="text" name="email" /></div> -->
<!-- 	<div><label for="email">Phone:</label> <input type="text" name="phone" /></div> -->
<!-- 	<div><label for="comments">Comments*:</label> <textarea name="comments"></textarea></div> -->

<mvc:form modelAttribute="volunteerPerson" action="volunteerFormSubmission.mvc">
	
	<div>
		<mvc:label path ="firstName">First Name*:</mvc:label> 
		<mvc:input path ="firstName" cssErrorClass="formFieldError"/>
		<mvc:errors path="firstName" />
	</div>
	
	<div>
		<mvc:label path ="lastName">Last Name*:</mvc:label> 
		<mvc:input path ="lastName" cssErrorClass="formFieldError"/>
		<mvc:errors path="lastName" />
	</div>
	
	<div>
		<mvc:label path ="email">Email Address*:</mvc:label> 
		<mvc:input path ="email" cssErrorClass="formFieldError"/>
		<mvc:errors path="email" />
	</div>
	
	<div>
		<mvc:label path = "phone">Phone*:</mvc:label> 
		<mvc:input path = "phone" cssErrorClass="formFieldError"/>
		<mvc:errors path= "phone" />
	</div>
	
	<div>
		<mvc:label path ="comments">Comments:</mvc:label> 
		<mvc:textarea path="comments"></mvc:textarea>
<!-- 	TODO does this need an errors mvc tag???  -->
	</div>
	
	<input type="submit" value="Submit volunteer form" />
	
	<div class="gd-required">*Required</div>
</mvc:form>
</body>
</html>