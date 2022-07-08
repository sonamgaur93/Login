package com.login.registration.spring.boot.app.service;

import com.login.registration.spring.boot.app.model.User;
import com.login.registration.spring.boot.app.webdto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationdto);

}
