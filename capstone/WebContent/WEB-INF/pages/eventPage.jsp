<%@ include file="includes/header.jsp" %>
<%@ page import="java.util.List"%>
<%@ page import="com.gitrdone.beans.Event"%>

<title>Event Calendar</title>
<script>
function gdToggleForm(id) {
	var link = document.getElementById("gd-rsvp" + id);
	link.style.display = (link.style.display == "none") ? "block" : "none";
}
</script>

<%@ include file="includes/mid.jsp" %>

<% List<Event> events = (List<Event>) request.getAttribute("events"); %>
<% if (events.size() != 0) { %>
	<c:forEach var="i" begin="0" end="<%= events.size() - 1 %>">
		<div class="gd-event">
			<div class="gd-event-title"><c:out value="${events.get(i).eventName}" /></div>
			<div class="gd-event-date"><fmt:formatDate value="${events.get(i).dateAndTime}" pattern="MM/dd h:mma" /></div>
			<div class="gd-event-description"><c:out value="${events.get(i).description}" /></div>
			<div class="gd-options"><a href="attendee.mvc" class="gd-rsvp-link" id="gd-rsvp-link${i}">RSVP</a> <a href="volunteer.mvc" class="gd-volunteer-link">Volunteer</a></div>
		</div>
		<script>
			//document.getElementById("gd-rsvp-link${i}").setAttribute("href", "javascript:gdToggleForm(${i})");
		</script>
	</c:forEach>
<% } else { %>
	<div class="gd-no-events">No events found.</div>
<% } %>

<%@ include file="includes/footer.jsp" %>