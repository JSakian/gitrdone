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
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long personId;
	@Size(min=2, max=30, message = "Please enter your first name.")
	private String firstName = "";
	@Size(min=2, max=30, message = "Please enter your last name")
	private String lastName  = "";
	@Email(message = "Invalid email address.")
	private String email     = "";
	@Size(min =10, max=10, message= "210*******")
	private String phone     = "";
	@Lob
	private String comments  = "";
	@ManyToOne(cascade = CascadeType.ALL)
	private Event event = new Event();
	private boolean volunteering = false;
	
	public Person (){}
	
	public Person (String firstName, String lastName, String email, String phone,
			String comments, boolean volunteer) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.comments = comments;
		this.volunteering = volunteer;
	}


public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

public Event getEvent() {
	return event;
}

public void setEvent(Event event) {
	this.event = event;
}

public boolean isVolunteering() {
	return volunteering;
}

public void setVolunteering(boolean volunteering) {
	this.volunteering = volunteering;
}


}