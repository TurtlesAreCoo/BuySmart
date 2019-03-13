public class CustomerDBTest{
	public static void main(String[] args) {
		CustomerDBTest test = new CustomerDBTest();
		test.addCustomerTest();
		test.getCustomerTest();
		test.removeCustomerTest();
		test.getSizeTest();
	}
	public void addCustomerTest(){
		CustomerDatabase testDB = new CustomerDatabase();
		Customer cus = new Customer("Evan Zhou","evan99@gmail.com","Password123","111 Dank Meme","A1A 1A1","1112223333");
		testDB.addCustomer(cus);
		System.out.println("Expected: Size: 1");
		System.out.println("Actual:   Size: "+testDB.getSize());
		if (testDB.getSize()==1)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}
	public void getCustomerTest(){
		CustomerDatabase testDB = new CustomerDatabase();
		Customer cus = new Customer("Evan Zhou","evan99@gmail.com","Password123","111 Dank Meme","A1A 1A1","1112223333");
		testDB.addCustomer(cus);
		Customer newOne = testDB.getCustomer(cus.getEmail());
		if (cus.getName().equals(newOne.getName())){
			if (cus.getPhoneNumber().equals(newOne.getPhoneNumber())){
				if (cus.getEmail().equals(newOne.getEmail())){
					if (cus.getPassword().equals(newOne.getPassword())){
						if (cus.getAddress().equals(newOne.getAddress())){
							if (cus.getPostalCode().equals(newOne.getPostalCode())){
								if (cus.getPhoneNumber().equals(newOne.getPhoneNumber())){
									System.out.println("Passed");
								} else {
									System.out.println("Failed");
								}
							} else {
								System.out.println("Failed");
							}	
						} else {
							System.out.println("Failed");	
						}
					} else {
						System.out.println("Failed");	
					}
				} else {
					System.out.println("Failed");
				}	
			} else {
					System.out.println("Failed");	
				}
		} else {
				System.out.println("Failed");	
		}
	}
	public void removeCustomerTest(){
		CustomerDatabase testDB = new CustomerDatabase();
		Customer cus = new Customer("Evan Zhou","evan99@gmail.com","Password123","111 Dank Meme","A1A 1A1","1112223333");
		testDB.addCustomer(cus);
		System.out.println("Expected Size Before: 1");
		System.out.println("Actual Size Before: "+testDB.getSize());
		testDB.removeCustomer(cus.getEmail());
		System.out.println("Expected Size After: 0");
		System.out.println("Actual Size After: "+testDB.getSize());
		if (testDB.getSize()==0)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}
	public void getSizeTest(){
		CustomerDatabase testDB = new CustomerDatabase();
		Customer cus = new Customer("Evan Zhou","evan99@gmail.com","Password123","111 Dank Meme","A1A 1A1","1112223333");
		testDB.addCustomer(cus);
		cus.setEmail("evan10@gmail.com");
		testDB.addCustomer(cus);
		cus.setEmail("evanevan@gmail.com");
		testDB.addCustomer(cus);
		System.out.println("Expected: Size: 3");
		System.out.println("Actual:  Size: "+testDB.getSize());
		if (testDB.getSize()==3)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}
}