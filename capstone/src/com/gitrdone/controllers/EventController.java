package com.gitrdone.controllers;

import java.text.ParseException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gitrdone.config.TestStuff;
import com.gitrdone.persistence.ServiceImpl;

@Controller
public class EventController {

	@Autowired
	ServiceImpl service; 
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/events")
		public ModelAndView processEvents() {
		ModelAndView mv = new ModelAndView("eventPage");
		mv.addObject("events", service.getAllEvents());
		System.out.println("this should have stuff: evetnslist is " + service.getAllEvents());
		return mv;
	}
}	
