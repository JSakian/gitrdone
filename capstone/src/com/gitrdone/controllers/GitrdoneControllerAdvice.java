package com.gitrdone.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GitrdoneControllerAdvice{

	@ExceptionHandler
	public ModelAndView handleException (Exception ex) {
		System.out.println(ex.getMessage());
		
		StackTraceElement[] frames = ex.getStackTrace();
		for (StackTraceElement frame : frames) {
			System.out.println(frame);
		}
		
		ModelAndView mv = new ModelAndView("error",
										   "errorMessage",
										   ex.getMessage());
		return mv;
	}
	
	//TODO @InitBinder
	
}
