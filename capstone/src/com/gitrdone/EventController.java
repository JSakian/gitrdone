package com.gitrdone;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController {

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/events")
		public ModelAndView processEvents() {
		ModelAndView mv = new ModelAndView("eventPage");
		
			
			
			Test.populateEventTable();
			
			
			
			try {
			// create name, date, description
			Event event1 = new Event ("Taco Party", "2015-01-31 13:00",
									  "Learn the rich history of San Antonio's" +
									  "cursed Taco Palace and enjoy a free T-shirt!" +
									  " /n tacos not provided");

			Event event2 = new Event ("Pool Noodle Bananza", "2001-01-20 12:30",
					  				  "Who new pool noodles were so versitl? " +
					  				  "Come join others for our 40 hour workshop!");
		
			Event event3 = new Event ("Pool Noodle Bananza", "2001-01-20 12:30",
	  				  				  "Who new pool noodles were so versitl? " +
	  				  				  "Come join others for our 40 hour workshop!");
			
			persistEvent(event1);
			persistEvent(event2);	
			new EventDAOImpl.
			
			
			mv.addObject("events", em.createQuery("SELECT e FROM Event e").getResultList());
			
			/* ******** */
			/*DEBUG CODE*/
			System.out.println(mv.getModelMap());
			/* ******** */
			}			
			
			catch (ParseException ex){
				//TODO log e into console
				return mv;
			} 
			
			finally {
				return mv;
			}
			
	}
			private void persistEvent(Event event) { 
				EntityManager em = DBUtil.getEmFactory().createEntityManager(); 
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
