package com.login.registration.spring.boot.app.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.login.registration.spring.boot.app.service.UserService;
import com.login.registration.spring.boot.app.webdto.UserRegistrationDto;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/registration", produces = MediaType.TEXT_HTML_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public String showRegistrationForm() {
	return "redirect:/registration.html";
	}
	
	@PostMapping
	public String registrationDtoAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registraion?success";
	}
	

}
