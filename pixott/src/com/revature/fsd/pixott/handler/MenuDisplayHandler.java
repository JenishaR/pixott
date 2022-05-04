package com.revature.fsd.pixott.handler;

public class MenuDisplayHandler {
	public static void display() {
		System.out.println("Menu");
		System.out.println("****");
		System.out.println("1. View Top 5 Movies");
		System.out.println("2. Search movies");
		System.out.println("3. View Histry");
		System.out.println("4. View WishList");
		System.out.println("5. Logout");
		System.out.println("Enter Your Option:");
		int opt=App.scanner.nextInt();
		switch(opt) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("Logging Out....");
			MainMenuHandler.display();
			break;
		
		}
	}

}
