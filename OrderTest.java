public class OrderTest{
	public static void main(String[] args){
		OrderTest test = new OrderTest();
		test.setOrderIDTest();
		test.setSShippingTest();
		test.setEShippingTest();
		test.setEmailTest();
		test.addItemTest();
	}
	public void setOrderIDTest(){
		Order order = new Order();
		order.setOrderID("123456");
		System.out.println("Expected "+"123456");
		System.out.println("Actual "+order.getOrderID());
		if (order.getOrderID().equals("123456"))
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}
	public void setSShippingTest(){
		Order order = new Order();
		order.setShipping("Standard");
		System.out.println("Expected "+"Standard");
		System.out.println("Actual "+order.getShipping());
		if (order.getShipping().equals("Standard"))
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}
	public void setEShippingTest(){
		Order order = new Order();
		order.setShipping("Express");
		System.out.println("Expected "+"Express");
		System.out.println("Actual "+order.getShipping());
		if (order.getShipping().equals("Express"))
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}
	public void setEmailTest(){
		Order order = new Order();
		order.setEmail("Kingsley111@gmail.com");
		System.out.println("Expected "+"Kingsley111@gmail.com");
		System.out.println("Actual "+order.getEmail());
		if (order.getEmail().equals("Kingsley111@gmail.com"))
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}

	public void addItemTest(){
		Order order = new Order();
		Item item = new Item();
		item.setItemName("Apple");
		order.addItem(item);
		System.out.println("Expectd Size: 1");
		System.out.println("Actual  SIze: "+order.getSize());
		if (order.getSize()==1)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

}