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
	String FirstName;
	String LastName;
	String Email;
	String Phone;
	@Lob
	String Comments;
	@ManyToOne
	Person Event;
	boolean Volunteer;
	
	public Person (){}
	
	public Person (String FirstName, String LastName, String Email, String Phone,
			String Comments, boolean Volunteer) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Phone = Phone;
		this.Comments = Comments;
		this.Volunteer = Volunteer;
	}


}
