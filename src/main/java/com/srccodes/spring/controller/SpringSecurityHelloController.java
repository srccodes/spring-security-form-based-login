package com.srccodes.spring.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Abhijit Ghosh
 * @version 1.0
 */

@Controller
public class SpringSecurityHelloController {
	@RequestMapping("/secured/mypage")
	public String mypage(Model model, Principal principal) {
		String userName = principal.getName();
		model.addAttribute("message", "Hi " + userName + ", Welcome to 'Spring Security Custom Login Form Example'");

		return "secured/mypage";
	}
	
	@RequestMapping(value = "/logoutPage", method = RequestMethod.GET)
	public String logoutPage() {
		return "logoutPage";
	}
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	public String loginPage() {
		return "loginPage";
	}
}
