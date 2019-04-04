public class Manager{
	private CustomerDatabase customerList;
	private OrderDatabase orderList;
	private Bank bank;

	
	public void shipItem(){}
	public void sendEmailConfirmation(){}
	public void verifyReturn(){}
	public void paymentProcess(){}
	public void verifyRefund(){}

	public Manager(){
		customerList = new CustomerDatabase();
		orderList = new OrderDatabase();
		bank = new Bank();
	}

	public void verifyCustomer(Customer cus){
		updateCustomerDatabase(cus);
	}

	public void updateCustomerDatabase(Customer newPerson){
		customerList.addCustomer(newPerson);
	}
	
	public void updateOrderDatabase(Order newOrder){ 
		orderList.addOrder(newOrder);
	}

	public void getItem(){
	}

	public void getAccount(){

	}
}