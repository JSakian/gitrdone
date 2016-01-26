package com.gitrdone;

import java.util.List;

public interface EventDAO {
	boolean create(Event obj);
	Event findById(long eventId);
	List<Event> getAll();
	boolean update(Event obj);
	boolean delete(Event obj);

}
