package com.buyerific.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyerific.Entity.Contact;
import com.buyerific.Repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepository conRepo;

	@Override
	public void saveOneContact(Contact con) {
		conRepo.save(con);
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> con = conRepo.findAll();
		return con;
	}

	@Override
	public Contact getOneContact(long id) {
		Optional<Contact> contact = conRepo.findById(id);
		return contact.get();
	}


}
