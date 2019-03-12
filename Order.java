import java.util.ArrayList;

public class Order { 
	private String orderID;
	private boolean standard;
	private boolean express;
	private String email;
	private ArrayList<Item> cart;
	
	public Order(){
		orderID="000000";
		standard = true;
		express = false;
		email="Johndoe@gmail.com";
		cart = new ArrayList<Item>();
	}
	public void setOrderID(String ID){
		orderID = ID;
	}

	public String getOrderID(){
		return orderID;
	}

	public void setShipping(String ship) {
		if (ship.toLowerCase().equals("standard")){
			standard = true;
			express = false;
		} else if (ship.toLowerCase().equals("express")){
			standard = false;
			express = true;
		} else { 
			standard = true;
			express = false;
		}
	}

	public String getShipping(){
		if (standard)
			return "Standard";
		else if (express)
			return "Express";
		return "Standard";
	}

	public void setEmail(String e){
		email = e;
	}

	public String getEmail(){
		return email;
	}

	public void addItem(Item item1){
		cart.add(item1);
	}

	public Item getItem(String name){
		int num = cart.indexOf(name);
		Item temp = cart.get(num);
		return temp;
	}
}