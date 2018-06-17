package com.moneybudget.demo.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class MainController {
    private static final Logger logger = LoggerFactory
			.getLogger(MainController.class);
 
	/*Logger and response body testing------
	 
	@RequestMapping(value= "/")
	@ResponseBody
	public String index() {
		logger.info("Sample Info Message");
		logger.debug("Sample Debug Message");
		logger.trace("Sample Trace Message");
		return "Response Body Sample";
	}*/
  
	
	/*controller parameter testing-------
	 * public String home(ModelMap model,HttpServletRequest request, HttpServletResponse response,HttpSession session) {*/
    
    @RequestMapping(value= "/", method = RequestMethod.GET)
	public String home(Principal principal) {
    	String username = new String();
    	if (principal == null) {
    		username = "guest";
    	}
    	else {
    		username = principal.getName();
    	}
    	logger.info("logged in: " + username);
		logger.info("----- Accessed home page -----");
		return "home";
	}
    
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {
		
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");
  
        logger.info("----- Accessed login page -----");
        return "login";
    }
	
}
