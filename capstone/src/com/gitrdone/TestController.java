package com.gitrdone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value="/TestController")
	public @ResponseBody String testController() {
		return " The test controller is working";	
	}

//	@RequestMapping(value="/lotto")
//	public ModelAndView runLottery() {
//		ModelAndView mv = new ModelAndView("lottoResults");
//		mv.addObject("lotteryParameters", new lottery())
//		return mv;
//	}
}
