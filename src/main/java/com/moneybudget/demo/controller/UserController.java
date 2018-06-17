package com.moneybudget.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/users")
public class UserController {
	private static final Logger logger = LoggerFactory
			.getLogger(MainController.class);
	
	@RequestMapping(value = "/list")
	public String users(){
		
		logger.info("----- Accessed users/list page -----");
		return "users";
	}
	
}
