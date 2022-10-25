package com.buyerific.Controller;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.buyerific.Entity.Contact;
import com.buyerific.Entity.Lead;
import com.buyerific.Service.ContactService;
import com.buyerific.Service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private ContactService contactService;
	
//	// Default login page
//	//localhost:8080/
//	@RequestMapping("/login")
//	public String loginPage() {
//		return "login";
//	}
//	//upon submission of login form
	//localhost:8080/login
	@RequestMapping("/create_lead")
	public String LeadPage() {
		return "create_lead";
		
	}
//	
	@RequestMapping("/listallLead")
	public String listallPage(ModelMap model) {
		List<Lead> leads = leadService.getAllLead();
		model.addAttribute("leads", leads);
//		System.out.println(leads.username);
		return "listall";
	}
	
	@RequestMapping("/save")
	public String saveOneLead(@ModelAttribute("lead") Lead lead) {
		
		leadService.saveOneLead(lead);
		return "create_lead";
		
	}
	@RequestMapping("/findOneLead")
	public String findOneLead(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.findById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convert")
	public String convertLead(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.findById(id);
		Contact con = new Contact();
		con.setUsername(lead.getUsername());
		con.setEmail(lead.getEmail());
		con.setMobile(lead.getMobile());		
		contactService.saveOneContact(con);
		leadService.deleteById(id);
		List<Contact> contact = contactService.getAllContact();
		model.addAttribute("contact", contact);
		return "list_contact";
		
	}
	

}
