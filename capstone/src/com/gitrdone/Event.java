package com.gitrdone;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
	private int eventId;
	private String eventName;
	@Temporal (TemporalType.TIMESTAMP)
	private Date dateAndTime; 
	@Lob
	private String description;
	@OneToMany
	List<Person> attendeesAndVolunteers = new ArrayList<Person>();
	
	public Event(){}
	
	public Event(String eventName, String dateAndTime, String description) throws ParseException{
		this.eventName = eventName;
		this.description = description;

		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		this.dateAndTime = timeFormat.parse(dateAndTime);
	}
	

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public void setAttendeesAndVolunteers(ArrayList<Person> attendeesAndVolunteers) {
		this.attendeesAndVolunteers = attendeesAndVolunteers;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) throws ParseException{
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		this.dateAndTime = timeFormat.parse(dateAndTime);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Person> getAttendeesAndVolunteers() {
		return attendeesAndVolunteers;
	}

	public void setAttendeesAndVolunteers(List<Person> attendeesAndVolunteers) {
		this.attendeesAndVolunteers = attendeesAndVolunteers;
	}
}
