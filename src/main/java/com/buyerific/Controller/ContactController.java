package com.buyerific.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.buyerific.Entity.Contact;
import com.buyerific.Service.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService conService;

	@RequestMapping("/contactInfo")
	public String contactInfo(@RequestParam("id") long id, Model model) {
		Contact oneContact = conService.getOneContact(id);
		model.addAttribute("contact", oneContact);
		return "contactInfo";

	}

	@RequestMapping("/composeEmail")
	public String emailPage(@RequestParam("id") long id, Model model) {
		Contact contact = conService.getOneContact(id);
		model.addAttribute("contact", contact);
		return "compose_email";
	}

}
