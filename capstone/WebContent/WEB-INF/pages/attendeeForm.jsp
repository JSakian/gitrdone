<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Volunteer Signup</title>
<link rel="stylesheet" type="text/css" href="/capstone/style.css" />
</head>
<body>
<div class="gd-title gd-attendee-title">Signup</div>
<mvc:form modelAttribute="attendeePerson" action="attendeeFormSubmission.mvc">
	
	<div><mvc:label path ="firstName">First Name*:</mvc:label> 
	<mvc:input path ="firstName" /></div>
	
	<div><mvc:label path ="lastName">Last Name*:</mvc:label> 
	<mvc:input path ="lastName" /></div>
	
	<div><mvc:label path ="email">Email Address*:</mvc:label> 
	<mvc:input path ="email" /></div>
	
	<input type="submit" value="Submit" />
	
	<div class="gd-required">*Required</div>
</mvc:form>
</body>
</html>