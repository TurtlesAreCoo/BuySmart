import java.util.ArrayList;

public class Order { 
	private int orderID;
	private String shipping;
	private String email;
	 
	public void setOrderID(int ID){
		orderID = ID;
	}

	public int getOrderID(){
		return orderID;
	}

	public void setShipping(String ship) {
		shipping = ship;
	}

	public String getShipping(){
		return shipping;
	}

	public void setEmail(String e){
		email = e;
	}

	public String getEmail(){
		return email;
	}
}