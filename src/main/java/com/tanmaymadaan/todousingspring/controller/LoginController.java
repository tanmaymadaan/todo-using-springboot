package com.tanmaymadaan.todousingspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tanmaymadaan.todousingspring.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLoginMessage() {
//		model.put("name", name);
//		System.out.println("name is " + name);
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String showWelcomeMessage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		boolean isValidUser = service.validateUser(name, password);
		
		if(!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
//		System.out.println("name is " + name);
		return "welcomePage";
	}
}
