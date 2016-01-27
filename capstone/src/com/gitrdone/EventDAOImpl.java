package com.gitrdone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class EventDAOImpl implements EventDAOIntf {

	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public void insert(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		System.out.println("In EventDAOImpl.update(Event)" + trans);
		trans.begin();
		em.persist(obj);
		trans.commit();
		em.close();
		System.out.println("Event " + obj.getEventName() + " inserted successfully");
	}

	@Override
	public Event findById(long eventId) {
		EntityManager em = emf.createEntityManager();
		Event event = em.find(Event.class, 1L);
		em.close();
		return event;
	}

	@Override
	public List<Event> getAll() {
		System.out.println("In EventDAOImpl.getAll()");
		EntityManager em = emf.createEntityManager();
		List<Event> events = em.createQuery("SELECT e FROM Event e", Event.class).getResultList();
		em.close();
	    return events;
	}

	@Override
	public void update(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		System.out.println("In EventDAOImpl.update(Event)" + trans);
		trans.begin();
		em.merge(obj);
		trans.commit();
		System.out.println("Event " + obj.getEventName() + " updated successfully");
		em.close();
	}

	@Override
	public void delete(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		System.out.println("In EventDAOImpl.delete(Event)" + trans);
		trans.begin();
		em.remove(obj);
		trans.commit();
		System.out.println("Event " + obj.getEventName() + " deleted successfully");
		em.close();
	}


}
