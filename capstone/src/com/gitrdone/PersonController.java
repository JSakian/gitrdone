package com.gitrdone;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	public ModelAndView attendee(@ModelAttribute ("attendeePerson") Person attendeePerson) {
		ModelAndView mv = new ModelAndView ("attendeeForm");
		mv.addObject("attendee", attendeePerson);
		return mv;
	}

	/**
	 * @return volunteer form for Person parameter input
	 */
	@RequestMapping(value = "/volunteer")
	public ModelAndView volunteer(@ModelAttribute ("volunteerPerson") Person volunteerPerson) {

		ModelAndView mv = new ModelAndView ("volunteerForm");		
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
	public ModelAndView processVolunteerPerson(ModelAndView mv,  /*TODO @Valid*/ Person volunteerPerson, BindingResult result) {
	
		if (result.hasErrors()) {  // validation fails; can't go on
			mv.setViewName("volunteerForm"); // allow user to retry form errors
			return mv;
		} else {
		volunteerPerson.setVolunteering(true);
		mv.setViewName("thankYou");		
		return mv;
		}
	}

	//TODO place business logic from processVolunteerPerson method 
	@RequestMapping(value = "/attendeeFormSubmission")
	public ModelAndView processAttendeePerson( ModelAndView mv,Person attendeePerson, BindingResult result) {
		
		if (result.hasErrors()) {  // validation fails; can't go on
			mv.setViewName("attendeeForm"); // allow user to retry form errors
			return mv;
		} else {
		attendeePerson.setVolunteering(false); //sohould already be false but here just as a precaution
		mv.setViewName("thankYou");		
		return mv;
		}
	}
}