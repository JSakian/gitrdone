package com.gitrdone.persistence;

import java.util.List;

import com.gitrdone.beans.Event;

public interface EventDAOIntf {
	void insert(Event obj);
	//TODO under construction
//	Event findById(long eventId);
	List<Event> getAll();
	void update(Event obj);
	void delete(Event obj);

}
