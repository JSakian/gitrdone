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
	private String EventName;
	@Temporal (TemporalType.TIMESTAMP)
	private Date date;
	@Lob
	private String Description;
	@OneToMany
	ArrayList<Person> Attendee = new ArrayList<Person>();
	
	public Events(){}
	
	public Events(String EventName, Date date, String Description){
		this.EventName = EventName;
		this.date = date;
		this.Description = Description;
				
	}

	public String getEventName() {
		return EventName;
	}

	public void setEventName(String eventName) {
		EventName = eventName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(String date) {
		date = date;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}
