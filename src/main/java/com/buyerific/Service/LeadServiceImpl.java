package com.buyerific.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyerific.Entity.Lead;
import com.buyerific.Repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOneLead(Lead lead) {
		leadRepo.save(lead);
		
	}

	@Override
	public List<Lead> getAllLead() {
		List<Lead> findAll = leadRepo.findAll();
		return findAll;
	}

	@Override
	public Lead findById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		return findById.get();
	}

	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);
		
	}

}
