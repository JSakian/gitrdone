<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Calendar</title>
</head>
<body>
<% 
String[] titles = {"A", "B", "C"};
pageContext.setAttribute("titles", titles);
%>
<% if (titles.length != 0) { %>
	<c:forEach var="i" begin="0" end="<%= titles.length - 1 %>">
		<div class="gd-title"><c:out value="${titles[i]}" /></div>
		<div class="gd-options"><a href="#">RSVP</a> <a href="volunteerForm.jsp">Volunteer</a></div>
	</c:forEach>
<% } else { %>
	<div class="gd-no-events">No events found.</div>
<% } %>
</body>
</html>