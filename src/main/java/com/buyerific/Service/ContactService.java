package com.buyerific.Service;

import java.util.List;

import com.buyerific.Entity.Contact;

public interface ContactService {
	void saveOneContact(Contact con);

	List<Contact> getAllContact();

	Contact getOneContact(long id);
	
	

}
