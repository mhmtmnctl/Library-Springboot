package com.library.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	Logger logger= LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
	@GetMapping("/welcome")
	public String welcome(HttpServletRequest request) {
		logger.warn("-------------Welcome{}",request.getServletPath());
		return "Welcome user! :)";
	}
	
	
	
	
	
}
