package com.buyerific.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buyerific.Entity.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
