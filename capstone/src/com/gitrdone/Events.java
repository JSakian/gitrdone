package com.gitrdone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Events implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private String eventName;
	@Temporal (TemporalType.TIMESTAMP)
	private Date date;
	@Lob
	private String description;
	@OneToMany
	ArrayList<Person> attendee = new ArrayList<Person>();
	
	public Events(){}
	
	public Events(String eventName, Date date, String description){
		this.eventName = eventName;
		this.date = date;
		this.description = description;
				
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		eventName = eventName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(String date) {
		date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		description = description;
	}
	
	
	

}
