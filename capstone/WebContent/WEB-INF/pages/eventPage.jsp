<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page import="java.util.List"%>
<%@ page import="com.gitrdone.beans.Event"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Calendar</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
	integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r"
	crossorigin="anonymous">
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
//String[] titles = {"A", "B", "C"};
//pageContext.setAttribute("titles", titles);
List<Event> events = (List<Event>) request.getAttribute("events");
System.out.print("Events: ");
System.out.println(events);
%>
<% if (events.size() != 0) { %>
	<c:forEach var="i" begin="0" end="<%= events.size() - 1 %>">
		<div class="gd-event-title"><c:out value="${events.get(i).eventName}" /></div>
		<div class="gd-options"><a href="attendee.mvc" id="gd-rsvp-link${i}">RSVP</a> <a href="volunteer.mvc">Volunteer</a></div>
		<script>
			//document.getElementById("gd-rsvp-link${i}").setAttribute("href", "javascript:gdToggleForm(${i})");
		</script>
	</c:forEach>
<% } else { %>
	<div class="gd-no-events">No events found.</div>
<% } %>
</body>
</html>