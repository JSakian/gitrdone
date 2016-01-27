package com.gitrdone;

import java.util.List;

public interface EventDAOIntf {
	void insert(Event obj);
	Event findById(long eventId);
	List<Event> getAll();
	void update(Event obj);
	void delete(Event obj);

}
