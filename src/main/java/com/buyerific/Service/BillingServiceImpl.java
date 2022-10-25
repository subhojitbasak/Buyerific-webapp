package com.buyerific.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buyerific.Entity.Billing;
import com.buyerific.Repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository billRepo;

	@Override
	public void saveOneBill(Billing billing) {
		billRepo.save(billing);

	}

}
