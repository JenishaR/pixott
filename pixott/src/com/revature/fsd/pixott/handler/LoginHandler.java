package com.revature.fsd.pixott.handler;

import com.revature.fsd.pixott.dao.UserDao;
import com.revature.fsd.pixott.model.User;


public class LoginHandler {

	public static void display() {
		
		System.out.println("Enter MobileNumber:");
		String Mobile=App.scanner.next();
		
		System.out.println("Enter Password:");
		String password=App.scanner.next();
		
		UserDao dao = new UserDao();
		User user = dao.getUser(Mobile);
	    if (password.equals(user.getPassword())) {
	    	System.out.println("Login sucessfull");
	    	MenuDisplayHandler.display();
	    }
	    else {
	    	System.out.println("Invalid mobile or password");
	    }
	    }
}
		


	


