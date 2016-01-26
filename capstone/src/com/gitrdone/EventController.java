package com.gitrdone;

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
//	@RequestMapping(value = "/events")
//		public ModelAndView events() {
//		ModelAndView mv = new ModelAndView("eventPage");
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jdbc");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		mv.addObject("events", entityManager.createQuery("SELECT e FROM Event e").getResultList());
//		return mv;
//	}
	
}
