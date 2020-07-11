package com.tanmaymadaan.todousingspring.web.service;

public class LoginService {

	public boolean validateUser(String userId, String password) {
			return userId.equalsIgnoreCase("tanmay") 
					&& password.equalsIgnoreCase("hello");
	}
}
