package com.buyerific.Service;

import com.buyerific.Entity.Lead;

public interface LeadService {

	void saveOneLead(Lead lead);

	java.util.List<Lead> getAllLead();

	Lead findById(long id);

	void deleteById(long id);

}
