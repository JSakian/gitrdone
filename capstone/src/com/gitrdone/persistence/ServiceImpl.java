package com.gitrdone.persistence;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.gitrdone.beans.Event;
import com.gitrdone.beans.Person;

public class ServiceImpl implements ServiceIntf {
	
	@Autowired 
	PersonDAOImpl persons;
	
	@Autowired 
	EventDAOImpl events;

	@Override
	public List<Event> getAllEvents(){
		return getAllEvents();
	}
	public Person createAnewPerson(Person obj){
		persons.insert(obj);
		return obj;
	}
}
