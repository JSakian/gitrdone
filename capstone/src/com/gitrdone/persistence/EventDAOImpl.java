package com.gitrdone.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.gitrdone.beans.Event;

public class EventDAOImpl implements EventDAOIntf {
	
	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public void insert(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		try {
		System.out.println("In EventDAOImpl.update(Event)" + trans);
		trans.begin();
		em.persist(obj);
		trans.commit();
		System.out.println("Event " + obj.getEventName() + " inserted successfully");			
		}
		catch (Exception ex) {
			trans.rollback();
		
			System.out.println("Rollback due to [" + ex + "]");	
		}
		finally {
			em.close();
		}
	}
	//TODO fix this 
//	@Override
//	public Event findById(long eventId) {
//		EntityManager em = emf.createEntityManager();
//		Event obj = null;
//		obj = em.find(Event.class, eventId);
//		em.close();
//		return event;
//	}

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
