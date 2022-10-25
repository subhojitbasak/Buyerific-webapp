package com.buyerific.Security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemController {

	@RequestMapping("/")
	public String home() {
		return "create_lead";
	}

	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/logout-sucess")
	public String logoutPage() {
		return "logout";
	}

}
