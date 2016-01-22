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
	@Size(min=2, max=30)
	private String firstName = "";
	@Size(min=2, max=30)
	private String lastName  = "";
	@Email
	private String email     = "";
	@Size(max=10)
	private String phone     = "";
	@Lob
	private String comments  = "";
	@ManyToOne(cascade = CascadeType.ALL)
	private ArrayList<Event> attendingEvents = new ArrayList<Event>();
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