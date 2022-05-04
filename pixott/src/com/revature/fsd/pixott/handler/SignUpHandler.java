package com.revature.fsd.pixott.handler;

import com.revature.fsd.pixott.dao.UserDao;
import com.revature.fsd.pixott.model.User;

public class SignUpHandler {
	
	public static void display() {
		System.out.println("Enter Name:");
		String name=App.scanner.next();
		
		System.out.println("Enter MobileNumber:");
		String Mobile=App.scanner.next();
		
		System.out.println("Enter Password:");
		String password=App.scanner.next();
		UserDao dao = new UserDao();
		User user = new User();
	
		user.setName(name);
		user.setMobile(Mobile);
		user.setPassword(password);
		dao.signup(user);
		MainMenuHandler.display();

	}

}
