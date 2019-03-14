public class SiteUI {
	CustomerDatabase customerList;
	OrderDatabase orderList;
	Bank bank;
	Manager man;

	public SiteUI(){
		customerList = new CustomerDatabase();
		orderList = new OrderDatabase();
		bank = new Bank();
		man = new Manager();
	}

	public static void main(String[] args){
		SiteUI website = new SiteUI();
		website.gotoHome();
	}

	public void gotoHome(){
		displayHome();
	}

	public void displayHome(){
	}

	public void gotoCheckout(){
		CheckoutUI newPage = new CheckoutUI();
		newPage.displayCheckoutPage();
	}

	public void gotoCreateAccount(){
		CreateAccountUI newPage = new CreateAccountUI();
		newPage.displayCreateAccountPage();
	}

	public void gotoSearch(){
		SearchUI newPage = new SearchUI();
		newPage.displaySearchPage();
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
		String  phoneNumber="";
		Customer newPerson = new Customer(name,email,password,address,postalCode,phoneNumber);
		man.verifyCustomer(newPerson);
	}
	
}