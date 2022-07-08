package com.login.registration.spring.boot.app.serviceIml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.registration.spring.boot.app.model.User;
import com.login.registration.spring.boot.app.repository.UserRepository;
import com.login.registration.spring.boot.app.service.UserService;
import com.login.registration.spring.boot.app.webdto.UserRegistrationDto;
@Service
public class UserServiceIml implements UserService{

	@Autowired
	private  UserRepository userRepository;
	
	@Override
	public User save(UserRegistrationDto registrationdto) {
		User user=new User();
		user.setFirstName(registrationdto.getFirstName());
		user.setLastName(registrationdto.getLastName());
		user.setEmail(registrationdto.getEmail());
		user.setPassword(registrationdto.getPassword());
		return userRepository.save(user);
		
	}

}
