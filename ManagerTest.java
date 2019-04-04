public class ManagerTest{
	public static void main(String[] args){
		ManagerTest test = new ManagerTest();
		test.createOrderTest();
		System.out.println("");
		test.getOrderTest();
		System.out.println("");
		test.getCustomerTest();
		System.out.println("");
		test.createCustomerTest();
	}

	public static void createOrderTest(){
		System.out.println("Test: Create Order"); 
		Manager man = new Manager();
		man.createNewOrder("123456",true,"test123@test.ca");


		System.out.println("Expected " + "Size: 1");
		System.out.println("Actual Size: " + man.getOrderDBSize());
		if (man.getOrderDBSize()==1)
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}

	public static void getOrderTest(){
		System.out.println("Test: Get Order"); 
		Manager man = new Manager();
		man.createNewOrder("123456",true,"test123@test.ca");
		Order temp = man.getOrder("123456","test123@test.ca");

		System.out.println("Expected " + "Order ID: 123456 And Email: test123@test.ca");
		System.out.println("Actual Order ID:"+ temp.getOrderID()+" And Email: " + temp.getEmail());
		if (temp.getOrderID().equals("123456") && temp.getEmail().equals("test123@test.ca"))
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}

	public static void getCustomerTest(){
		System.out.println("Test: Get Customer"); 
		Manager man = new Manager();
		man.createNewCustomer("Evan Zhou", "test123@test.ca", "Testing123", "123 Road Street", "A1A 1A1", "1231239876");
		Customer temp = man.getAccount("test123@test.ca");

		System.out.println("Expected "+"Name: Evan Zhou  Email: test123@test.ca");
		System.out.println("Actual Name: " + temp.getName() + "  Email: "+ temp.getEmail());
		if (temp.getName().equals("Evan Zhou") && temp.getEmail().equals("test123@test.ca"))
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}

	public static void createCustomerTest(){
		System.out.println("Test: Create Customer"); 
		Manager man = new Manager();
		man.createNewCustomer("Evan Zhou", "test123@test.ca", "Testing123", "123 Road Street", "A1A 1A1", "1231239876");
		System.out.println("Expected "+"Size: 1");
		System.out.println("Actual Size: "+man.getCustomerDBSize());
		if (man.getCustomerDBSize()==1)
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}
}