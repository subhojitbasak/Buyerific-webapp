package com.buyerific.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buyerific.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
