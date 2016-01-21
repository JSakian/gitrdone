package com.gitrdone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

	/**
	 * @return the events page so the user may select an event
	 */
	@RequestMapping(value = "/events")
		public ModelAndView events() {
		ModelAndView mv = new ModelAndView("eventPage");
		//TODO What objects, if any, do I add for the eventPage.jsp?
		return mv;
	}
	
	/**
	 * @return attendee form for Person parameter input
	 */
	@RequestMapping(value = "/attendee")
	public ModelAndView attendee() {
		ModelAndView mv = new ModelAndView ("attendeeForm");
		Person attendeePerson = new Person();
		attendeePerson.setVolunteering(false);
		
		
		/*DEBUG CODE*/
		System.out.println(attendeePerson.isVolunteering());
		/* ******** */
		
		mv.addObject("attendee", attendeePerson);
		return mv;
	}

	/**
	 * @return volunteer form for Person parameter input
	 */
	@RequestMapping(value = "/volunteer")
	
	public ModelAndView volunter() {
		ModelAndView mv = new ModelAndView ("volunteerForm");
		Person volunteerPerson = new Person();
		volunteerPerson.setVolunteering(true);
		
		/*DEBUG CODE*/
		System.out.println(volunteerPerson.isVolunteering());
		/* ******** */
		
		mv.addObject("volunteer", volunteerPerson);
		return mv;
	}

//TODO use annotation for binding
//	Attempting to use @ModelAttribute instead of addObject()
//	@RequestMapping(value= "/volunteer")
//	public ModelAndView volunteer(@ModelAttribute("volunteerPerson") Person volunteer) {
//		volunteer.setVolunteering(true);
//	}
//	
	/**
	 * @return attendee or volunteer specific thank you page
	 */
	@RequestMapping(value = "/formSubmission")
		public ModelAndView processPerson/*(@RequestParam*/(Person person) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", person);
		
		if (person.isVolunteering() == true) {
			mv.setViewName("volunteerThankyou");}
		
		if (person.isVolunteering() == false) {
			mv.setViewName("attendeeThankyou"); }
		
		return mv;
		//TODO 
		/*find out if you need an additional method here
		 * or if you need an additional controller in this
		 * controller to reroute the user to the "tryAgain.jsp" page...*/
	}

}
