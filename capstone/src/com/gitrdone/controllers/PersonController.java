package com.gitrdone.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gitrdone.beans.Person;
import com.gitrdone.persistence.ServiceImpl;

@Controller
public class PersonController {

	@Autowired
	ServiceImpl jpaServiceLayer;

	@RequestMapping(value = "/home")
	public ModelAndView form1() {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}

	@RequestMapping(value = "/admin")
	public ModelAndView form2() {
		ModelAndView modelAndView = new ModelAndView();
		return modelAndView;
	}

	/**
	 * 
	 * @param attendeePerson
	 * @return
	 */
	@RequestMapping(value = "/attendee")
	public ModelAndView attendee(
			@ModelAttribute("attendeePerson") Person attendeePerson) {
		ModelAndView mv = new ModelAndView("attendeeForm", "attendeePerson",
				new Person());
		System.out.println(attendeePerson);
		System.out.println("person made and sent to form");
		return mv;
	}

	/**
	 * 
	 * @param volunteerPerson
	 * @return
	 */
	@RequestMapping(value = "/volunteer")
	public ModelAndView volunteer(
			@ModelAttribute("volunteerPerson") Person volunteerPerson) {

		ModelAndView mv = new ModelAndView("volunteerForm", "volunteerPerson",
				new Person());
		// mv.addObject("volunteer", volunteerPerson);
		return mv;
	}

	/**
	 * 
	 * @param mv
	 * @param volunteerPerson
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/volunteerFormSubmission")
	public ModelAndView processVolunteerPerson(ModelAndView mv,
			@ModelAttribute("volunteerPerson") @Valid Person volunteerPerson,
			BindingResult result) {

		if (result.hasErrors()) { // validation fails; can't go on
			mv.setViewName("volunteerForm"); // allow user to retry form errors
			return mv;
		} else {
			jpaServiceLayer.createAnewPerson(volunteerPerson);
			volunteerPerson.setVolunteering(true);
			mv.setViewName("thankYou");
			return mv;
		}
	}

	/**
	 * 
	 * @param mv
	 * @param attendeePerson
	 * @param result
	 * @return
	 */
	@RequestMapping(value = "/attendeeFormSubmission")
	public ModelAndView processAttendeePerson(ModelAndView mv,
			@ModelAttribute("attendeePerson") @Valid Person attendeePerson,
			BindingResult result) {
			
			System.out.println(attendeePerson + "made it to the validating controller");
		
		
		if (result.hasErrors()) { // validation fails; can't go on
			mv.setViewName("attendeeForm"); // allow user to retry form errors
			System.out.println("attendee From has errors");
			return mv;
		} else {
			jpaServiceLayer.createAnewPerson(attendeePerson);
			attendeePerson.setVolunteering(false); // should already be false
													// but here just as a
													// precaution
			mv.setViewName("thankYou");
			return mv;
		}
	}
}