package com.moneybudget.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory
			.getLogger(MainController.class);
 
	/*Logger and response body testing
	 
	@RequestMapping(value= "/")
	@ResponseBody
	public String index() {
		logger.info("Sample Info Message");
		logger.debug("Sample Debug Message");
		logger.trace("Sample Trace Message");
		return "Response Body Sample";
	}*/
  
	@RequestMapping(value= "/", method = RequestMethod.GET)
	/*controller parameter testing
	 * public String home(ModelMap model,HttpServletRequest request, HttpServletResponse response,HttpSession session) {*/
	public String home(ModelMap model) {
		String name = "Noreen";
		model.addAttribute("name", name);
		logger.info("----- Accessed home page -----");
		return "home";
	}
	
	@RequestMapping(value = "/users")
	public String users(){
		logger.info("----- Accessed users page -----");
		return "users";
	}
	
}
