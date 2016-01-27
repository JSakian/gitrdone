package com.gitrdone.persistence;

import java.util.List;

import com.gitrdone.beans.Event;
import com.gitrdone.beans.Person;

public interface ServiceIntf {
	
	List<Event> getAllEvents();
	Person createAnewPerson(Person obj);
}
