package bankAssessment;

import java.util.Scanner;

public class changeDetail extends login {
	
	int [] arrayofOptions = new int [5];
	
	char choice;
	Scanner sc = new Scanner (System.in);
	
	do {
		
		
		System.out.println (" please slect the following options to ammend your personal information");
		System.out.println ("option 0 :- FirstName  option 1: - LastName  option 2: Address" );
		System.out.println ("option 3 :- Account Type  option 4: - pin Number  option 5: Help" );
		
		int option = sc.nextInt();
		
		if (option == 0) {
			System.out.println("Enter your First name");
			
		}
		else if (option == 1) {
			System.out.println("Enter your Last name");
			
		}
		
		else if (option == 2) {
			System.out.println("Enter your Address");
		}
		else if (option ==3) {
			System.out.println(" Enter the current account Type");
			
		}
		else if (option == 4) {
			System.out.println("Enter your new pin number");
			int enterNewpin = sc.nextInt();
			
			if (enterNewpin ==4 ) { // && != pinNumber (from createAccount options )
				System.out.println ("New pin number has changed");
			}
			else {
				System.out.println ("Invalid information");
			}
			
		}
		else if (option ==5) {
			System.out.println("Help");
		}
		else {
			
			System.out.println("Please select the available options");
			
		}
		
		
		System.out.println ("would you like to make any other changes ?");
		System.out.println("if yes, press 'y' or 'Y' otherwise press any letter to terminate the program ");
		choice = sc.next().charAt(0);
		
	}while ((choice == 'Y') || (choice == 'y'));
	System.out.println ("Thank You ");
	sc.close();
	
	
	
	
}
}
