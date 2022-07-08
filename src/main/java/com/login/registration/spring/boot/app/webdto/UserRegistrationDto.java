package com.login.registration.spring.boot.app.webdto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserRegistrationDto {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	

}
