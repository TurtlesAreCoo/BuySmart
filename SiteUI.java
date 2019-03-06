public class SiteUI {
	CustomerDatabase customerList;
	OrderDatabase orderList;

	public SiteUI(){
		customerList = new CustomerDatabase();
		orderList = new OrderDatabase();
	}

	public void createOrder(){
		
	}

	public void processPayment(){

	}

	public void chooseShipping(){
		
	}
	/**
	 * get the values from the user
	 */
	public void createNewCustomer(){
		String name = "";
		String email = "";
		String password= "";
		String address= "";
		String postalCode= "";
		int phoneNumber= "";
		Customer newPerson = new Customer(name,email,password,address,postalCode,phoneNumber);
		updateCustomerDatabase(newPerson);
	}

	public void updateCustomerDatabase(Customer newPerson){
		customerList.addCustomer(newPerson);
	}
	public void updateOrderDatabase(Order newOrder){ 
		orderList.addOrder(newOrder);
	}
	
}