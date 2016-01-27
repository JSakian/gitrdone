package com.gitrdone.config;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.gitrdone.Event;

public class TestStuff {

	@Autowired
	EntityManagerFactory emf;

	void populateEventTable() {
		try {
			// create name, date, description
			Event event1 = new Event ("Taco Party", "2015-01-31 13:00",
									  "Learn the rich history of San Antonio's" +
									  "cursed Taco Palace and enjoy a free T-shirt!" +
									  " /n tacos not provided");

			Event event2 = new Event ("Pool Noodle Bananza", "2001-01-20 12:30",
					  				  "Who new pool noodles were so versitl? " +
					  				  "Come join others for our 40 hour workshop!");
		
			persistEvent(event1);
			persistEvent(event2);	
			}
			catch (ParseException ex){
				return mv;
				
			} 
			
			finally {
				return mv;
			}
			
		
		private void persistEvent(Event event) { 
					
			EntityManager em = emf.createEntityManager(); 
			EntityTransaction trans = em.getTransaction(); 
			
			try { 
			System.out.println("Starting Event: " + event.getEventName() + " transaction"); 	
			trans.begin(); 
			em.merge(event); 
			trans.commit(); 
			System.out.println("Commited Event " + event.getEventName() + " transaction successfully");
			} 
			catch (Exception ex) { 
			trans.rollback(); 
			System.out.println("Rollback due to [" + ex + "]"); 
			} 
			finally { 
			em.close(); 
	 		} 
			} 
		
	}

		
		
		
	}
}
