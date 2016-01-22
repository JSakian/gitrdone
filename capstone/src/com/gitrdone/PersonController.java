package com.gitrdone;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
	
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

	/**
	 * @return attendee or volunteer specific thank you page
	 */
	@RequestMapping(value = "/volunteerFormSubmission")
	public ModelAndView processVolunteerPerson(ModelAndView mv,  @Valid Person volunteerPerson, BindingResult result) {
	
		if (result.hasErrors()) {  // validation fails; can't go on
			mv.setViewName("volunteerForm"); // allow user to retry form errors
			return mv;
		} else {
		volunteerPerson.setVolunteering(true);
		mv.setViewName("thankYou");		
		return mv;
		}
	}

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