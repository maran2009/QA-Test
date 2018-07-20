package bankAssessment;

public class createAccount {
	

	String firstName;
	String lastName;
	String address;
	int accountNumber;
	String typeOfAccount;
	int pinNumber;
	
	
	// constructor

public createAccount(String firstName, String lastName, String address, int accountNumber, String typeOfAccount, int pinNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.accountNumber = accountNumber;
		this.typeOfAccount = typeOfAccount;
		this.pinNumber = pinNumber;
	}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getTypeOfAccount() {
	return typeOfAccount;
}

public void setTypeOfAccount(String typeOfAccount) {
	this.typeOfAccount = typeOfAccount;
}


 public int getPinNumber() {
	return pinNumber;
}

public void setPinNumber(int pinNumber) {
	this.pinNumber = pinNumber;
}

 void displayInformation() {
	 
	 System.out.println ("Customer First Name " + firstName);
	 System.out.println ("Customer Last Name" + lastName);
	 System.out.println ("Customer address" + address);
	 System.out.println ("Customer Account Number" + accountNumber);
	 System.out.println("Customer typeof Account" + typeOfAccount);
	 
	 
	 
 }
 }
		
	

	

