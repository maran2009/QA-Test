package bankAssessment;

import java.util.Scanner;

public class login extends createAccount {
	
	char choice;
	Scanner sc = new Scanner (System.in);
	 
	do {
	//System.out.println (" Welcome to ATM Machine withdraw Money service ");
		
	System.out.println ("Enter Your Account Number");
	int enterAccountNumber = sc.nextInt();
	System.out.println ("Enter your pin Number");
	int enterPin = sc.nextInt();
	
	if (accountNumber == enterAccountNumber && pinNumber == pinNumber) {
		
		System.out.println (" Valid information, Successfully login");
			do {
		
		System.out.println ("Please select the option : - 1. Account Balance.   2.Change Details");
		int option = sc.nextInt();
		
		if (option == 1) {
			
			// Account Summary
			// call the account class to perform depoist, withdraw, view summary options
		
		}
		
		else if (option == 2) {
			
			// Change personal information
			// call the the change account details class 
		}
		else {
			
			System.out.println ("please select only available options");
			
		}
		
			System.out.println ("would you like to continue ?");
			System.out.println("if yes, press 'y' or 'Y' otherwise press any letter to terminate the program ");
			choice = sc.next().charAt(0);
			
	}while ((choice == 'Y') || (choice == 'y'));
	System.out.println ("Thank You");
	
	sc.close();
	
	}
	
	else if (accountNumber != enterAccountNumber || pinNumber != pinNumber) {
		System.out.println (" Invalid , Please enter the correct information");
	}
	
	else {
		System.out.println (" Invalid");
		
	}
	
	System.out.println ("would you like to continue ?");
	System.out.println("if yes, press 'y' or 'Y' otherwise press any letter to terminate the program ");
	choice = sc.next().charAt(0);

	}
	while ((choice == 'Y') || (choice == 'y'));
	System.out.println ("Thank You");
	
	sc.close();
		

		
	}}



