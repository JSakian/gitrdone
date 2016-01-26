package com.gitrdone;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Person implements Serializable {
<<<<<<< Updated upstream
	
	private static final String NUMERALS = "0123456789";
	
=======

>>>>>>> Stashed changes
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	@Size(min = 2, max = 30, message = "Please enter your first name.")
	private String firstName = "";
	@Size(min = 2, max = 30, message = "Please enter your last name")
	private String lastName = "";
	@Email(message = "Invalid email address.")
	private String email = "";
	@Size(min = 10, max = 10, message = "210*******")
	private String phone = "";
	@Lob
	private String comments = "";
	@ManyToOne
	private ArrayList<Event> attendingEvents = new ArrayList<Event>();
	private boolean volunteering = false;

	public Person() {
	}

	public Person(long personId, String firstName, String lastName, String email,
			String phone, String comments, boolean volunteer) {
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.comments = comments;
		this.volunteering = volunteer;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

<<<<<<< Updated upstream
public void setFirstName(String firstName) {
	if (firstName.length() > 254) {
		throw new ValidationError("First Name must be less than 255 characters.");
	}
	this.firstName = firstName;
}
=======
	public String getFirstName() {
		return firstName;
	}
>>>>>>> Stashed changes

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

<<<<<<< Updated upstream
public void setLastName(String lastName) {
	if (lastName.length() > 254) {
		throw new ValidationError("Last Name must be less than 255 characters.");
	}
	this.lastName = lastName;
}
=======
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
>>>>>>> Stashed changes

	public String getEmail() {
		return email;
	}

<<<<<<< Updated upstream
public void setEmail(String email) {
	if (email.length() > 254) {
		throw new ValidationError("Email must be less than 255 characters.");
	}
	if (
		email.length() < 5 ||
		email.indexOf("@") == -1 ||
		email.lastIndexOf("@") != email.indexOf("@") ||
		email.lastIndexOf(".") < email.indexOf("@")
	) {
		throw new ValidationError("Invalid email address");
	}
	this.email = email;
}
=======
	public void setEmail(String email) {
		this.email = email;
	}
>>>>>>> Stashed changes

	public String getPhone() {
		return phone;
	}

<<<<<<< Updated upstream
public void setPhone(String phone) {
	if (phone == null) {
		this.phone = "";
		return;
	}
	String filtered = "";
	for (int i = 0; i < phone.length(); i++) {
		if (NUMERALS.indexOf(phone.substring(i, i + 1)) != -1) {
			filtered += phone.substring(i, i + 1);
		}
	}
	if (phone.equals("")) {
		this.phone = "";
		return;
	}
	if (
		phone.length() < 10 ||
		phone.length() > 13
	) {
		throw new ValidationError("Invalid phone number");
	}
	this.phone = phone;
}
=======
	public void setPhone(String phone) {
		this.phone = phone;
	}
>>>>>>> Stashed changes

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public ArrayList<Event> getAttendingEvents() {
		return attendingEvents;
	}

	public void setAttendingEvents(ArrayList<Event> attendingEvents) {
		this.attendingEvents = attendingEvents;
	}

	public boolean isVolunteering() {
		return volunteering;
	}

	public void setVolunteering(boolean volunteering) {
		this.volunteering = volunteering;
	}

}