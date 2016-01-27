package com.gitrdone.persistence;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.gitrdone.beans.Event;

public class ServiceImpl implements ServiceIntf {
	
	@Autowired 
	PersonDAOImpl persons;
	
	@Autowired 
	EventDAOImpl events;

	@Override
	public List<Event> getAllEvents(){
		return getAllEvents();
	}
}
