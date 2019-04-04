public class SiteUI {
	private Manager man;
	private CheckoutUI checkoutPage;
	private CreateAccountUI createAccountPage;
	private SearchUI searchPage; 
	private CompareItemUI compareItemPage;
	private AccountInfoUI accountInfoPage;
	private CheckOrdersUI OrderStatusPage;

	public SiteUI(){
		man = new Manager();
		checkoutPage = new CheckoutUI();
		createAccountPage = new CreateAccountUI();
		searchPage = new SearchUI();
		compareItemPage = new CompareItemUI();
		accountInfoPage = new AccountInfoUI();
		OrderStatusPage = new CheckOrdersUI();
	}

	public static void main(String[] args){
		SiteUI website = new SiteUI();
		website.gotoHome();
	}

	public void gotoHome(){
		this.displayHome();
	}

	public void displayHome(){
	}

	public void gotoCheckout(){
		checkoutPage.displayCheckoutPage();
	}

	public void gotoCreateAccount(){
		createAccountPage.displayCreateAccountPage();
	}

	public void gotoSearch(){
		searchPage.displaySearchPage();
	}
	
	public void gotoCompare(){
		compareItemPage.displayComparePage();
	}

	public void gotoAccountInfo(){
		accountInfoPage.displayAccountInfoPage();
	}

	public void gotoOrderStatus(){
		OrderStatusPage.displayOrders();
	}

	public void updateComparePage(){
		compareItemPage.updatePage();
	}
	
}