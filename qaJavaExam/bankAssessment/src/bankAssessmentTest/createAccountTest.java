package bankAssessmentTest;
import static org.junit.Assert.*;
import org.junit.Test;

import bankAssessment.createAccount;


public class createAccountTest {
	
 @Test
 
 public void testAccountString () {
	 
	 createAccount testingAccount = new createAccount("StringValueFName", "StringValueLN", "StringAddress", 123456, "StringType", 1234);
	 assertNotNull(testingAccount.getFirstName()); 
	 assertNotNull(testingAccount.getLastName());
	 assertNotNull (testingAccount.getAddress());
	// assertNotNull (testingAccount.getAccountNumber());
	 assertNotNull (testingAccount.getTypeOfAccount());
	 
 }
 @Test
 public void testGetValue () {
	 createAccount testing = new createAccount ("maran", "muru", "ockely", 123456, "basic", 1234);
	 assertNull (testing.getFirstName()); 
	 assertNull (testing.getLastName());
	 assertNull(testing.getAddress());
	 assertNull(testing.getAccountNumber());
	// assertNull(testing.getTypeOfAccount());
	// assertNull (testing.getPinNumber());
 }
 
 @Test
 
 public void testSetValue () {
	createAccount testing = new createAccount("maran", "muru", "ockely", 123456, "basic", 1234) ;
	/*testing.setFirstName("Maran");
	testing.setLastName("Muru");
	testing.setAddress("Ockely");
	testing.setAccountNumber(12345);
	testing.setTypeOfAccount("Sliver");*/
	
	assertEquals("first Name Tesing failed", testing.getFirstName(),"maran" );
	assertEquals("Last Name Tesing failed", testing.getLastName(),"Muru");
	assertEquals("Address Tesing failed", testing.getAddress(), "Ockely");
	assertEquals("Account Number Testing failed", testing.getAccountNumber(), 123456);
	assertEquals("Account Type Tesing failed", testing.getTypeOfAccount(), "basic");
	assertEquals("pin Number Testing failed",testing.getPinNumber(), 1234);
	

	 
	 
 }
 
 
 
 

	
	

}
