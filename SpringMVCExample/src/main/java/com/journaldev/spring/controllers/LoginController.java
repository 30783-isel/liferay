package com.journaldev.spring.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login2", method = RequestMethod.GET)
	public ModelAndView login() {
		
		logger.info("login()");
		
		ModelAndView mv = new ModelAndView("login/login");
		return mv;
	}
}
