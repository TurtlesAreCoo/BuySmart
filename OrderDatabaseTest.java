public class OrderDatabaseTest{
	public static void main(String[] args){
		OrderDatabaseTest test = new OrderDatabaseTest();
		test.addOrderTest();
		System.out.println(""); 
		test.verifyOrderTest();
		System.out.println(""); 
		test.verifyOrderFail();
		System.out.println(""); 
		test.getSizeTest();
		System.out.println(""); 
		test.getOrderTest();
	}

	public void addOrderTest(){
		System.out.println("Test: Add Order"); 
		OrderDatabase orderDB = new OrderDatabase();
		Order cart = new Order();
		System.out.println("Expected Before: 0");
		System.out.println("Actual Before  : "+orderDB.getSize());
		orderDB.addOrder(cart);
		System.out.println("Expected After: 1");
		System.out.println("Actual After  : "+orderDB.getSize());
		if (orderDB.getSize() == 1)
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}

	public void verifyOrderTest(){
		System.out.println("Test: Verify Order"); 
		OrderDatabase orderDB = new OrderDatabase();
		Order cart = new Order();
		cart.setEmail("Kingsley111@gmail.com");
		orderDB.addOrder(cart);
		System.out.println("Expected: True");
		System.out.println("Actual  : "+orderDB.verifyOrder(cart,"Kingsley111@gmail.com"));
		if (orderDB.verifyOrder(cart,"Kingsley111@gmail.com"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void verifyOrderFail(){
		System.out.println("Test: Verify Order FAIL"); 
		OrderDatabase orderDB = new OrderDatabase();
		Order cart = new Order();
		cart.setEmail("Kingsley111@gmail.com");
		orderDB.addOrder(cart);
		System.out.println("Expected: False");
		System.out.println("Actual  : "+orderDB.verifyOrder(cart,"Kingsley000@gmail.com"));
		if (!orderDB.verifyOrder(cart,"Kingsley000@gmail.com"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void getSizeTest(){
		System.out.println("Test: Get Order Size"); 
		OrderDatabase orderDB = new OrderDatabase();
		Order cart = new Order();
		System.out.println("Expected Before: 0");
		System.out.println("Actual Before  : "+orderDB.getSize());
		orderDB.addOrder(cart);
		cart.setOrderID("000001");
		orderDB.addOrder(cart);
		cart.setOrderID("000002");
		orderDB.addOrder(cart);
		cart.setOrderID("000003");
		orderDB.addOrder(cart);
		cart.setOrderID("000004");
		System.out.println("Expected After: 4");
		System.out.println("Actual After  : "+orderDB.getSize());
		if (orderDB.getSize() == 4)
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}

	public void getOrderTest(){
		System.out.println("Test: Get Order"); 
		Order cart = new Order();
		OrderDatabase orderDB = new OrderDatabase();
		orderDB.addOrder(cart);
		Order dank = orderDB.getOrder("000000","Johndoe@gmail.com");
		if (dank.getOrderID().equals("000000")){
			System.out.println("Correct ID");
			if (dank.getEmail().equals("Johndoe@gmail.com")){
				System.out.println("Correct Email");
				System.out.println("Passed");
			} else {
				System.out.println("Failed");
			}
		} else {
			System.out.println("Failed");
		}
	}
}