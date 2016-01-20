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
	String firstName;
	String lastName;
	String email;
	String phone;
	@Lob
	String comments;
	@ManyToOne
	Person event;
	boolean volunteering;
	
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


}
