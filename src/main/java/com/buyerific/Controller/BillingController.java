package com.buyerific.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.buyerific.Entity.Billing;
import com.buyerific.Entity.Contact;
import com.buyerific.Service.BillingService;
import com.buyerific.Service.ContactService;

@Controller
public class BillingController {

	@Autowired
	private BillingService bSer;
	@Autowired
	private ContactService conSer;

	@RequestMapping("/generateBill")
	public String generateBill(@RequestParam("id") long id, Model model) {
		Contact contact = conSer.getOneContact(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}

	@RequestMapping("/generate")
	public String generateBilling(@ModelAttribute("billing") Billing billing, Model model) {
		bSer.saveOneBill(billing);
		return "list_contact";
	}

}
