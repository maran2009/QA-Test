package bankAssessment;
import java.util.Scanner;


public class account extends createAccount  {
	
	private double amount;

	public void account() {
		
		amount = 0.0;
	}
	
	
// deposit
	public void depoist (double balance ) {
		balance = balance + amount;
	}
	
	// withdraw
	
	public void withDraw (double balance) {
		if (amount >= balance) {
			System.out.println (" request valid");
		balance = balance - amount;}
		
		else {
			System.out.println (" Check your bank balance!");
		}
	}

	// get or set balance
	
	public double getAmount() {
		return amount;
	}



}


