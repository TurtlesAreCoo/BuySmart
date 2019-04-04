public class Manager{
	private CustomerDatabase customerList;
	private OrderDatabase orderList;
	private Bank bank;

	public Manager(){
		customerList = new CustomerDatabase();
		orderList = new OrderDatabase();
		bank = new Bank();
	}
	
	public void shipItem(){}
	public void sendEmailConfirmation(){}
	public void verifyReturn(){}
	public void paymentProcess(){}
	public void verifyRefund(){}
	public Item searchItem(String itemName){ return new Item(); }

	public void createNewCustomer(String name, String email, String password, String address, String postalCode, String phoneNumber){
		Customer newPerson = new Customer(name,email,password,address,postalCode,phoneNumber);
		this.updateCustomerDatabase(newPerson);

	}

	public void createNewCustomer(){
		String name = "";
		String email = "";
		String password= "";
		String address= "";
		String postalCode= "";
		String  phoneNumber="";
		Customer newPerson = new Customer(name,email,password,address,postalCode,phoneNumber);
		this.updateCustomerDatabase(newPerson);
	}

	public void createNewOrder(String orderID, boolean standard, String email){
		Order newOrder = new Order(orderID,standard,email);
		this.updateOrderDatabase(newOrder);
	}

	public void addItemToOrder(String orderID,String email, Item item){
		Order temp = orderList.getOrder(orderID,email);
		temp.addItem(item);
		this.updateOrderDatabase(temp);
	}

	public void updateCustomerDatabase(Customer newPerson){
		customerList.addCustomer(newPerson);
	}
	
	public void updateOrderDatabase(Order newOrder){ 
		orderList.addOrder(newOrder);
	}

	public Order getOrder(String email, String id){
		return orderList.getOrder(email,id);
	}

	public Customer getAccount(String email){
		return customerList.getCustomer(email);
	}

	public int getCustomerDBSize(){
		return customerList.getSize();
	}

	public int getOrderDBSize(){
		return orderList.getSize();
	}
}