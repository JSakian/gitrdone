package com.gitrdone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class EventDAOImpl implements EventDAO {

	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public void create(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(obj);
		trans.commit();
	}

	@Override
	public Event findById(long eventId) {
		return emf.createEntityManager().find(Event.class, 1L);
	}

	@Override
	public List<Event> getAll() {
	    return emf.createEntityManager().createQuery("SELECT e FROM Event e", Event.class).getResultList();
	}

	@Override
	public void update(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.merge(obj);
		trans.commit();
	}

	@Override
	public void delete(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.remove(obj);
		trans.commit();
	}


}
