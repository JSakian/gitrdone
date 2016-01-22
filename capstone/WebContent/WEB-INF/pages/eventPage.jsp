<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Calendar</title>
<link rel="stylesheet" type="text/css" href="/capstone/style.css" />
<script>
function gdToggleForm(id) {
	var link = document.getElementById("gd-rsvp" + id);
	link.style.display = (link.style.display == "none") ? "block" : "none";
}
</script>
</head>
<body>
<%
String[] titles = {"A", "B", "C"};
pageContext.setAttribute("titles", titles);
%>
<% if (titles.length != 0) { %>
	<c:forEach var="i" begin="0" end="<%= titles.length - 1 %>">
		<div class="gd-event-title"><c:out value="${titles[i]}" /></div>
		<div class="gd-options"><a href="attendee.mvc" id="gd-rsvp-link${i}">RSVP</a> <a href="volunteer.mvc">Volunteer</a></div>
		<script>
			//document.getElementById("gd-rsvp-link${i}").setAttribute("href", "javascript:gdToggleForm(${i})");
		</script>
		<mvc:form modelAttribute="volunteerPerson" action="volunteerFormSubmission.mvc" class="gd-rsvp" id="gd-rsvp${i}" style="display:none">
			<div><mvc:label path ="firstName">First Name*:</mvc:label> 
			<mvc:input path ="firstName" /></div>
			
			<div><mvc:label path ="lastName">Last Name*:</mvc:label> 
			<mvc:input path ="lastName" /></div>
			
			<div><mvc:label path ="email">Email Address*:</mvc:label> 
			<mvc:input path ="email" /></div>
			
			<div><input type="submit" value="Submit" /></div>
		</mvc:form>
	</c:forEach>
<% } else { %>
	<div class="gd-no-events">No events found.</div>
<% } %>
</body>
</html>