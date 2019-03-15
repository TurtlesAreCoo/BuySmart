public class ItemTest{
	public static void main(String[] args){ 
		ItemTest test = new ItemTest();
		test.setPriceTest();
		test.setCodeTest();
		test.setNameTest();
		test.newItemTest();
	}
	public void setPriceTest(){
		Item item1 = new Item();
		item1.setItemPrice(1.11);
		System.out.println("Expected: "+"1.11");
		System.out.println("Actual: "+ Double.toString(item1.getItemPrice()));
		if((item1.getItemPrice()) == 1.11)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void setPriceFail(){
		Item item1 = new Item();
		item1.setItemPrice(-1.23);
		System.out.println("Expected: 0.00");
		System.out.println("Actual  : "+ item1.getItemPrice());
		if (item.getItemPrice()==0)
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void setCodeTest(){
		Item item1 = new Item();
		item1.setItemCode("11223344");
		System.out.println("Expected: "+"11223344");
		System.out.println("Actual: "+ item1.getItemCode());
		if (item1.getItemCode().equals("11223344"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void setNameTest(){
		Item item1 = new Item();
		item1.setItemName("Apple");
		System.out.println("Expected: "+"Apple");
		System.out.println("Actual: "+ item1.getItemName());
		if (item1.getItemName().equals("Apple"))
			System.out.println("Passed");
		else
			System.out.println("Failed");
	}

	public void newItemTest(){
		Item item1 = new Item();
		boolean passed = true;
		System.out.println("Expected: "+ "no Item");
		System.out.println("Expected: "+ "N/a");
		System.out.println("Expected: "+ "0.00");
		System.out.println("Actual: "+ item1.getItemName());
		System.out.println("Actual: "+ item1.getItemCode());
		System.out.println("Actual: "+ Double.toString(item1.getItemPrice()));
		if (!item1.getItemName().equals("no Item"))
			passed = false;
		if (!item1.getItemCode().equals("N/a"))
			passed = false;
		if (item1.getItemPrice()!=0.00)
			passed = false;
		if (passed)
			System.out.println("Passed");
		else
			System.out.println("Failed");

	}


}