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

	public void updateCustomerDatabase(Customer newPerson){
		customerList.addCustomer(newPerson);
	}
	public void updateOrderDatabase(Order newOrder){ 
		orderList.addOrder(newOrder);
	}

}