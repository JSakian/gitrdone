package com.gitrdone;

import java.io.Serializable;

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
	@Temporal(TemporalType.TIMESTAMP)
	private String Date;
	@Lob
	private String Description;
	@OneToMany
	String Attendee;
	
	public Events(){}
	
	public Events(String EventName, String Date, String Description){
		this.EventName = EventName;
		this.Date = Date;
		this.Description = Description;
				
	}

	public String getEventName() {
		return EventName;
	}

	public void setEventName(String eventName) {
		EventName = eventName;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
	
	

}
