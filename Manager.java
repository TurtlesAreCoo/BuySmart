public class Manager{

	public void shipItem(){}
	public void sendEmailConfirmation(){}
	public void verifyReturn(){}
	public void paymentProcess(){}
	public void verifyRefund(){}
	public void verifyCustomer(Customer cus){
		updateCustomerDatabase(cus);
	}
	public void updateCustomerDatabase(Customer newPerson){
		customerList.addCustomer(newPerson);
	}
	public void updateOrderDatabase(Order newOrder){ 
		orderList.addOrder(newOrder);
	}

}