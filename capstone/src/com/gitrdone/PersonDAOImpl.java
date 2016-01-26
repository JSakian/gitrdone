package com.gitrdone;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

public class PersonDAOImpl implements PersonDAO {

		@Autowired
		EntityManagerFactory emf;
		
		@Override
		public boolean create(Person obj){
			System.out.println("In PersonDAOImpl.create()");
			EntityManager em = emf.createEntityManager();
			EntityTransaction trans = em.getTransaction();
			boolean result = true;  // optimistic
			
			try {
			System.out.println("In PersonADaoJpaImpl.create()" + trans);
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
		public Person findById(long personId){
			EntityManager em = emf.createEntityManager();
	        Person obj = null;
			
			try {
				obj = em.find(Person.class, 1L);
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
		public List<Person> getAll(){
			EntityManager em = emf.createEntityManager();
			List<Person> result = new ArrayList<>();
			TypedQuery<Person> query = em.createQuery("SELECT e FROM EntityA e",Person.class);
		    List<Person> results =(List<Person>)query.getResultList( );
		    if (results != null && !results.isEmpty()) {
		    	return results;
		    }
		    else
		    	return null;
			
		}
		@Override
		public boolean update(Person obj){
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
		public boolean delete(Person obj){
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
