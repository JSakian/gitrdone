package com.gitrdone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController {

	/**
	 * @return the events page so the user may select an event
	 */
	@RequestMapping(value = "/events")
		public ModelAndView events() {
		ModelAndView mv = new ModelAndView("eventPage");
		//TODO What objects, if any, do I add for the eventPage.jsp?
		return mv;
	}
	
}
