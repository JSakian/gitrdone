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
		System.out.println("Volunteering = " + attendeePerson.isVolunteering() + "for attendeePerson");
		/* ******** */
		mv.addObject("attendee", attendeePerson);
		return mv;
	}

	/**
	 * @return volunteer form for Person parameter input
	 */
	@RequestMapping(value = "/volunteer")
	public ModelAndView volunteer(@ModelAttribute ("volunteerPerson") Person volunteerPerson) {
		/*DEBUG CODE*/
		System.out.println("**********************************************");
		System.out.println("INSIDE /volunteer mapped method");
		System.out.println("----------------------------------------------");
		System.out.println("Volunteering is = " + volunteerPerson.isVolunteering() + " for volunteerPerson");
		/* ******** */
		ModelAndView mv = new ModelAndView ("volunteerForm");
		volunteerPerson.setVolunteering(true);
		/*DEBUG CODE*/
		System.out.println("setting to true...");
		System.out.println("Volunteering is now = " + volunteerPerson.isVolunteering() + " for volunteerPerson");
		
		volunteerPerson.setFirstName("Type in Howdy");
		System.out.println("setting firstName to " + volunteerPerson.getFirstName());
		
		volunteerPerson.setLastName("Don'tChange");
		System.out.println("setting lastName to " + volunteerPerson.getLastName());
		System.out.println("**********************************************");
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
	@RequestMapping(value = "/volunteerFormSubmission")
	public ModelAndView processVolunteerPerson(ModelAndView mv, @ModelAttribute ("volunteerPerson") Person volunteerPerson) {
	
		/*DEBUG CODE*/
		System.out.println("**********************************************");
		System.out.println("INSIDE /volunteerFormSubmission mapped  method");
		System.out.println("----------------------------------------------");
		/* ******** */
		
		if (volunteerPerson.isVolunteering() == true) {
			mv.setViewName("thankYou");
		} else {
			mv.setViewName("debug");
		}
		/*DEBUG CODE*/
		System.out.println("Volunteering is = " + volunteerPerson.isVolunteering() + " for volunteerPerson");
		System.out.println("Expected: \"true\" \n");
		System.out.println("Volunteer's name is = " + volunteerPerson.getFirstName());
		System.out.println("Expected: \"Howdy\" \n");
		System.out.println("Volunteer's name is = " + volunteerPerson.getLastName());
		System.out.println("Expected: \"Don'tChange\"");
		System.out.println("**********************************************");
		/* ******** */
		
		return mv;
	}

	//TODO place business logic from processVolunteerPerson method 
	@RequestMapping(value = "/attendeeFormSubmission")
	public ModelAndView processAttendeePerson(Person attendeePerson, ModelAndView mv) {
		if (attendeePerson.isVolunteering() == false) {
			mv.setViewName("thankYou"); }
		return mv;
	}
}