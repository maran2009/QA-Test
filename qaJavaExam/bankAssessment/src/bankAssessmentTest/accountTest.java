package bankAssessmentTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import bankAssessment.account;

public class accountTest {
	
	@Test 
	
	public void testAccount() {
		
		account accountTesting = new account ();
		assertEquals("Test failed", accountTesting.getAmount(), 22.22);
	}
	
	
	

}
