public class CustomerTest{
	public static void main(String[] args) {
		CustomerTest test = new CustomerTest();
		test.setPhoneNumberTest();
		System.out.println("");
		test.setEmailFailTest();
		System.out.println("");
		test.setPasswordTest();
		System.out.println("");
		test.setPasswordFailTest();
		System.out.println("");
		test.setAddressTest();
		System.out.println("");
		test.setPostalCodeTest();
		System.out.println("");
		test.verifyEmailTest();
		System.out.println("");
		test.verifyNameTest();
		System.out.println("");
		test.verifyPhoneNumberTest();
	}
	public void verifyEmailTest(){
		System.out.println("Test: Verify Email");
		Customer cus = new Customer();
		cus.setEmail("dank123@memes.com");
		System.out.println("Expected "+ "true");
		System.out.println("Actual "+cus.checkEmail("dank123@memes.com"));
		if (cus.checkEmail("dank123@memes.com"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void verifyNameTest(){
		System.out.println("Test: Verify Name");
		Customer cus = new Customer();
		cus.setEmail("Evan Zhou");
		System.out.println("Expected "+ "true");
		System.out.println("Actual "+cus.checkName("Evan Zhou"));
		if (cus.checkName("Evan Zhou"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void verifyPhoneNumberTest(){
		System.out.println("Test: Veryfy Phone Numnber");
		Customer cus = new Customer();
		cus.setEmail("1234567890");
		System.out.println("Expected "+ "true");
		System.out.println("Actual "+cus.checkPhoneNumber("1234567890"));
		if (cus.checkPhoneNumber("1234567890"))
			System.out.println("Passed");
		else
			System.out.println("Failed");

	}

	public void setPhoneNumberTest(){
		System.out.println("Test: Set Phone Number");
		Customer cus = new Customer();
		cus.setPhoneNumber("6471112233");
		System.out.println("Expected "+ "6471112233" );
		System.out.println("Actual "+ cus.getPhoneNumber());
		if (cus.getPhoneNumber().equals("6471112233"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void setEmailFailTest(){
		System.out.println("Test: Set Email Fail");
		Customer cus = new Customer();
		cus.setEmail("Kingsley111gmailcom");
		System.out.println("Expected "+ "Invalid" );
		System.out.println("Actual "+ cus.getEmail());
		if (cus.getEmail().equals("Invalid"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void setPasswordTest(){
		System.out.println("Test: Set Password");
		Customer cus = new Customer();
		cus.setPassword("Testing123");
		System.out.println("Expected "+ "Testing123" );
		System.out.println("Actual "+ cus.getPassword());
		if (cus.getPassword().equals("Testing123"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}
	public void setPasswordFailTest(){
		System.out.println("Test: Set Password Fail");
		Customer cus = new Customer();
		cus.setPassword("testing");
		System.out.println("Expected "+ "Invalid" );
		System.out.println("Actual "+ cus.getPassword());
		if (cus.getPassword().equals("Invalid"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void setAddressTest(){
		System.out.println("Test: Set Address");
		Customer cus = new Customer();
		cus.setPassword("111 Street Road");
		System.out.println("Expected "+ "111 Street Road");
		System.out.println("Actual "+ cus.getEmail());
		if (cus.getPassword().equals("111 Street Road"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void setPostalCodeTest(){
		System.out.println("Test: Set Postal Code");
		Customer cus = new Customer();
		cus.setPostalCode("M1M 1M1");
		System.out.println("Expected "+ "M1M 1M1");
		System.out.println("Actual "+ cus.getPostalCode());
		if (cus.getPostalCode().equals("M1M 1M1"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

}