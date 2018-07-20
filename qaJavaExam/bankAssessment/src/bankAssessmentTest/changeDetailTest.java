package bankAssessmentTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import bankAssessment.changeDetail;


public class changeDetailTest {
	
	@Test
		public void testchangeDetailsString () {
			 
			 changeDetail testingAccount = new changeDetail();
			 assertNotNull(testingAccount.getFirstName()); 
			 assertNotNull(testingAccount.getLastName());
			 assertNotNull (testingAccount.getAddress());
			// assertNotNull (testingAccount.getAccountNumber());
			 assertNotNull (testingAccount.getTypeOfAccount());
			 
		 }
		 @Test
		 public void testChangeDetailsGetValue () {
			 changeDetail testing = new changeDetail();
			 assertNull (testing.getFirstName()); 
			 assertNull (testing.getLastName());
			 assertNull(testing.getAddress());
			 assertNull(testing.getAccountNumber());
			// assertNull(testing.getTypeOfAccount());
			// assertNull (testing.getPinNumber());
		 }
		 
		 @Test
		 
		 public void testChangeDetailsSetValue () {
			changeDetail testing = new changeDetail() ;
			
			assertEquals("first Name Tesing failed", testing.getFirstName(),"maran" );
			assertEquals("Last Name Tesing failed", testing.getLastName(),"Muru");
			assertEquals("Address Tesing failed", testing.getAddress(), "Ockely");
			assertEquals("Account Number Testing failed", testing.getAccountNumber(), 123456);
			assertEquals("Account Type Tesing failed", testing.getTypeOfAccount(), "basic");
			assertEquals("pin Number Testing failed",testing.getPinNumber(), 1234);
			

			 
			 
		 }	
		
	}


