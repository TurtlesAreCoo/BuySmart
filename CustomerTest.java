public class CustomerTest{
	public static void main(String[] args) {
		CustomerTest test = new CustomerTest();
		test.setPhoneNumberTest();
		test.setEmailFailTest();
		test.setPasswordTest();
		test.setPasswordFailTest();
	}

	public void setPhoneNumberTest(){
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
		Customer cus = new Customer();
		cus.setPassword("testing");
		System.out.println("Expected "+ "Invalid" );
		System.out.println("Actual "+ cus.getPassword());
		if (cus.getPassword().equals("Invalid"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}
}