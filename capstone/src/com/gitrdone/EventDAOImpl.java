package com.gitrdone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class EventDAOImpl implements EventDAO{

	@Autowired
	EntityManagerFactory emf;
	
	@Override
	public boolean create(Event obj) {
		System.out.println("In EventJpaImpl.create()");
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		boolean result = true;  // optimistic
		
		try {
		System.out.println("In EventDaoJpaImpl.create()" + trans);
			trans.begin();
			em.persist(obj);
			trans.commit();
		}
		 catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback due to [" + ex + "]");
			result = false;
		}
		finally {
			em.close();
		}
		return result;
	}

	@Override
	public Event findById(long eventId) {
		EntityManager em = emf.createEntityManager();
        Event obj = null;
		
		try {
			obj = em.find(Event.class, 1L);
    	    }
		 catch (Exception ex) {
			System.out.println("SQL Error [" + ex + "]");
		}
		finally {
			em.close();
		}
		return obj;
	}

	@Override
	public List<Event> getAll() {
		EntityManager em = emf.createEntityManager();
		List<Event> result = new ArrayList<>();
		TypedQuery<Event> query = em.createQuery("SELECT e FROM EntityA e",Event.class);
	    List<Event> results =(List<Event>)query.getResultList( );
	    if (results != null && !results.isEmpty()) {
	    	return results;
	    }
	    else
	    	return null;
	}

	@Override
	public boolean update(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		boolean result = true;
		
		try {
			trans.begin();
			em.merge(obj);
			trans.commit();
		}
		 catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback due to [" + ex + "]");
			result = false;
		}
		finally {
			em.close();
		}
		return result;
	}

	@Override
	public boolean delete(Event obj) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction trans = em.getTransaction();
		boolean result = true;
		
		try {
			trans.begin();
			em.remove(obj);
			trans.commit();
		}
		 catch (Exception ex) {
			trans.rollback();
			System.out.println("Rollback due to [" + ex + "]");
			result = false;
		}
		finally {
			em.close();
		}
		return result;

	}


}
