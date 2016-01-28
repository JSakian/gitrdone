<%@ include file="includes/header.jsp" %>
<%@ page import="java.util.List"%>
<%@ page import="com.gitrdone.beans.Event"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event Calendar</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">

<title>Event Calendar</title>
<script>
function gdToggleForm(id) {
	var link = document.getElementById("gd-rsvp" + id);
	link.style.display = (link.style.display == "none") ? "block" : "none";
}
</script>


<%@ include file="includes/mid.jsp" %>

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

<% List<Event> events = (List<Event>) request.getAttribute("events"); %>
<% if (events.size() != 0) { %>
	<c:forEach var="i" begin="0" end="<%= events.size() - 1 %>">
		<div class="gd-event-title"><c:out value="${events.get(i).eventName}" /></div>
		<div class="gd-event-date"><fmt:formatDate value="${events.get(i).dateAndTime}" pattern="MM/dd h:mma" /></div>
		<div class="gd-event-description"><c:out value="${events.get(i).description}" /></div>
		<div class="gd-options"><a href="attendee.mvc" id="gd-rsvp-link${i}">RSVP</a> <a href="volunteer.mvc">Volunteer</a></div>
		<script>
			//document.getElementById("gd-rsvp-link${i}").setAttribute("href", "javascript:gdToggleForm(${i})");
		</script>
	</c:forEach>
<% } else { %>
	<div class="gd-no-events">No events found.</div>
<% } %>

<%@ include file="includes/footer.jsp" %>