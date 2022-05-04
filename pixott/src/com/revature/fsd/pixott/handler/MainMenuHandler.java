package com.revature.fsd.pixott.handler;


public class MainMenuHandler {
	
	public static void display() {
		System.out.println("Main Menu");
		System.out.println("==========");
		System.out.println("1.Signup");
		System.out.println("2.Login");
		System.out.println("3. Exit");
		System.out.println("Enter Options");
		//scanner = new Scanner(System.in);
		int option =App.scanner.nextInt();
		if (option ==1) {
			//System.out.println("option");
			SignUpHandler.display();
		}
		if (option == 2) {
			LoginHandler.display();
		}
	
	}

}
