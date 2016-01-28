package com.gitrdone.config;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gitrdone.beans.Event;
import com.gitrdone.beans.Person;
import com.gitrdone.persistence.EventDAOImpl;
import com.gitrdone.persistence.PersonDAOImpl;


@Controller
public class TestStuff {

	@Autowired
	EventDAOImpl eventDAO;
	
	@Autowired
	PersonDAOImpl personDAO;
	
	@Autowired
	EntityManagerFactory emf;

	
	@RequestMapping(value = "/genevents")
	public void populateEventTable() {
		try {
			Event event1 = new Event ("Taco Party", "2015-01-31 13:00",
									  "Learn the rich history of San Antonio's" +
									  "cursed Taco Palace and enjoy a free T-shirt!" +
									  " /n tacos not provided");

			Event event2 = new Event ("Pool Noodle Bananza", "2001-01-20 12:30",
					  				  "Who new pool noodles were so versitl? " +
					  				  "Come join others for our 40 hour workshop!");
	
			Event event3 = new Event ("DAO Dinner", "2018-03-15 01:45",
									  "Who new pool noodles were so versitl? " +
									  "Come join others for our 40 hour workshop!");

			eventDAO.insert(event1);
			eventDAO.insert(event2);
			eventDAO.insert(event3);
		}
		catch (ParseException ex){
			System.out.println("there's an exception: " + ex);
				
		} 
	}
		
	
	@RequestMapping(value="/genPersons")
	public void populatePeronTable() {
		
		try {
			Person person1 = new Person("John", "Conners", "hoax@email.fake",
										"1234567890", "comment 1", true);
			
			Person person2 = new Person("Sally", "May", "Sally@May.com",
										"0987654321", "comment 2", false);
			
			Person person3 = new Person("Lord", "Brian", "Doctor@Person.edu",
										"13867239456", "comment 3", true);
		
			personDAO.insert(person1);
			personDAO.insert(person2);
			personDAO.insert(person3);
		}
		catch (Exception ex){
			System.out.println("there's an exception: " + ex);
		}
		
	}
	
	
	@RequestMapping(value = "/exceptionTest")
	public void throwingexeption() throws Exception {
		throw new Exception("You've caught the test exception");
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

