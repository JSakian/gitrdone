package com.gitrdone;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Person implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private String firstName;

	private String lastName;
	private String email;
	private String phone;
	@Lob
	private String comments;
	@ManyToOne
	private Events eventName;
	private boolean volunteering;
	

	
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

public Events getEvent() {
	return eventName;
}

public void setEvent(Events eventName) {
	this.eventName = eventName;
}

public boolean isVolunteering() {
	return volunteering;
}

public void setVolunteering(boolean volunteering) {
	this.volunteering = volunteering;
}

}