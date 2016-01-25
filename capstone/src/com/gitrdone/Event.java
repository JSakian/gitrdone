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
public class Event implements Serializable {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private String eventName;
	@Temporal (TemporalType.TIMESTAMP)
	private Date dateAndTime;
	@Lob
	private String description;
	@OneToMany
	ArrayList<Person> attendeesAndVolunteers = new ArrayList<Person>();
	
	public Event(){}
	
	public Event(String eventName, Date dateAndTime, String description){
		this.eventName = eventName;
		this.dateAndTime = dateAndTime;
		this.description = description;
				
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		eventName = eventName;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		description = description;
	}
}
