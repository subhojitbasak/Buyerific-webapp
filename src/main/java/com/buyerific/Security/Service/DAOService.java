package com.buyerific.Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.buyerific.Security.Entity.User;
import com.buyerific.Security.Repository.SecurityRepository;

@Service
public class DAOService implements UserDetailsService {

	@Autowired
	private SecurityRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("User 404");
		}
		return new UserPrinciple(user);
		
	}
	
	

}
