package bankAssessment;

import java.util.ArrayList;

public class mainBank {
	
	public static void main (String args[]) {
		
	//	createAccount firstCustomer = new createAccount("Maran"," muru", "ockely", 123456, "sliver");
		
	//System.out.println(createAccount.display);	
		
		
		createAccount person1 = new createAccount("Maran"," muru", "ockely", 123456, "sliver",1234);
		createAccount person2 = new createAccount("ma"," mu", "x1", 654321, "sliver",4321);
		createAccount person3 = new createAccount("Maran"," muru", "ockely", 123456, "sliver",1234);
		createAccount person4 = new createAccount("ma"," mu", "x1", 654321, "sliver",4321);
		
		ArrayList<createAccount> customer = new ArrayList<createAccount>();
		
		customer.add(person1);
		customer.add(person2);
		customer.add(person3);
		customer.add(person4);
		
		
		for (int i = 0; i <customer.size(); i++) {
			System.out.println (customer.get(i));
			
		}
		
	}

}
