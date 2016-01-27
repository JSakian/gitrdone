package persistence;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.gitrdone.Event;
import com.gitrdone.EventDAOImpl;
import com.gitrdone.PersonDAOImpl;

public class SerivceImpl implements ServiceInt {
	
	@Autowired
	EntityManagerFactory emf;
	
	@Autowired 
	PersonDAOImpl persons;
	
	@Autowired 
	EventDAOImpl events;

	@Override
	public List<Event> getAllEvents(){
		return getAllEvents();
	}
}
