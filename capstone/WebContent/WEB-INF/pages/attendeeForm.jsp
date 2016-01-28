<%@ include file="includes/header.jsp"%>

<title>RSVP</title>
<style type="text/css">
.formFieldError {
	background-color: yellow
}
</style>

<%@ include file="includes/mid.jsp"%>

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

<%@ include file="includes/footer.jsp"%>