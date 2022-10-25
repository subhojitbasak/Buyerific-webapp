package com.buyerific.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buyerific.Entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
