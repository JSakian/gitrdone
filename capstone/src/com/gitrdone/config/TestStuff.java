package com.gitrdone.config;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.gitrdone.beans.Event;
import com.gitrdone.persistence.EventDAOImpl;

public class TestStuff {

	@Autowired
	EventDAOImpl EventDAO;
	
	@Autowired
	EntityManagerFactory emf;

	public void populateEventTable() {
		try {
			// create name, date, description
			Event event1 = new Event ("Taco Party", "2015-01-31 13:00",
									  "Learn the rich history of San Antonio's" +
									  "cursed Taco Palace and enjoy a free T-shirt!" +
									  " /n tacos not provided");

			Event event2 = new Event ("Pool Noodle Bananza", "2001-01-20 12:30",
					  				  "Who new pool noodles were so versitl? " +
					  				  "Come join others for our 40 hour workshop!");
	
			Event event3 = new Event ("DAO Dinner", "2018-15-15 01:45",
									  "Who new pool noodles were so versitl? " +
									  "Come join others for our 40 hour workshop!");

//			persistEvent(event1);
//			persistEvent(event2);
			EventDAO.insert(event1);
			EventDAO.insert(event2);
			EventDAO.insert(event3);
			}
			catch (ParseException ex){
				System.out.println("there's an exception: " + ex);
				
			} 
			
			finally {
				System.out.println("was there an exception?");
			}
			}
		
	//just old code that is good reference for debugging
//		private void persistEvent(Event event) { 
//					
//			EntityManager em = emf.createEntityManager(); 
//			EntityTransaction trans = em.getTransaction(); 
//			
//			try { 
//			System.out.println("Starting Event: " + event.getEventName() + " transaction"); 	
//			trans.begin(); 
//			em.merge(event); 
//			trans.commit(); 
//			System.out.println("Commited Event " + event.getEventName() + " transaction successfully");
//			} 
//			catch (Exception ex) { 
//			trans.rollback(); 
//			System.out.println("Rollback due to [" + ex + "]"); 
//			} 
//			finally { 
//			em.close(); 
//	 		} 
//		} 
}

