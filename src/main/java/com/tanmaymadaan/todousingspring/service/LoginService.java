package com.tanmaymadaan.todousingspring.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateUser(String userId, String password) {
			return userId.equalsIgnoreCase("tanmay") 
					&& password.equalsIgnoreCase("hello");
	}
}
