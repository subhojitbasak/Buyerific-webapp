package com.buyerific.Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buyerific.Security.Entity.User;

public interface SecurityRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);


}
