package com.gitrdone.persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.gitrdone.beans.Person;

public class PersonDAOImpl implements PersonDAOIntf {

		@Autowired
		EntityManagerFactory emf;
		
		@Override
		public void insert(Person obj){
			System.out.println("In PersonDAOImpl.insert(Person)");
			EntityManager em = emf.createEntityManager();
			EntityTransaction trans = em.getTransaction();
			
			try {
				System.out.println("In PersonDAOImpl.insert()" + trans);
				trans.begin();
				em.persist(obj);
				trans.commit();
				System.out.println("Person " + obj.getEmail() + " inserted successfully");
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
//		@Override
//		public Person findById(long personId){
//			EntityManager em = emf.createEntityManager();
//	        Person obj = null;
//			
//			try {
//				obj = em.find(Person.class, personId);
//	    	    }
//			 catch (Exception ex) {
//				System.out.println("SQL Error [" + ex + "]");
//			}
//			finally {
//				em.close();
//			}
//			return obj;
//			
//		}
	
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
		public void update(Person obj){
			EntityManager em = emf.createEntityManager();
			EntityTransaction trans = em.getTransaction();
			
			try {
				System.out.println("In PersonDAOImpl.update(Person)" + trans);
				trans.begin();
				em.merge(obj);
				trans.commit();
			}
			 catch (Exception ex) {
				trans.rollback();
				System.out.println("Rollback due to [" + ex + "]");
			}
			finally {
				em.close();
				System.out.println("Person " + obj.getEmail() + " updated successfully");
			}
		}
		@Override
		public void delete(Person obj){
			EntityManager em = emf.createEntityManager();
			EntityTransaction trans = em.getTransaction();
	
			try {
				System.out.println("In PersonDAOImpl.update(Person)"  + trans);
				trans.begin();
				em.remove(obj);
				trans.commit();
			}
			 catch (Exception ex) {
				trans.rollback();
				System.out.println("Rollback due to [" + ex + "]");			
			}
			finally {
				em.close();
				System.out.println("Event " + obj.getEmail() + " deleted successfully");
			}
		}

}
