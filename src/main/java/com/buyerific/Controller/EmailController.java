package com.buyerific.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.buyerific.Utility.EmailService;

@Controller
public class EmailController {
	@Autowired
	private EmailService emailService;
	
	@RequestMapping("/send")
	public String sendEmail(@RequestParam("to") String to, @RequestParam("sub") String sub, @RequestParam("body") String body, ModelMap model) {
		emailService.sendEmail(to, sub, body);
		model.addAttribute("msg", "mail sent!!");
		return "compose_email";
		
	}

}
