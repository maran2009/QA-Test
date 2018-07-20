package bankAssessmentTest;

import static org.junit.Assert.*;

import org.junit.Test;

import bankAssessment.login;

public class loginTest {
	
	@Test
	
	public void testingLogin () {
		
		login testing = new login ();
		assertEquals("Invalid pin format", testing.getPinNumber(), 1234);
		assertEquals("Invalid account format", testing.getAccountNumber(),1234567);
		
		
	}

}
