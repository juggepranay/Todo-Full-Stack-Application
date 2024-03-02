package com.simpleWebApplication.TODO;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean checkCredentails(String username , String Password) {
		
		boolean checkUser=username.equalsIgnoreCase("pranay");
		boolean checkPass=Password.equalsIgnoreCase("12345");
		
		
		return checkUser && checkPass;
	}

}
